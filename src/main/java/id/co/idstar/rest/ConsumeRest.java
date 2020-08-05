package id.co.idstar.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import id.co.idstar.service.EmployeeService;
import id.co.idstar.vo.ConsumeResponse;
import id.co.idstar.vo.Employee;
import id.co.idstar.vo.Request;

@RestController
@RequestMapping("consume")
public class ConsumeRest {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/get-employee")
	public ConsumeResponse<Employee> getEmployeeById(@RequestBody Request request) throws JsonMappingException, JsonProcessingException {
		return employeeService.getEmployeeById(request.getId());
	}

}
