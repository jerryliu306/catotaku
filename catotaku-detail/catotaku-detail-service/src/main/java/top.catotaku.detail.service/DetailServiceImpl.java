package top.catotaku.detail.service;

import com.alibaba.fastjson.JSON;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.kahadb.page.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;
import top.catotaku.common.core.StrKit;
import top.catotaku.common.jedis.JedisClient;
import top.catotaku.common.pojo.po.Commodityspecification;
import top.catotaku.detail.dao.DetailMapper;
import top.catotaku.detail.interfaces.DetailService;
import top.catotaku.detail.pojo.vo.CommodityInfoVO;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author  catotaku
 */
@Service
public class DetailServiceImpl implements DetailService {

    @Autowired
    private DetailMapper mapper;

    @Autowired
    private JedisClient jedisClient;

    @Autowired
    private FreeMarkerConfig freeMarkerConfig;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public CommodityInfoVO itemCommodity(Integer id) {
        CommodityInfoVO commodityInfoVO = null;
        try {
            String jsonString = jedisClient.hget("commodityInfo", id + "");
            if (StrKit.notBlank(jsonString)){
                commodityInfoVO = JSON.parseObject(jsonString, CommodityInfoVO.class);
                return commodityInfoVO;
            }
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        commodityInfoVO = mapper.itemCommodity(id);
        commodityInfoVO.setSpecification(mapper.listCommodityspecification(id));
        try {
            jedisClient.hset("commodityInfo", id+"", JSON.toJSONString(commodityInfoVO));
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return commodityInfoVO;
    }

    @Override
    public CommodityInfoVO itemCommodityURL(String page) {
        CommodityInfoVO commodityInfoVO = null;
        try {
            String url = jedisClient.get(page);
            if (StrKit.notBlank(url)) {
                return null;
            }
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        commodityInfoVO = mapper.itemCommodity(Integer.parseInt(page));
        commodityInfoVO.setSpecification(mapper.listCommodityspecification(Integer.parseInt(page)));
        try {
            jedisClient.set(page+"", page+".html");
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }

        return commodityInfoVO;

    }

}
