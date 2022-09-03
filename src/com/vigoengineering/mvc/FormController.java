package com.vigoengineering.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	//need a controller method to display the form
	@RequestMapping("/form")
	public String showForm() {
		return "form";
	}
	
	//need a controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "process-form";
	}
	
	//New controller method to read data from the form and add data to the model
	@RequestMapping("/shout")
	public String shout(HttpServletRequest request, Model model) {
		//Read the request parameter from the html form
		String theName = request.getParameter("studentName");
		
		//Convert all the data to uppercase
		theName = theName.toUpperCase();
		
		//Create our message
		String result = "Yo! " + theName;
		
		//Add the message to the model
		model.addAttribute("message",result);
		
		
		return "process-form";
	}
	
	//New controller method to read data from the form and add data to the model
	@RequestMapping("/shoutTwo")
	public String shoutTwo(@RequestParam("studentName") String theName, Model model) {

		//Convert all the data to uppercase
		theName = theName.toUpperCase();
			
		//Create our message
		String result = "Hey My Friend! " + theName;
			
		//Add the message to the model
		model.addAttribute("message",result);
			
			
		return "process-form";
	}
	
	@RequestMapping("/student")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
		return "student-confirmation";
	}
}
