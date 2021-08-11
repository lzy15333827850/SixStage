package com.baidu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 子阳
 * 2021/8/11
 */
public class TestMain {
    public static void main(String[] args) throws IOException {
        System.out.println("=========服务提供者启动==========");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-service.xml");
        context.start();
        System.in.read();
    }
}
