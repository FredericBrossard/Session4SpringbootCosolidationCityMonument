package co.simplon.patrimoine.controller;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;



import co.simplon.patrimoine.model.Monument;

import co.simplon.patrimoine.service.MonumentService;

@Controller
@RequestMapping("/monument")
public class MonumentController {

	@Inject
	MonumentService monumentService;

	/*
	 * CODE JavaScript à lancer depuis la console HTML var xmlhttp = new
	 * XMLHttpRequest(); xmlhttp.open("POST", "/monument/");
	 * xmlhttp.setRequestHeader("Content-Type", "application/json");
	 * xmlhttp.send(JSON.stringify({name:"Tour Effeil"}));
	 * 
	 * xmlhttp.response
	 */

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Long createCity(@RequestBody Monument monument) {

		Monument resp = monumentService.saveMonument(monument);
		System.out.println(resp.getName());
		return resp.getId();
	}

}
