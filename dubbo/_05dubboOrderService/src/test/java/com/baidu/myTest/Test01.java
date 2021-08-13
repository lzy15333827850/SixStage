package com.baidu.myTest;

import com.baidu.service.MyOrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 子阳
 * 2021/8/12
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("dubbo-orderService-config.xml");
        MyOrderService serviceImpl = (MyOrderService) ctx.getBean("orderServiceImpl");
        System.in.read();
    }
}
