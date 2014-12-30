package cn.com.duiba.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.duiba.springmvc.model.User;
import cn.com.duiba.springmvc.service.UserService;
 
public class UserTest {
 
private UserService userService;
     
    @Before
    public void before(){                                                                    
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
    }
     
    @Test
    public void addUser(){
        User user = new User();
        user.setUsername("你好");
        user.setPassword("15a4s56df4a6");
        System.out.println(userService.insertUser(user));
    }
}
