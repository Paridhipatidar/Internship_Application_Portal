package ems.service;

import ems.dto.EmployeeDto;

public interface EmployeeService {
 EmployeeDto createEmployee(EmployeeDto employeeDto);

 EmployeeDto getEmployeeById(Long employee);
}
