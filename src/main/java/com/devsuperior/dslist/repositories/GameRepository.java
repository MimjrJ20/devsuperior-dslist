package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

//CONSULTA BD - 01
public interface GameRepository extends JpaRepository<Game, Long> {

}
