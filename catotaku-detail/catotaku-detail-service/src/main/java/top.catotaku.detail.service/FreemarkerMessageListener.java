package top.catotaku.detail.service;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import top.catotaku.common.pojo.po.Commodityspecification;
import top.catotaku.detail.dao.DetailMapper;
import top.catotaku.detail.pojo.vo.CommodityInfoVO;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreemarkerMessageListener implements MessageListener {

    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @Autowired
    private DetailMapper detailMapper;

    @Override
    public void onMessage(Message message) {
        Configuration configuration = freeMarkerConfigurer.getConfiguration();
        Writer out = null;
        try {
            Template template = configuration.getTemplate("detail.ftl");
            TextMessage textMessage = (TextMessage) message;
            int id = Integer.parseInt(textMessage.getText());
            CommodityInfoVO commodityInfoVO = detailMapper.itemCommodity(id);
            List<Commodityspecification> list = detailMapper.listCommodityspecification(id);
            commodityInfoVO.setSpecification(list);
            Map<String,Object> dataModel = new HashMap<>();
            dataModel.put("item", commodityInfoVO);
            out = new FileWriter("D:/aaa/"+id+".html");
            template.process(dataModel, out);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (out!=null){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
