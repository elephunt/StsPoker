package org.pts.Repository;

import org.pts.Model.Player;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "pl",path = "pl")
public interface PlayerRepository extends PagingAndSortingRepository<Player, Long> {


    Player findByFirstnameAndLastname(String firstname, String lastname);
}
