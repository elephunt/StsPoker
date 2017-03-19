package org.pts.Runner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.pts.Model.Player;
import org.pts.Model.Summary;
import org.pts.Repository.PlayerRepository;
import org.pts.Repository.SummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import javax.sql.DataSource;
import java.util.Date;
import java.util.HashSet;

/**
 * Created by romanm on 12/03/17.
 */

/**
 * This class init. once on starting
 */
public class RunnerCmd implements CommandLineRunner {

    protected final Log logger = LogFactory.getLog(getClass());



    @Autowired
    PlayerRepository repository;

    @Autowired
    SummaryRepository summaryRepository;

    @Autowired
    private DataSource dataSource;

    public void run(final String... strings) throws Exception {
        for (int i = 0; i < 500; i++) {
            Player player = new Player();
            player.setFirstName("Test" + i);
            player.setLastName("TestL" + i);
            repository.save(player);
            HashSet<Summary> ss = new HashSet<>();
            for (int j = 0; j < 2; j++) {
                Summary summary = new Summary();
                summary.setDate(new Date());
                summary.setAmount(23l * i);
                summary.setPlayer(player);
                ss.add(summary);
            }
            summaryRepository.save(ss);
        }

        logger.info("Hello");
        logger.info("Data Source " + dataSource.toString());
        logger.info("Count of players : " + repository.count());
        logger.info("Count of summary : " + summaryRepository.count());
        Player one = repository.findOne(3l);

        logger.info(summaryRepository.findSumOfAmountByPlayerId(443l));
        logger.info(summaryRepository.findPlayerIdById(1l).getPlayer().getId());
        //   logger.info(one.toString());
    }
}
