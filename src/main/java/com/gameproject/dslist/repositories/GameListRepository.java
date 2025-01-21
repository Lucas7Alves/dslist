package com.gameproject.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository	;

import com.gameproject.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	

}
