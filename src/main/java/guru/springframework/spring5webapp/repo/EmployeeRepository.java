package guru.springframework.spring5webapp.repo;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
