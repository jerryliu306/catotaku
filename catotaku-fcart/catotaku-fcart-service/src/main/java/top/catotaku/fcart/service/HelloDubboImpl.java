package top.catotaku.fcart.service;

import top.catotaku.fcart.interfaces.HelloDubbo;

public class HelloDubboImpl implements HelloDubbo {
    @Override
    public String sayDubbo(String name) {
        return "Hello" + name;
    }
}
