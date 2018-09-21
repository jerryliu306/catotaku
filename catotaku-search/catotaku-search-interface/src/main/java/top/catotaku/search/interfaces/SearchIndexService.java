package top.catotaku.search.interfaces;

import org.apache.solr.client.solrj.SolrServerException;
import top.catotaku.search.pojo.dto.PageInfo;
import top.catotaku.search.pojo.vo.CommodityVO;

import java.io.IOException;
import java.util.List;

public interface SearchIndexService {
    void uploadIndex() throws IOException, SolrServerException;

    List<CommodityVO> searchIndex(PageInfo pageInfo);
}
