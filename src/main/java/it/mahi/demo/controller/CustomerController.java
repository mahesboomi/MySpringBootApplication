package it.mahi.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	
	@RequestMapping(value = "/Customers")
	public String customerHomePage() {
		return "Customers";
	}
	
	//@RequestMapping(value = "/Customers/details",method = RequestMethod.POST)
	@PostMapping(value = "/Customers/details")
	public String viewDetails(@RequestParam("cid") String cid,
					@RequestParam("cname") String cname,@RequestParam("cemail") String cemail,ModelMap modelmap) {
		/*
		 * ModelAndView mv = new ModelAndView(); mv.addObject("cid",cid);
		 * mv.addObject("cname",cname); mv.addObject("cemail",cemail);
		 * mv.setViewName("ViewDetails");
		 */
		modelmap.addAttribute("cid",cid);
		modelmap.addAttribute("cname",cname);
		modelmap.addAttribute("cemail",cemail);
		return "ViewDetails";
	}

}
