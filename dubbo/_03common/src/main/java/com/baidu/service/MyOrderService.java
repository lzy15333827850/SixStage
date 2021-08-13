package com.baidu.service;

import com.baidu.entity.MyOrder;

/**
 * 子阳
 * 2021/8/12
 */
public interface MyOrderService {
    MyOrder creatMyorder(String userId,String name,Integer count);
}
