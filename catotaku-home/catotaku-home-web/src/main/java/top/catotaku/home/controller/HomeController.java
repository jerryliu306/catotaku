package top.catotaku.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.catotaku.common.pojo.po.Pricturedata;
import top.catotaku.home.interfaces.HomeService;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @RequestMapping("/home")
    public ModelAndView home(ModelAndView mv){
        List<Pricturedata> list = homeService.listPrictureDataByUID(1);
        mv.addObject("list", list);
        mv.setViewName("home");
        return mv;
    }

}
