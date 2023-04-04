package com.learnings.demo;

import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop 
{
   private int lid;
   private String lname;
   
   public Laptop()
   {
	   System.out.println("Laptop Object Created");
   }
   
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
   
   public void display()
   {
	   System.out.println("In Laptop Display...");
   }
}
