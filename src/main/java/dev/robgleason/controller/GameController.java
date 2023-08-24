package dev.robgleason.controller;


import dev.robgleason.entity.Game;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/games")
public class GameController {

    // load game data

    private List<Game> theGames;

    @PostConstruct
    private void loadData() {

        // create games

        Game game1 = new Game("Baldurs Gate 3", "Larian Games", "larian@games.com");
        Game game2 = new Game("The Witcher 4", "CD Projekt Red", "contact@cdprojektred.com");
        Game game3 = new Game("Elder Scrolls VI", "Bethesda Game Studios", "info@bethesda.net");

        // create the list
        theGames = new ArrayList<>();

        // add to the list
        theGames.add(game1);
        theGames.add(game2);
        theGames.add(game3);

    }

    // add mapping for "/list"
    // add to the spring model
    @GetMapping("/list")
    public String listGames(Model theModel) {
        theModel.addAttribute("games", theGames);
        return "list-games";
    }

}
