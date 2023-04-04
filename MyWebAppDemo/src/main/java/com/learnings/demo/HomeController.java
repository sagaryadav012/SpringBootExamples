package com.learnings.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	
	@RequestMapping("home")
	   public ModelAndView home(Student stud)
	   {
		   ModelAndView mv = new ModelAndView();
		   mv.addObject("obj", stud);
		   mv.setViewName("Home");
		   
		   return mv;
	   }
	
//   @RequestMapping("home")
//   public ModelAndView home(@RequestParam("name") String myName)
//   {
//	   ModelAndView mv = new ModelAndView();
//	   mv.addObject("name", myName);
//	   mv.setViewName("Home");
//	   
//	   return mv;
//   }
	
	
//  @RequestMapping("home")
//  public String home(HttpServletRequest req)
//  {
//	  String name = req.getParameter("name");
//	  HttpSession session = req.getSession();
//	  session.setAttribute("name", name);
//	  
//	   return "Home";
//	  // System.out.println("Hi........"); // To test execution flow
//	  //return "Home.jsp";
//  }
}
