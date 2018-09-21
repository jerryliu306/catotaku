package top.catotaku.search.service;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.catotaku.common.core.StrKit;
import top.catotaku.search.dao.SearchMapper;
import top.catotaku.search.dao.impl.SearchIndexDao;
import top.catotaku.search.interfaces.SearchIndexService;
import top.catotaku.search.pojo.dto.PageInfo;
import top.catotaku.search.pojo.vo.CommodityVO;

import java.io.IOException;
import java.util.List;

@Service
public class SearchIndexServiceImpl implements SearchIndexService {

    @Autowired
    private SearchMapper searchMapper;

    @Autowired
    private SearchIndexDao searchIndexDao;

    @Autowired
    private SolrServer solrServer;

    @Override
    public void uploadIndex() throws IOException, SolrServerException {

        List<CommodityVO> list = searchMapper.listCommodityByStatus();
        for (CommodityVO commodityVO : list){
            SolrInputDocument document = new SolrInputDocument();
            document.addField("id", commodityVO.getId());
            document.addField("item_name", commodityVO.getName());
            document.addField("item_price", commodityVO.getPrice());
            document.addField("item_sales_price", commodityVO.getSalesprice());
            document.addField("item_picture_url", commodityVO.getPrictureUrl());
            solrServer.add(document);
        }
        solrServer.commit();

    }

    @Override
    public List<CommodityVO> searchIndex(PageInfo pageInfo) {
        //创建solrquery对象
        SolrQuery query = new SolrQuery();
        //设置关键字
        if(StrKit.isBlank(pageInfo.getKeyword())){
            pageInfo.setKeyword("*");
        }
        query.setQuery(pageInfo.getKeyword());
        //设置
        if(pageInfo.getPageNum()<=0){
            pageInfo.setPageNum(1);
        }
        if (pageInfo.getItemSize()<=0){
            pageInfo.setItemSize(10);
        }
        query.setStart((pageInfo.getPageNum()-1)*pageInfo.getItemSize());
        query.setRows(pageInfo.getItemSize());
        query.set("df", "item_name");
        query.setHighlight(true);
        query.addHighlightField("item_name");
        query.setHighlightSimplePre("<em style='color:red'>");
        query.setHighlightSimplePost("</em>");
        List<CommodityVO> list = null;
        try {
            list = searchIndexDao.searchIndexDao(query,pageInfo);
        } catch (SolrServerException e) {
            e.printStackTrace();
        }

        return list;
    }

}
