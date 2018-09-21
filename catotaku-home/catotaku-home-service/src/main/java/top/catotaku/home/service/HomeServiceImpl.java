package top.catotaku.home.service;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.catotaku.common.core.StrKit;
import top.catotaku.common.dao.PricturedataMapper;
import top.catotaku.common.jedis.JedisClient;
import top.catotaku.common.pojo.po.Pricturedata;
import top.catotaku.common.pojo.po.PricturedataExample;
import top.catotaku.home.interfaces.HomeService;

import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private PricturedataMapper pricturedataMapper;

    @Autowired
    private JedisClient jedisClient;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public List<Pricturedata> listPrictureDataByUID(Integer uid) {
        List<Pricturedata> list = null;
        try {
            String jsonString = jedisClient.get("indexpricturedata");
            if (StrKit.notBlank(jsonString)){
                list = JSON.parseArray(jsonString, Pricturedata.class);
                return list;
            }
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        PricturedataExample example = new PricturedataExample();
        PricturedataExample.Criteria criteria = example.createCriteria();
        criteria.andUIdEqualTo(uid);
        list = pricturedataMapper.selectByExample(example);
        System.out.println(list);
        try {
            jedisClient.set("indexpricturedata", JSON.toJSONString(list));
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return list;
    }

}
