package io.microservicelab.countryservicefeign.utility;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface CountryService {

    @GetMapping("/rest/v2/all")
    public List<Object> getCountryList();
}
