package org.pts.Runner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.pts.Model.Player;
import org.pts.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import javax.sql.DataSource;

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
    private DataSource dataSource;

    public void run(String... strings) throws Exception {
        for (int i = 0; i < 500; i++) {
            Player player = new Player();
            player.setFirstName("Test" + i);
            player.setLastName("TestL" + i);
            repository.save(player);
        }
        logger.info("Hello");
        logger.info("Data Source " + dataSource.toString());
        logger.info("Count of players : " + repository.count());
        repository.findAll().forEach(Player ->{
            System.out.println(Player.toString());
        });
    }
}
