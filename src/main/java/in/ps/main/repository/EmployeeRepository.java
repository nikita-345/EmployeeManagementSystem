package in.ps.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ps.main.entity.Employee;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//Add derived method for serching employee
	// firstname searching

	public List<Employee> findByFirstname(String firstname);

	// lastname
	public List<Employee> findByLastname(String lastname);

	// departmenet
	public List<Employee> findByDepartment(String department);

	// Designation
	public List<Employee> findByDesignation(String designation);
}