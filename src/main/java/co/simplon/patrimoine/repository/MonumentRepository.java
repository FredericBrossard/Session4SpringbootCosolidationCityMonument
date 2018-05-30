package co.simplon.patrimoine.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.patrimoine.model.Monument;

public interface MonumentRepository extends JpaRepository<Monument, Long>{
//Optionnal permet d'eviter un objet null
	public Optional<Monument> findByName(String name);
	
}
