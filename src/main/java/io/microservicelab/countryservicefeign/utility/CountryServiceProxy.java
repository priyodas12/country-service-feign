package io.microservicelab.countryservicefeign.utility;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "country-service")
public interface CountryServiceProxy extends CountryService{
}
