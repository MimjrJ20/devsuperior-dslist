package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game_list")
public class GameList {

    //ATRIBUTOS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    //CONSTRUTOR VAZIO
    public GameList(){

    }

    //CONSTRUTOR COM ARGUMENTOS
    public GameList(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    //GET E SET
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //EQUALS - comparar um gameList com o outro
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameList gameListOther = (GameList) o;
        return Objects.equals(id, gameListOther.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
