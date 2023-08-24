package dev.robgleason.controller;

import dev.robgleason.entity.Game;
import dev.robgleason.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/games")
public class GameController {

    private GameService gameService;

    public GameController(GameService theGameService) {
        gameService = theGameService;
    }
    // add mapping for "/list"

    @GetMapping("/list")
    public String listGames(Model theModel) {
        // get the games from the DB
        List<Game> theGames = gameService.findAll();
        // add to the spring model
        theModel.addAttribute("games", theGames);
        return "list-games";
    }

}
