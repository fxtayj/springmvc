package cn.com.duiba.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.com.duiba.springmvc.model.User;

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
	@RequestMapping(value = "/login")
	public String login2(HttpServletRequest request) {
		System.out.println("login的post方法提交");
		// String username = request.getParameter("username").trim();
		// String password = request.getParameter("password").trim();
		// System.out.println(username);
		// System.out.println(password);
		return "login2";
	}

	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, User user) {
		String username = user.getName();
		ModelAndView mv = new ModelAndView("/index/greeting.do", "username", username);
		mv.addObject("hello", "hello world!");
		return mv;
	}

}
