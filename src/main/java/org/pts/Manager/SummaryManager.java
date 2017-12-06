package org.pts.Manager;

import org.pts.Model.Player;
import org.pts.Model.Summary;
import org.pts.Repository.PlayerRepository;
import org.pts.Repository.SummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by roman on 06/12/17.
 */
@Service
public class SummaryManager {

    @Autowired
    SummaryRepository summaryRepository;

    @Autowired
    PlayerRepository playerRepository;

    public Summary getSummary(Player player) {
        List<Summary> summaryByPlayer_id = summaryRepository.findSummaryByPlayer_Id(player.getId());
        long sum = summaryByPlayer_id
                .stream()
                .mapToLong(summary -> summary.getAmount()).sum();
        Summary summary = new Summary();
        summary.setPlayer(player);
        summary.setAmount(sum);
        summary.setDate(new Date());
        return summary;
    }


    public void addSummary(Player player, Long sum) {
        Player playerDto = playerRepository.findByFirstnameAndLastname(player.getFirstname(), player.getLastname());
        Summary summary = new Summary();
        summary.setAmount(sum);
        summary.setDate(new Date());
        summary.setPlayer(playerDto);
        summaryRepository.save(summary);
    }


}
