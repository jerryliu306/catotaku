package top.catotaku.search.dao.impl;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.catotaku.search.pojo.dto.PageInfo;
import top.catotaku.search.pojo.vo.CommodityVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class SearchIndexDao {

    @Autowired
    private SolrServer solrServer;

    public List<CommodityVO> searchIndexDao(SolrQuery query, PageInfo pageInfo) throws SolrServerException {
        List<CommodityVO> list = new ArrayList<>();

        //查询获取返回值对象
        QueryResponse response = solrServer.query(query);
        //得到返回值集合
        SolrDocumentList solrDocuments = response.getResults();
        //设置返回值条数
        pageInfo.setItemCount((int) solrDocuments.getNumFound());
        pageInfo.findPage();
        Map<String, Map<String, List<String>>> highlighting = response.getHighlighting();
        for (SolrDocument document : solrDocuments){
            CommodityVO commodityVO = new CommodityVO();
            commodityVO.setId(Long.parseLong((String)document.get("id")));
            commodityVO.setPrice(Double.parseDouble((String)document.get("item_price")));
            commodityVO.setSalesprice(Double.parseDouble((String)document.get("item_sales_price")));
            commodityVO.setPrictureUrl((String) document.get("item_picture_url"));
            List<String> itemlist = highlighting.get(document.get("id")).get("item_list");
            if (itemlist!=null && !itemlist.isEmpty()){
                commodityVO.setName(itemlist.get(0));
            }else {
                commodityVO.setName((String) document.get("item_name"));
            }
            list.add(commodityVO);
        }

        return list;
    }
}
