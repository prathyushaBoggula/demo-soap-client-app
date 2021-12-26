package com.example.demosoapclientapp.endpoint;

import com.example.demosoapclientapp.repository.CountryRepository;
import com.example.demosoapclientapp.service.CountryService;
import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.GetCountryRequest;
import io.spring.guides.gs_producing_web_service.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CountryEndPoint {

    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service" ;

    private CountryService countryService ;

    @Autowired
    public CountryEndPoint(CountryService countryService) {
        this.countryService = countryService;
    }

    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    public GetCountryResponse getCountryRequest(@RequestPayload GetCountryRequest getCountryRequest) {
        GetCountryResponse getCountryResponse = new GetCountryResponse();
        getCountryResponse.setCountry(countryService.findCountry(getCountryRequest.getName()));
        return getCountryResponse ;
    }


}
