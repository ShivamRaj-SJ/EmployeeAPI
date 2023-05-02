package com.employeeDetailAPI.EmployeeAPI.Employee.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeeDetailAPI.EmployeeAPI.Employee.Repository.EmployeeRepository;
import com.employeeDetailAPI.EmployeeAPI.Employee.bean.EmpDetail;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository emprepo;
	
@GetMapping("/Employee/data")
//public List<EmpDetail> getAllDetail()
public Iterable<EmpDetail> getAllDetail()
{
	return emprepo.findAll();
	
}
// This is Employee API
@PostMapping("/Employee/data")
public ResponseEntity<?> saveuserdata(@RequestBody EmpDetail empdetail)

{
	//return  EmployeeRepository //reponame.save(empdetail);
return ResponseEntity.ok(emprepo.save(empdetail));
}
@PutMapping("/Employee/data/{id}")//for updating
public void updateDetail(@PathVariable long id,@RequestBody EmpDetail detail)
{
	emprepo.save(detail);
}
@DeleteMapping("/Employee/data/{id}")
public void deletedata(@PathVariable long id) {
	emprepo.deleteById(id);
}

}
