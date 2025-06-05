package ems.mapper;

import ems.dto.EmployeeDto;
import ems.entity.Employee;


//used to map emp dto and emp 
public class EmployeeMapper {
  public static EmployeeDto mapToEmployeeDto(Employee employee) {
	  return new EmployeeDto(
			  employee.getId(),
			  employee.getFirstName(),
			  employee.getLastName(),
			  employee.getEmail()
		  );
	  }
  
  public static Employee mapToEmployee(EmployeeDto employeeDto) {
	  return new Employee(
			  employeeDto.getId(),
			  employeeDto.getFirstName(),
			  employeeDto.getLastName(),
			  employeeDto.getEmail()
			  );
  }
}
