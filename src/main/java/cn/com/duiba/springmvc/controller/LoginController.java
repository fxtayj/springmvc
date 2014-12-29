package cn.com.duiba.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	//使用处理GET请求的方法显示视图
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
    	Map<String,String> model = new HashMap<String,String>();
    	model.put("user","fxt");
        return "login";
    }
    
    //使用POST请求的方法处理业务逻辑
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login2(HttpServletRequest request) {
            String username = request.getParameter("username").trim();
            System.out.println(username);
        return "login2";
    }
    
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String testParam(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
    	String username = request.getParameter("username");
    	System.out.println(username);
    	return null;
    }
}
