package org.pts.Controller;

import org.pts.Manager.PlayersManager;
import org.pts.Model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/players/")
public class PlayerController {


    @Autowired
    private PlayersManager playersManager;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Player> getAllPlayers(){
        return playersManager.getAllPlayers();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Player addPlayer(@RequestBody Player player) {
        return playersManager.addNewPlayer(player);
    }


    @RequestMapping(value = "find", method = RequestMethod.GET)
    public Player findPlayerByFirstNameAndLastName(@RequestParam String firstName, @RequestParam String lastName) {
        return playersManager.getPlayerByNameAndLastName(firstName, lastName);
    }



}
