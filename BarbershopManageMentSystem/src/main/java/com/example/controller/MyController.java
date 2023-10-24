package com.example.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MyController {
	
	
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	    public String showHomePage() {
	        // Your logic here
	        return "index"; // This should match your view name
	    }
	 
	 // @RequestMapping(value = "/slotBook", method = RequestMethod.GET)
	 //    public String slotBook() {
	 //        // Your logic here
	 //        return "slotBook"; // This should match your view name
	 //    }
}
