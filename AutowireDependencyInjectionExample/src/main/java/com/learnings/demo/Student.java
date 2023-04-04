package com.learnings.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Student 
{
   private int id;
   private String name;
   @Autowired
   @Qualifier("lap")
   private Laptop laptop;
   
   public Student()
   {
	   System.out.println("Student Object Created.");
   }

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void display()
	{
		System.out.println("In Student Display...");
		laptop.display();
	}
   
}
