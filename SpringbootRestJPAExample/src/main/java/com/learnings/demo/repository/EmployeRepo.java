package com.learnings.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.learnings.demo.model.Employee;

// JpaRepository indirectly extends CrudRepository
public interface EmployeRepo extends JpaRepository<Employee, Integer>
{

}
