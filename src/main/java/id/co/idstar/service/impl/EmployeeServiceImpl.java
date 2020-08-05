package id.co.idstar.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import id.co.idstar.service.EmployeeService;
import id.co.idstar.vo.ConsumeResponse;
import id.co.idstar.vo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public ConsumeResponse<Employee> getEmployeeById(String id) throws JsonMappingException, JsonProcessingException {
		ConsumeResponse<Employee> result = new ConsumeResponse<Employee>();
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://dummy.restapiexample.com/api/v1/employees";
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		ObjectMapper objMapper = new ObjectMapper();
		if ("1".equals(id)) {
			result = objMapper.readValue(response.getBody(), new TypeReference<ConsumeResponse<Employee>>(){});
			List<Employee> empList = result.getData();
			Employee employee = empList.stream().filter(o -> id.equals(String.valueOf(o.getId()))).findFirst().orElse(null);
			empList = new ArrayList<Employee>();
			empList.add(employee);
			result.setData(empList);
		} else {
			result.setStatus("0");
			result.setMessage("Data tidak ditemukan");
		}
		return result;

	}

}
