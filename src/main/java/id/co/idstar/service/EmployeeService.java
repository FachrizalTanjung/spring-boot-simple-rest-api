package id.co.idstar.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import id.co.idstar.vo.ConsumeResponse;
import id.co.idstar.vo.Employee;

public interface EmployeeService {

	ConsumeResponse<Employee> getEmployeeById(String id) throws JsonMappingException, JsonProcessingException;

}
