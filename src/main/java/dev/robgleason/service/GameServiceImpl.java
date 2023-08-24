package dev.robgleason.service;


import dev.robgleason.entity.Game;
import dev.robgleason.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService {

    // set up constructor injection
    private GameRepository gameRepository;

    @Autowired
    public GameServiceImpl(GameRepository theGameRepository) {
        gameRepository = theGameRepository;
    }

    @Override
    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    @Override
    public Game findById(int theId) {
        Optional<Game> result = gameRepository.findById(theId);

        Game theGame = null;

        if (result.isPresent()) {
            theGame = result.get();
        } else {
            // we didn't find the employee
            throw new RuntimeException("Did not find game id - " + theId);
        }

        return theGame;
    }

    @Transactional
    @Override
    public Game save(Game game) {
        return gameRepository.save(game);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        gameRepository.deleteById(id);
    }
}
