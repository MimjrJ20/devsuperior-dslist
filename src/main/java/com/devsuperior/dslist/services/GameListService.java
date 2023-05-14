package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repositories.GameListRepository;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    //ATRIBUTO
    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;


    //MÉTODO
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        //map - para tranformar algo em outro coisa
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }


    //MÉTODO - ATUALIZAR A LISTA NO BD

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = gameRepository.searchByList(listId);

        //ATUALIZAR A MEMÓRIA DA POSIÇÃO
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        //encontrar MÁXIMO e MINIMO
        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        //loop
        for(int i = min; i<=max; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }



    }

}
