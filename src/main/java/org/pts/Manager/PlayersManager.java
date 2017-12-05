package org.pts.Manager;

import com.google.common.collect.Lists;
import org.pts.Model.Player;
import org.pts.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PlayersManager {

    @Autowired
    PlayerRepository repository;

    public List<Player> getAllPlayers(){
        return Lists.newArrayList(repository.findAll());
    }


    public Player addNewPlayer(Player player) {
        Player savedPlayer = repository.save(player);
        return savedPlayer;
    }

}
