package guru.springframework.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repo.CompanyRepository;

@Controller
public class CompanyController {
	
	private final CompanyRepository companyRepository;
	
	
	public CompanyController(CompanyRepository companyRepository) {
		super();
		this.companyRepository = companyRepository;
	}


	@RequestMapping("/companies")
	public String getCompanyList(Model model)
	{
		model.addAttribute("companyList", companyRepository.findAll());
		return "company/list";
	}
}
