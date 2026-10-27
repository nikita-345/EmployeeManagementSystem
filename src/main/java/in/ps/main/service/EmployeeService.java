package in.ps.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ps.main.entity.Employee;
import in.ps.main.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	
	
	EmployeeRepository eresp;
	
	//save() to add single record accepted using form
	public String addemployee(Employee e)
	{
		eresp.save(e);
		return"Employee record added sucessfully";
	}
	
	//findall()
	public List<Employee>findallemployee()
	{
		
		return eresp.findAll();
	}
	
	//findbyempid()
	public Employee findByEmpId(int empid) {
	    return eresp.findById(empid).orElse(null);
	}
	
	
	// delete by emp id
	public String deleteByEmpId(int empid) {

	    if (!eresp.existsById(empid)) {
	        return "No matching record found for given id";
	    }

	    eresp.deleteById(empid);
	    return "Employee record deleted successfully";
	}


	
	//updatebyid()
	public String updateByEmpId(int empid, Employee newemp) {

	    Employee existingemp = eresp.findById(empid).orElse(null);

	    if (existingemp == null) {
	        return "No matching record found for given id";
	    }

	    if (newemp.getFirstname() == null
	            && newemp.getMiddlename() == null
	            && newemp.getLastname() == null
	            && newemp.getGender() == null
	            && newemp.getEmail() == null
	            && newemp.getDob() == null
	            && newemp.getContactno() == 0
	            && newemp.getAdharno() == 0
	            && newemp.getPanno() == null
	            && newemp.getAddress() == null
	            && newemp.getProfile() == null
	            && newemp.getExp() == 0
	            && newemp.getSalary() == 0.0
	            && newemp.getJoiningdate() == null
	            && newemp.getDepartment() == null
	            && newemp.getDesignation() == null
	            && newemp.getReportingmanager() == null
	            && newemp.getStatus() == null
	            && newemp.getWorklocation() == null
	    ) {
	        return "No data provided to update";
	    }

	    // update all fields directly
	    existingemp.setFirstname(newemp.getFirstname());
	    existingemp.setMiddlename(newemp.getMiddlename());
	    existingemp.setLastname(newemp.getLastname());
	    existingemp.setGender(newemp.getGender());
	    existingemp.setEmail(newemp.getEmail());
	    existingemp.setDob(newemp.getDob());
	    existingemp.setContactno(newemp.getContactno());
	    existingemp.setAdharno(newemp.getAdharno());
	    existingemp.setPanno(newemp.getPanno());
	    existingemp.setAddress(newemp.getAddress());
	    existingemp.setProfile(newemp.getProfile());
	    existingemp.setExp(newemp.getExp());
	    existingemp.setSalary(newemp.getSalary());
	    existingemp.setJoiningdate(newemp.getJoiningdate());
	    existingemp.setDepartment(newemp.getDepartment());
	    existingemp.setDesignation(newemp.getDesignation());
	    existingemp.setReportingmanager(newemp.getReportingmanager());
	    existingemp.setStatus(newemp.getStatus());
	    existingemp.setWorklocation(newemp.getWorklocation());

	    eresp.save(existingemp);

	    return "Employee record updated successfully";
	}

	
	// find by firstname
	public List<Employee> findByfirstname(String firstname) {
	    return eresp.findByFirstname(firstname);
	}

	// find by lastname
	public List<Employee> findBylastname(String lastname) {
	    return eresp.findByLastname(lastname);
	}

	// find by department
	public List<Employee> findBydepartment(String department) {
	    return eresp.findByDepartment(department);
	}

	// find by designation
	public List<Employee> findBydesignation(String designation) {
	    return eresp.findByDesignation(designation);
	}

	
	

}