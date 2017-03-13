package org.pts.Repository;

import org.pts.Model.Player;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by romanm on 12/03/17.
 */
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
