package com.listcities.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.listcities.converter.Converter;
import com.listcities.entity.City;
import com.listcities.model.MCity;
import com.listcities.repository.CityRepository;

@Service("service")
public class CityService {
	
	@Autowired
	@Qualifier("repository")
	private CityRepository repository;
	
	@Autowired
	@Qualifier("converter")
	private Converter converter;
	
	private static final Log logger=LogFactory.getLog(CityService.class);
	
	public boolean create(City city ) {
		logger.info("CREATING CITY");
		try {
			repository.save(city);
			logger.info("CITY CREATED");
			return true;
		}catch(Exception e) {
			logger.error("SE HA PRODUCIDO UN ERROR");
			return false;
		}
		
	}
	public List<MCity> getCities(){
		logger.info("LISTING ALL CITIES");
		
		return converter.listConverter(repository.findAll());
		
	}
	public List<MCity> getByPage(Pageable pageable){
		return converter.listConverter(repository.findAll(pageable).getContent());
		
	}

}
