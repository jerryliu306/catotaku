package top.catotaku.from.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.catotaku.fcart.interfaces.HelloDubbo;
import top.catotaku.fcart.interfaces.HelloDubbo2;

@Controller
public class FromController {

    @Autowired
    private HelloDubbo helloDubbo;
    @Autowired
    private HelloDubbo2 helloDubbo2;

    @ResponseBody
    @RequestMapping("sss")
    public String ssss(String str){
        System.out.println(helloDubbo.sayDubbo("what"));
        System.out.println(helloDubbo2.say("xx"));
        return str;
    }

}
