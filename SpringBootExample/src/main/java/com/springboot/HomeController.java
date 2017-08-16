package com.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView; 
/**
 * @author Hidayathulla.Khan
 *
 */
 
@Controller  
public class HomeController {  
    @RequestMapping("/hello")  
    public String hello(){  
        return"Hello Welcome to Spring Boot Hidayath!!";  
    } 
    
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public  ModelAndView welcome(ModelMap model) {

		return new ModelAndView("index");
	}
}  
