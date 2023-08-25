package com.jrishmani.ManyToOne.repo;

import com.jrishmani.ManyToOne.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {


    Employee deleteById(Employee emp3);
}
