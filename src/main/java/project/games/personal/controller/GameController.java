package project.games.personal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.games.personal.dto.GameDTO;
import project.games.personal.dto.GameMinDTO;
import project.games.personal.service.GameService;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findByID(@PathVariable Long id){
        return gameService.findById(id);
    }


    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();

    }
}
