package org.pts.Repository;

import org.pts.Model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

/**
 * Created by romanm on 12/03/17.
 */
@RepositoryRestResource(collectionResourceRel = "pl",path = "pl")
public interface PlayerRepository extends PagingAndSortingRepository<Player, Long> {
}
