package com.hugomiquilino.dslist.services;

import com.hugomiquilino.dslist.entities.Game;
import com.hugomiquilino.dslist.entities.dto.GameDTO;
import com.hugomiquilino.dslist.entities.dto.GameMinDTO;
import com.hugomiquilino.dslist.repositories.GameRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepositories gameRepositories;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepositories.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        var result = gameRepositories.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
