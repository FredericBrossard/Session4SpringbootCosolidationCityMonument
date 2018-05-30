package co.simplon.patrimoine.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Service;

import co.simplon.patrimoine.model.City;
import co.simplon.patrimoine.model.Monument;
import co.simplon.patrimoine.repository.CityRepository;

@Service
@Named
public class CityServiceImpl implements CityService{
	@Inject
	private CityRepository cityRepo;
	
	
	@Override
	public City saveCity(City city) {
		cityRepo.save(city);
		return city;
	}

}
