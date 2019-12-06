package rjb.springservices.msbeerservice.services;

import org.springframework.http.ResponseEntity;
import rjb.springservices.msbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
