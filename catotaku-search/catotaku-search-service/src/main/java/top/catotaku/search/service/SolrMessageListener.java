package top.catotaku.search.service;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import top.catotaku.search.dao.SearchMapper;
import top.catotaku.search.pojo.vo.CommodityVO;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class SolrMessageListener implements MessageListener {

    @Autowired
    private SearchMapper mapper;

    @Autowired
    private SolrServer solrServer;

    @Override
    public void onMessage(Message message) {

        TextMessage textMessage = (TextMessage) message;
        try {
            CommodityVO commodityVO = mapper.itemById((Integer.parseInt(textMessage.getText())));
            SolrInputDocument document = new SolrInputDocument();
            document.addField("id", commodityVO.getId());
            document.addField("item_name", commodityVO.getName());
            document.addField("item_price", commodityVO.getPrice());
            document.addField("item_sales_price", commodityVO.getSalesprice());
            document.addField("item_picture_url", commodityVO.getPrictureUrl());
            solrServer.add(document);
            solrServer.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
