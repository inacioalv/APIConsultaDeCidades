package com.inacioalves.APIConsultaDeCidades.Controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inacioalves.APIConsultaDeCidades.Entity.City;
import com.inacioalves.APIConsultaDeCidades.repository.CityRepository;

@RestController
@RequestMapping("/cities")
public class CityResoucer {
	
	private final CityRepository repository;

	public CityResoucer(CityRepository repository) {
		super();
		this.repository = repository;
	}
	
	@GetMapping
	public Page<City> cities(final Pageable page){
		return repository.findAll(page);
	}
	

}
