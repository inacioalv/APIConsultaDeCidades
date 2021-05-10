package com.inacioalves.APIConsultaDeCidades.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inacioalves.APIConsultaDeCidades.Entity.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
