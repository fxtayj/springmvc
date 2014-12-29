package cn.com.duiba.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/index")
public class IndexController {
	
	@RequestMapping("welcome")
	public String index() {
		System.out.println("welcome!");
		return "index";
	}

	@RequestMapping("/welcome/{username}")
	// 支持RESTful风格，带参数。
	public String index(@PathVariable("username") String username) {
		System.out.println(username);
		return "index";
	}
}
