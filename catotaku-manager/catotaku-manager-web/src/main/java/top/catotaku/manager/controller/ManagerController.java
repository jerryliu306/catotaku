package top.catotaku.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.jms.Destination;


@Controller
public class ManagerController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Resource
    private Destination topicDestination;

    @ResponseBody
    @RequestMapping("additem")
    public void addItem(int id){
        jmsTemplate.send(topicDestination, session->session.createTextMessage(id+""));
    }

}
