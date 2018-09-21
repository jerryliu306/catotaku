package top.catotaku.fcart.service;

import top.catotaku.fcart.interfaces.HelloDubbo2;

public class HelloDubboImpl2 implements HelloDubbo2 {
    @Override
    public String say(String str) {
        return "see you" + str;
    }
}
