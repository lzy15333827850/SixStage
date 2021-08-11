package com.baidu.service.impl;


import com.baidu.model.Order;
import com.baidu.service.OrderService;

import java.util.UUID;

/**
 * 子阳
 * 2021/8/11
 */
public class OrderServiceImpl implements OrderService {
    public Order saveOrder(String userId, String name, Integer amount) {
        Order order=new Order();
        order.setUserId(userId);
        order.setOrderId(UUID.randomUUID().toString());
        order.setOrderName(name);
        order.setAmount(amount);
        return order;
    }
}
