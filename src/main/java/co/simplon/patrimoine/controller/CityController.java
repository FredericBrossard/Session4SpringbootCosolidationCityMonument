package co.simplon.patrimoine.controller;



import javax.inject.Inject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import co.simplon.patrimoine.model.City;
import co.simplon.patrimoine.service.CityServiceImpl;

@Controller
@RequestMapping("/city")
public class CityController {
	
	@Inject
	CityServiceImpl cityService;
	
	
	/* CODE JavaScript à lancer depuis la console HTML
	var xmlhttp = new XMLHttpRequest();
	xmlhttp.open("POST", "/city/");
	xmlhttp.setRequestHeader("Content-Type", "application/json");
	xmlhttp.send(JSON.stringify({name:"Londres"}));

	xmlhttp.response
	*/
		
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Long createCity(@RequestBody City city) {
		
		City resp = cityService.saveCity(city);
		 System.out.println(resp.getName());
		return resp.getId();
	}

}
