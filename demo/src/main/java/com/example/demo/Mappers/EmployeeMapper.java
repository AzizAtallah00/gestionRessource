package com.example.demo.Mappers;

import org.modelmapper.ModelMapper;

import com.example.demo.DTO.EmployeeDTO;
import com.example.demo.Entity.Employee;

public class EmployeeMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static EmployeeDTO convertToDto(Employee employee)
	{
		return modelMapper.map(employee, EmployeeDTO.class);
	}
	public static Employee convertToEntity(EmployeeDTO employeeDTO)
	{
		return modelMapper.map(employeeDTO, Employee.class);
	}
	
	
}
