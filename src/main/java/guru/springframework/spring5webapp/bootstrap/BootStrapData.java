package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.model.Company;
import guru.springframework.spring5webapp.model.Employee;
import guru.springframework.spring5webapp.model.Location;
import guru.springframework.spring5webapp.repo.CompanyRepository;
import guru.springframework.spring5webapp.repo.EmployeeRepository;
import guru.springframework.spring5webapp.repo.LocationRepository;
@Component
public class BootStrapData implements CommandLineRunner {

	private final EmployeeRepository employeeRepository;
	private final CompanyRepository companyRepository;
	private final LocationRepository locationRepository;
	


	public BootStrapData(EmployeeRepository employeeRepository, CompanyRepository companyRepository,
			LocationRepository locationRepository) {
		super();
		this.employeeRepository = employeeRepository;
		this.companyRepository = companyRepository;
		this.locationRepository = locationRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		Company company = new Company("ABC");
		Employee employee = new Employee("Bhaumik", "Shah");
		Location location =  new Location("USA");
		
		company.getEmployees().add(employee);
		employee.getCompanies().add(company);
		location.getCompanies().add(company);
		
		employeeRepository.save(employee);
		companyRepository.save(company);
		locationRepository.save(location);
		
		System.out.println("Bootstrap started...");
		System.out.println("total employess :: "+employeeRepository.count());
	}

}
