package com.baidu;

import com.baidu.model.Order;
import com.baidu.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

/**
 * 子阳
 * 2021/8/11
 */
public class ConsumerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("dubbo-userService.xml");
        OrderService orderService = (OrderService) context.getBean("remoteOrderService");
        Order order = orderService.saveOrder(UUID.randomUUID().toString().substring(0, 8), "轿跑", 3);
        System.out.println(order);
        System.out.println(orderService.getClass().getName());
        System.out.println(UUID.randomUUID().toString().substring(0, 8));

    }
}
