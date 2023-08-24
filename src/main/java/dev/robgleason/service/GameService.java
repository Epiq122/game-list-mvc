package dev.robgleason.service;


import dev.robgleason.entity.Game;

import java.util.List;

public interface GameService {
    List<Game> findAll();

    Game findById(int id);

    Game save(Game game);

    void deleteById(int id);


}
