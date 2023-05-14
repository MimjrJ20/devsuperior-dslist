package com.devsuperior.dslist.dto;

public class ReplacementDTO {

    //ATRIBUTOS
    private Integer sourceIndex;
    private Integer destinationIndex;

    //GET E SET
    public Integer getSourceIndex() {
        return sourceIndex;
    }

    public void setSourceIndex(Integer sourceIndex) {
        this.sourceIndex = sourceIndex;
    }

    public Integer getDestinationIndex() {
        return destinationIndex;
    }

    public void setDestinationIndex(Integer destinationIndex) {
        this.destinationIndex = destinationIndex;
    }
}
