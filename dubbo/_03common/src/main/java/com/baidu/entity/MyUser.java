package com.baidu.entity;

import java.io.Serializable;

/**
 * 子阳
 * 2021/8/12
 */
public class MyUser implements Serializable {
    private String userId;
    private String phone;
    private String address;

    @Override
    public String toString() {
        return "MyUser{" +
                "userId='" + userId + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
