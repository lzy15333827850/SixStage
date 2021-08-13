package com.baidu.myTest;

import com.baidu.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 子阳
 * 2021/8/12
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext cxt=new ClassPathXmlApplicationContext("dubbo-userService-config.xml");
        UserServiceImpl serviceImpl = (UserServiceImpl) cxt.getBean("userServiceImpl");
        System.in.read();
    }
}
