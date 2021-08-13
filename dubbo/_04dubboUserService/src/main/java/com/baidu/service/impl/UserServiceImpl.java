package com.baidu.service.impl;

import com.baidu.entity.MyUser;
import com.baidu.service.UserService;

/**
 * 子阳
 * 2021/8/12
 */
public class UserServiceImpl implements UserService {

    public MyUser queryUser(String userId) {
        System.out.println("userService正在工作");
        MyUser user=new MyUser();
        if (userId.equals("1")){
            user.setUserId("1");
            user.setPhone("15333827850");
            user.setAddress("北京青年公寓");
            return user;
        }else if (userId.equals("2")){
            user.setUserId("2");
            user.setPhone("12345678911");
            user.setAddress("北京大族企业湾");
            return user;
        }else {

            return null;
        }
    }
}
