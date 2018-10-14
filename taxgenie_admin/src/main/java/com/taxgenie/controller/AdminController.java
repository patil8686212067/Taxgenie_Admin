package com.taxgenie.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AdminController {
    
//      @RequestMapping(value="/createadmin",method=RequestMethod.POST,headers="Accept=application/json")
//	public void registerAdmin() {
//		System.out.println("welcome to new");
//	}
//	@RequestMapping(value="/test")
//	public void testApi() {
//		System.out.println("welcome to new");
//	}
	  @RequestMapping(value="/register")
		 public void register() 
	     {
	    	
	    	 System.out.println("in controller");
			
		  }
}
