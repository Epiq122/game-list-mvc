package dev.robgleason.repository;

import dev.robgleason.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Integer> {

    // add a method to sort by game developer
    List<Game> findAllByOrderByGameDeveloperAsc();
}
