package rjb.springservices.msbeerservice.web.mappers;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import rjb.springservices.msbeerservice.domain.Beer;
import rjb.springservices.msbeerservice.web.model.BeerDto;

@Mapper(uses={DateMapper.class})
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDto beerDto);

    BeerDto beerToBeerDto(Beer beer);

}
