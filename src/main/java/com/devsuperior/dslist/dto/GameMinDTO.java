package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {

    //ATRIBUTOS
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    //CONSTRUTOR VAZIO
    public GameMinDTO(){

    }

    //CONSTRUTOR COM ARGUMENTOS
    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    //GET - DTO não precisa de SET
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
