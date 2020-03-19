package com.c2p.producer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.c2p.domain.Employee;
@RestController
public class ProducerController {
	
	@Autowired
	private RestTemplate restTemplate;

	//Retireve All Employee Details
	@RequestMapping(value = "/getAllEmployees",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object[]> getAllEmployees() {
		String url="http://localhost:7777/employees/";
		HttpHeaders header=new HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		ResponseEntity<Object[]> response=restTemplate.getForEntity(url, Object[].class);
		System.out.println("Employee Producer executed...");
		return response;
	}
	//Retireve Employee by ID
	@RequestMapping(value = "/getEmployeeById/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getEmployeeById(@PathVariable long id) {
		System.out.println("ID:"+ id);
		String url="http://localhost:7777/employees/"+id;
		HttpHeaders header=new HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		Map<String,Long> params=new HashMap();
		params.put("id", id);
		ResponseEntity<Object> response=restTemplate.getForEntity(url, Object.class,params);
		System.out.println("Get Employee by Id");
		return response;
	}
	
	//delete by id
	@RequestMapping(value = "/deleteEmployeeById/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> deleteEmployeeById(@PathVariable long id) {
		System.out.println("ID:"+ id);
		String url="http://localhost:7777/employees/id/"+id;
	
		Map<String,Long> params=new HashMap();
		params.put("id", id);
		restTemplate.delete(url, params);
		System.out.println("Delete Employee by Id");
		return new ResponseEntity<Object>(HttpStatus.FORBIDDEN);
	}
	
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);
		return emp;
	}
}
