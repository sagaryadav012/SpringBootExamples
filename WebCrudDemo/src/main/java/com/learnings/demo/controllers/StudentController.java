package com.learnings.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learnings.demo.dao.StudentRepo;
import com.learnings.demo.model.Student;

@Controller
public class StudentController 
{
	
	@Autowired
	StudentRepo repo;
	
   @RequestMapping("/")
   public String home()
   {
	   //System.out.println("Hi");
	   return "home.jsp";
   }
   
   @RequestMapping("/addStudent")
   public String addStudent(Student stud)
   {
	   repo.save(stud);
	   return "home.jsp";
   }
   
   @RequestMapping("/getStudent")
   public ModelAndView getStudent(@RequestParam int id)
   {
	   ModelAndView mv = new ModelAndView("showStudent.jsp");
	   Student student = repo.findById(id).orElse(new Student()); // This method returns Optional student to handle null values
	   mv.addObject("student", student);
	   
	   // Testing new methods
	   System.out.println(repo.findByTech("java")); // fetch data who have tech = java
	   System.out.println(repo.findByIdGreaterThan(103)); // fetch data which are greater than id 103
	   System.out.println(repo.findByIdLessThan(103)); // fetch data which are less than id 103
	   System.out.println(repo.findByTechSorted("java")); // fetch data who have tech= java and will be sorted by name
	   
	   
	   return mv;   
   }
   
   @RequestMapping("/deleteStudent")
   public String deletStudent(@RequestParam int id)
   {
	   repo.deleteById(id);
	   return "home.jsp";
   }
}
