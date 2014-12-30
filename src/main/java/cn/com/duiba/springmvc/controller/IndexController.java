package cn.com.duiba.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/index")
public class IndexController {
	
	@RequestMapping("welcome")
	public String index() {
		System.out.println("welcome!");
		return "index";
	}

	@RequestMapping("/greeting")
    public String greeting(@RequestParam(value="username", required=false, defaultValue="SpringMVC") String username, Model model) {
        model.addAttribute("username", username);
        return "greeting";
    }
}
