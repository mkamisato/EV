package com.listcities.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.listcities.entity.City;
import com.listcities.model.MCity;

@Component("converter")
public class Converter {
	
	public List<MCity>	listConverter(List<City> cities){
	
		List<MCity> mcities=new ArrayList<>();
		for(City city: cities) {// pasar lista de city a mcity
			mcities.add(new MCity(city));
		}
		return mcities;
	}
	
		
	

}
