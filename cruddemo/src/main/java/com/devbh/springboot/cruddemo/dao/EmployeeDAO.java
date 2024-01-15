package com.devbh.springboot.cruddemo.dao;

import com.devbh.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
