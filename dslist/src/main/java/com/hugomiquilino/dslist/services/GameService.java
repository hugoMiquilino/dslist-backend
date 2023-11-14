package com.hugomiquilino.dslist.services;

import com.hugomiquilino.dslist.entities.Game;
import com.hugomiquilino.dslist.entities.dto.GameMinDTO;
import com.hugomiquilino.dslist.repositories.GameRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepositories gameRepositories;

    public List<GameMinDTO> findAll() {
        var result = gameRepositories.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
