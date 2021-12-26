package com.example.demosoapclientapp.repository;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();
    public Country findCountryRep(String name) {

        return  countries.get(name) ;
    }

    @PostConstruct
    public void initData() {

        Country country1 = new Country();
        country1.setName("India");
        country1.setCapital("Delhi");
        country1.setCurrency(Currency.EUR);
        country1.setPopulation(100000000);
        countries.put(country1.getName(), country1);

        Country country2 = new Country();
        country2.setName("USA");
        country2.setCapital("W DC");
        country2.setCurrency(Currency.EUR);
        country2.setPopulation(100000000);
        countries.put(country2.getName(), country2);

        Country country3 = new Country();
        country3.setName("UK");
        country3.setCapital("London");
        country3.setCurrency(Currency.EUR);
        country3.setPopulation(100000000);
        countries.put(country3.getName(), country3);


    }
}
