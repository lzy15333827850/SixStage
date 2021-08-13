package com.baidu.myTest;


import com.baidu.entity.MyOrder;
import com.baidu.entity.MyUser;
import com.baidu.service.MyOrderService;
import com.baidu.service.UserService;
import com.baidu.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 子阳
 * 2021/8/12
 */
public class Test01 {

    public static void main(String[] args) {
        /*ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("dubbo-customerService-config.xml");
        UserService userService = (UserService) ctx.getBean("remoteUserService");
        MyUser myUser = userService.queryUser("2");
        System.out.println(myUser);
        System.out.println("==============");
        System.out.println();
        MyOrderService orderService = (MyOrderService) ctx.getBean("remoteOrderService");
        MyOrder order = orderService.creatMyorder("1", "车车", 3);
        System.out.println(order);*/
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("dubbo-customerService-config.xml");
        CustomerServiceImpl service = (CustomerServiceImpl) ctx.getBean("customerService");
        MyOrder order = service.buy("1", "居居", 3);
        MyUser user = service.getUser("2");
        System.out.println(order);
        System.out.println(user);
    }
}
