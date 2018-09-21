package top.catotaku.detail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import top.catotaku.common.freemarker.FreeMarkerKit;
import top.catotaku.detail.interfaces.DetailService;
import top.catotaku.detail.pojo.vo.CommodityInfoVO;

import javax.annotation.Resource;
import javax.jms.*;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DetailController {

    @Autowired
    private DetailService service;

    @Autowired
    private FreeMarkerKit freeMarkerKit;

    @RequestMapping("commodityItem")
    public ModelAndView CommodityItem(ModelAndView mv, Integer id){

        CommodityInfoVO commodityInfoVO = service.itemCommodity(id);
        mv.addObject("commodityInfoVO", commodityInfoVO);
        mv.setViewName("detail");
        return mv;

    }

    @ResponseBody
    @RequestMapping("/getPage")
    public String toPage(int id) {
        CommodityInfoVO commodityInfoVO = service.itemCommodity(id);
        Map<String,Object> map = new HashMap<>();
        map.put("commodityInfoVO", commodityInfoVO);
        freeMarkerKit.createFreeMarkerPage(id+"", "hi.ftl", map);
        return "OK";
    }

}