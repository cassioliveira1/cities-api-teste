package com.github.cassioliveira1.citiesapi.countries.repository;

import com.github.cassioliveira1.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
