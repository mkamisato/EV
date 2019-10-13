package com.listcities.repository;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.listcities.entity.City;
@Repository("repository")
public interface CityRepository extends JpaRepository <City,Serializable>, PagingAndSortingRepository<City,Serializable>{

	public abstract City findByName(String name); // devolver registro con el nombre, Spring monta la query


	//public abstract City findById(int id);
	
	public abstract City findByNameAndId(String name,int id);
	
	public abstract Page<City>findAll(Pageable pageable);
}