package co.simplon.patrimoine.service;

import javax.inject.Inject;
import javax.inject.Named;

import co.simplon.patrimoine.model.City;
import co.simplon.patrimoine.model.Monument;
import co.simplon.patrimoine.repository.CityRepository;
import co.simplon.patrimoine.repository.MonumentRepository;
@Named
public class MonumentServiceImpl implements MonumentService{

	@Inject MonumentRepository monumentRepo;
	
	public Monument saveMonument(Monument monument) {
		monumentRepo.save(monument);
		return monument;
		
		
	}
}