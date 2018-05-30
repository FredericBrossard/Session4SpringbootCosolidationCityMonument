package co.simplon.patrimoine.repository;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.patrimoine.model.City;
//<type de la classe et Type de la clef primaire> = <T, ID>
@Named
public interface CityRepository extends JpaRepository<City, Long>{

	List<City> findByName(String name);
	
	
	Optional<City> findById(Long Id);
}
