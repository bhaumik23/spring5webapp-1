package guru.springframework.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repo.EmployeeRepository;

@Controller
public class EmployeeController {

	private final EmployeeRepository employeeRepository;
	
	
	
	public EmployeeController(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@RequestMapping("/emplyees")
	public String getEmployeeDetails(Model model)
	{
		model.addAttribute("employeeList",employeeRepository.findAll());
		return "employee/list";
	}
	
}
