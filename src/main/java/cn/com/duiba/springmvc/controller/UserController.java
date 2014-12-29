package cn.com.duiba.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
	// 使用处理GET请求的方法显示视图
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		System.out.println("进入login填写");
		return "login";
	}

	// 使用POST请求的方法处理业务逻辑
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login2(HttpServletRequest request) {
		System.out.println("login的post方法提交");
//		String username = request.getParameter("username").trim();
//		String password = request.getParameter("password").trim();
//		System.out.println(username);
//		System.out.println(password);
		return "login2";
	}

}
