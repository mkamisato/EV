package com.listcities.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.listcities.entity.City;
import com.listcities.model.MCity;
import com.listcities.service.CityService;

@RestController  // controlador de una apirest
@RequestMapping("/v1") //control de versiones
public class CityController {
	@Autowired
	@Qualifier("service")
	
	CityService service;
	@PutMapping("/city")
	public boolean addCity(@RequestBody @Valid City city ) { //requestbody-> pedir cuerpo de la peticion,valid -> Json convierte a nota
		
		return service.create(city);  
	}
	
	@GetMapping("/cities")
	public List<MCity> getCities(Pageable pageable){
		return service.getByPage(pageable);
	}
}
