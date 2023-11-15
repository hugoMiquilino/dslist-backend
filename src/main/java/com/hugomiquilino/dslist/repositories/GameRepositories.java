package com.hugomiquilino.dslist.repositories;

import com.hugomiquilino.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepositories extends JpaRepository<Game, Long> {

}
