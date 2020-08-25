package io.microservicelab.countryservicefeign.controller;

import io.microservicelab.countryservicefeign.utility.CountryService;
import io.microservicelab.countryservicefeign.utility.CountryServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@EnableFeignClients(basePackageClasses = io.microservicelab.countryservicefeign.utility.CountryServiceProxy.class)
public class CountryServiceController implements CountryService {

    @Autowired
    private CountryServiceProxy countryServiceProxy;

    @Override
    @GetMapping("/countries")
    public List<Object> getCountryList() {
        return countryServiceProxy.getCountryList();
    }
}
