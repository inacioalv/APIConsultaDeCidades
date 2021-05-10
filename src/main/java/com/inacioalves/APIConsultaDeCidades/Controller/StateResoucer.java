package com.inacioalves.APIConsultaDeCidades.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inacioalves.APIConsultaDeCidades.Entity.State;
import com.inacioalves.APIConsultaDeCidades.repository.StateRepository;

@RestController
@RequestMapping("/state")
public class StateResoucer {
	
	private final StateRepository repository;

	public StateResoucer(StateRepository repository) {
		super();
		this.repository = repository;
	}
	
	@GetMapping
	public List<State> state(){
		return repository.findAll();
	}
	

}
