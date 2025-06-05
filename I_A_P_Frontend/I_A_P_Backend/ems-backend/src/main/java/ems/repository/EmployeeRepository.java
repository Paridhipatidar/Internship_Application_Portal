package ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ems.entity.Employee;

//two variable inside jparepository type of entity , type of primary key 

public interface EmployeeRepository extends JpaRepository< Employee ,Long>{

	
}
