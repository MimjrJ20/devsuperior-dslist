package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {


    //ATRIBUTOS
    private Long id;
    private String name;

    //CONSTRUTOR VAZIO
    public GameListDTO(){

    }

    //CONSTRUTO COM ARGUMENTO
    public GameListDTO(GameList entity){
        id = entity.getId();
        name = entity.getName();
    }

    //GET
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
