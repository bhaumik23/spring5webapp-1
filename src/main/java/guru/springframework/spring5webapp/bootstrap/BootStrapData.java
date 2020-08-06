package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.model.Company;
import guru.springframework.spring5webapp.model.Employee;
import guru.springframework.spring5webapp.repo.CompanyRepository;
import guru.springframework.spring5webapp.repo.EmployeeRepository;
@Component
public class BootStrapData implements CommandLineRunner {

	private final EmployeeRepository employeeRepository;
	private final CompanyRepository companyRepository;
	
	
	public BootStrapData(EmployeeRepository employeeRepository, CompanyRepository companyRepository) {
		super();
		this.employeeRepository = employeeRepository;
		this.companyRepository = companyRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		Company company = new Company("ABC");
		Employee employee = new Employee("Bhaumik", "Shah");
		
		company.getEmployees().add(employee);
		employee.getCompanies().add(company);
		
		employeeRepository.save(employee);
		companyRepository.save(company);
		
		
		System.out.println("Bootstrap started...");
		System.out.println("total employess :: "+employeeRepository.count());
	}

}
