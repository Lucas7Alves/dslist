package com.gameproject.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gameproject.dslist.dto.GameListDTO;
import com.gameproject.dslist.entities.GameList;
import com.gameproject.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService; 
	
	@GetMapping
	public List<GameListDTO> findAll() {
		return gameListService.findAll();	
	}

}
