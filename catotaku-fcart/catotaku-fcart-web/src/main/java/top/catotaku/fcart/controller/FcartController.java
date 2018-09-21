package top.catotaku.fcart.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class FcartController {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-provider.xml");
        context.start();
        System.in.read();

    }

}
