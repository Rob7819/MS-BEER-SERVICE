package rjb.springservices.msbeerservice.web.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rjb.springservices.msbeerservice.services.BeerService;
import rjb.springservices.msbeerservice.web.model.BeerDto;

import javax.validation.Valid;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {
    //Note that there is another use of validation at controller level which requires the @Validated at class level (above here)
    //with the field annotation used with the method parameter.  This use is not required here but may be needed in other situations...

    private final BeerService beerService;

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer (@PathVariable UUID beerId) {

        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@Valid @RequestBody BeerDto beerDto){

        return new ResponseEntity<>(beerService.saveNewBeer(beerDto), HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity handleUpdate(@PathVariable UUID beerId, @Valid @RequestBody BeerDto beerDto){

        return new ResponseEntity<>(beerService.updateBeer(beerId, beerDto), HttpStatus.NO_CONTENT);

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping({"/{beerId}"})
    public void deleteBeer (@PathVariable UUID beerId){

        beerService.deleteById(beerId);

    }
}
