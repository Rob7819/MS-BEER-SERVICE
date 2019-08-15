package rjb.springservices.msbeerservice.services;

import org.springframework.stereotype.Service;
import rjb.springservices.msbeerservice.web.model.BeerDto;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        return null;
    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
