package guru.springframework.spring5webapp.repo;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.model.Location;

public interface LocationRepository extends CrudRepository<Location, Long> {

}
