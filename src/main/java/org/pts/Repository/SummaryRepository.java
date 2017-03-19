package org.pts.Repository;

import org.pts.Model.Summary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by romanm on 14/03/17.
 */
@RepositoryRestResource(collectionResourceRel = "summary",path = "summary")
@Transactional
public interface SummaryRepository extends CrudRepository<Summary, Long> {


    @Query(value = "select sum(sm.amount) From SUMMARY sm where sm.player_id = :plid",nativeQuery = true)
    Long findSumOfAmountByPlayerId(@Param("plid")Long playerId);

    Summary findPlayerIdById(Long id);

    List<Summary> findSummaryByPlayer_Id(Long id);

}
