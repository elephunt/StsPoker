package org.pts.Controller;

import org.pts.Manager.PlayersManager;
import org.pts.Manager.SummaryManager;
import org.pts.Model.Player;
import org.pts.Model.Summary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by roman on 06/12/17.
 */
@RestController
@RequestMapping(value = "/summary/")
public class SummaryController {

    @Autowired
    private SummaryManager summaryManager;

    @Autowired
    private PlayersManager playersManager;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public void addSummary(@RequestBody Player player, @RequestParam Long sum) {
        summaryManager.addSummary(player, sum);
    }

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public Summary Summary(@RequestParam String firstName, @RequestParam String lastName) {
        Player playerByNameAndLastName = playersManager.getPlayerByNameAndLastName(firstName, lastName);
        return summaryManager.getSummary(playerByNameAndLastName);
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public List<Summary> getAllSummaries(@RequestParam String firstName, String lastName) {
        Player player = playersManager.getPlayerByNameAndLastName(firstName, lastName);
        return summaryManager.getSummaries(player);
    }

}
