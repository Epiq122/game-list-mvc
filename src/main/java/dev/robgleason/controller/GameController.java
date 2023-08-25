package dev.robgleason.controller;

import dev.robgleason.entity.Game;
import dev.robgleason.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "games/list-games";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        //create model attribute to bind form data
        Game theGame = new Game();
        theModel.addAttribute("game", theGame);
        return "games/game-form";
    }

    // saving our game
    @PostMapping("/save")
    public String saveGame(@ModelAttribute("game") Game theGame) {
        // save the game
        gameService.save(theGame);
        // use a redirect to prevent duplicate entries
        return "redirect:/games/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("gameId") int theId, Model theModel) {
        // get the game from the service
        Game theGame = gameService.findById(theId);

        // set game as a model attribute to pre-populate the form
        theModel.addAttribute("game", theGame);

        // send to the form
        return "games/game-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("gameId") int theId) {
        // delete the game
        gameService.deleteById(theId);
        return "redirect:/games/list";
    }
}
