package it.mahi.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!!!";
	}
	
	@RequestMapping("helloworld")
	public String helloworld() {
		return "Index";
	}
	
	@RequestMapping("display")
	public String display(HttpServletRequest req) {
		String name = req.getParameter("name");
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		return "Index";
		
	}
	
	/**
	 * Instead of HttpServletRequest, "@RequestParam" is used
	 * and instead of HttpSession, ModelAndView concept is used.
	 * @param name
	 * @return
	 */
	@RequestMapping("testModelAndView")
	public ModelAndView modelAndViewExample(@RequestParam("name") String name) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.setViewName("Index");
		return mv;
		
	}
}
