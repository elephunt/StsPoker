package org.pts.Repository;

import org.pts.Model.Player;
import org.pts.Model.Summary;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by romanm on 12/03/17.
 */
@RepositoryRestResource(collectionResourceRel = "pl",path = "pl")
public interface PlayerRepository extends PagingAndSortingRepository<Player, Long> {

}
