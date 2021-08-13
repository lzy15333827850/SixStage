package com.baidu.service.impl;

import com.baidu.entity.MyOrder;
import com.baidu.service.MyOrderService;

import java.util.UUID;

/**
 * 子阳
 * 2021/8/12
 */
public class OrderServiceImpl implements MyOrderService {
    public MyOrder creatMyorder(String userId, String name, Integer count) {
        System.out.println("orderservice正在工作");
        MyOrder order=new MyOrder();
        order.setOrderId(UUID.randomUUID().toString());
        order.setUserId(userId);
        order.setName(name);
        order.setCount(count);
        return order;
    }
}
