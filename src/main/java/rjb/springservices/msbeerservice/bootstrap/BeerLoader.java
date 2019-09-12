package rjb.springservices.msbeerservice.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rjb.springservices.msbeerservice.domain.Beer;
import rjb.springservices.msbeerservice.repositories.BeerRepository;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {

        if(beerRepository.count() == 0){

            beerRepository.save(Beer.builder()
                    .beerName("Black Goat")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minOnHand(16)
                    .upc(437900121136L)
                    .price(new BigDecimal("15.66"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Dry Bone")
                    .beerStyle("Lager")
                    .quantityToBrew(150)
                    .minOnHand(41)
                    .upc(437900121137L)
                    .price(new BigDecimal("17.29"))
                    .build());

        }

        System.out.println("Loaded Beers: " + beerRepository.count());

    }
}
