package com.learnings.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learnings.demo.model.Employee;
import com.learnings.demo.repository.EmployeRepo;

@RestController
public class EmployeController 
{
	@Autowired
	EmployeRepo repo;
	
	  // we restricted here to produce data in xml, it produces only in json
	  @GetMapping(path="/employees", produces = {"application/json"})
	   public List<Employee> getEmployees()
	   {
		   return repo.findAll();   
	   }
	   
	   @GetMapping("/employee/{id}")
	   public Optional<Employee> getEmployee(@PathVariable("id") int id)
	   {
		   return repo.findById(id);
	   }
	
	   @PostMapping(path="/employee", consumes = {"application/json"})   
	   public Employee addEmployee(@RequestBody Employee emp) // Here request body accepts raw data that comes from client
	   {
		   repo.save(emp);
		   return emp;
	   }
	   
	   @DeleteMapping("/employee/{id}")
	   public String deleteEmployee(@PathVariable int id)
	   {
		   Employee e = repo.getOne(id);
		   repo.delete(e);
		   return "Data Deleted";
	   }
	   
	   @PutMapping("/employee")
	   public Employee saveOrupdate(@RequestBody Employee emp)
	   {
		   repo.save(emp);
		   return emp;
	   }
	   
	   
	
//	   @RequestMapping("/employees")
//	   @ResponseBody // here we are telling to MVC that we returning data not view
//	   public String getStudents()
//	   {
//		   return repo.findAll().toString();   
//	   }
//	   
//	   @RequestMapping("/employee/{id}")
//	   @ResponseBody // here we are telling to MVC that we returning data not view
//	   public String getStudent(@PathVariable("id") int id)
//	   {
//		   return repo.findById(id).toString();
//	   }
}
