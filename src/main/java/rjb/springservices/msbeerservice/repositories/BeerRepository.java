package rjb.springservices.msbeerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import rjb.springservices.msbeerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
