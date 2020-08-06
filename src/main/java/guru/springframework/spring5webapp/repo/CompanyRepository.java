package guru.springframework.spring5webapp.repo;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.model.Company;

public interface CompanyRepository extends CrudRepository<Company, Long>{

}
