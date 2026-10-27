package in.ps.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ps.main.entity.Employee;
import in.ps.main.service.EmployeeService;

@RestController

public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping ("/addemp")
	public String addemp(@RequestBody Employee e)
	{
		return service.addemployee(e);
	}
	
	@GetMapping("/findallemp")
	public List<Employee>findallemp()
	{
		return service.findallemployee();
	}
	
	@GetMapping("/findempbyid")
	public Employee findempbyid(@RequestParam int empid)
	{
		return service.findByEmpId(empid);
		
	}
	
	@DeleteMapping("/deleteempbyid")
	public String deletebyid(@RequestParam int empid)
	{
	    return service.deleteByEmpId(empid);
	}

	
	@PutMapping("/updateemp")
	public String updateemp(@RequestParam int empid,@RequestBody Employee e)
	{
	    return service.updateByEmpId(empid, e);
	}
	
	
	// find by firstname
	@GetMapping("/findbyfirstname")
	public List<Employee> findByfirstname(@RequestParam String firstname) {
	    return service.findByfirstname(firstname);
	}

	// find by lastname
	@GetMapping("/findbylastname")
	public List<Employee> findBylastname(@RequestParam String lastname) {
	    return service.findBylastname(lastname);
	}

	// find by department
	@GetMapping("/findbydepartment")
	public List<Employee> findBydepartment(@RequestParam String department) {
	    return service.findBydepartment(department);
	}

	// find by designation
	@GetMapping("/findbydesignation")
	public List<Employee> findBydesignation(@RequestParam String designation) {
	    return service.findBydesignation(designation);
	}


}