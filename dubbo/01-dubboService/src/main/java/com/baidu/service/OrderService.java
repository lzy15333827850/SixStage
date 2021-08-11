package com.baidu.service;


import com.baidu.model.Order;

/**
 * 子阳
 * 2021/8/11
 */
public interface OrderService {
    Order saveOrder(String userId, String name, Integer amount);
}
