package com.inacioalves.APIConsultaDeCidades.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inacioalves.APIConsultaDeCidades.Entity.State;

public interface StateRepository extends JpaRepository<State, Long>{

}
