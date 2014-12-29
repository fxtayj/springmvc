package cn.com.duiba.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
@RequestMapping("/")
public class UserController {
    @RequestMapping("index")
    public String index(){
    	System.out.println("hello world!");
        return "index";
    }
     
    @RequestMapping("/index/{username}")	//支持RESTful风格，带参数。
    public String index(@PathVariable("username") String username){
    	System.out.println(username);
        return "index";
    }
}
