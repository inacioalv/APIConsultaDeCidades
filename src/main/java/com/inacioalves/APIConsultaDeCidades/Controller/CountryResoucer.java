package com.inacioalves.APIConsultaDeCidades.Controller;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import org.springframework.data.domain.Page;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inacioalves.APIConsultaDeCidades.Entity.Country;
import com.inacioalves.APIConsultaDeCidades.repository.CountryRepository;



@RestController
@RequestMapping("/countries")
public class CountryResoucer {
	
	private final CountryRepository repository;
	
	
	public CountryResoucer(CountryRepository repository) {
		super();
		this.repository = repository;
	}


	@GetMapping
	public Page<Country> countries(Pageable page){
		return repository.findAll(page);
	}
	
	@GetMapping("/{id}")
	public  ResponseEntity getOne(@PathVariable Long id) {
		 Optional<Country> optional = repository.findById(id);
		 
		 if(optional.isPresent()) {
			 
			 return ResponseEntity.ok().body(optional.get()) ;
		
		 }else {
			 
			 return ResponseEntity.notFound().build();
		 		}
		 }

}
