package com.baidu.service.impl;

import com.baidu.entity.MyOrder;
import com.baidu.entity.MyUser;
import com.baidu.service.MyOrderService;
import com.baidu.service.UserService;

/**
 * 子阳
 * 2021/8/12
 */
public class CustomerServiceImpl {
    MyOrderService orderService;
    UserService userService;

    public CustomerServiceImpl() {
    }

    public CustomerServiceImpl(MyOrderService orderService, UserService userService) {
        this.orderService = orderService;
        this.userService = userService;
    }

    public MyOrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(MyOrderService orderService) {
        this.orderService = orderService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public MyOrder buy(String userId, String name, Integer count){
        return orderService.creatMyorder(userId, name, count);
    }
    public MyUser getUser(String userId){
        return userService.queryUser(userId);
    }
}
