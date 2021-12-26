package com.example.demosoapclientapp.service;

import com.example.demosoapclientapp.repository.CountryRepository;
import io.spring.guides.gs_producing_web_service.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    private CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Country findCountry(String name) {

        return countryRepository.findCountryRep(name) ;
    }

}
