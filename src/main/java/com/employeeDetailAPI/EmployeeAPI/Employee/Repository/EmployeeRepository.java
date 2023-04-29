package com.employeeDetailAPI.EmployeeAPI.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.employeeDetailAPI.EmployeeAPI.Employee.bean.EmpDetail;
                                            //JPARepository
public interface EmployeeRepository extends CrudRepository<EmpDetail,Long>{

}
