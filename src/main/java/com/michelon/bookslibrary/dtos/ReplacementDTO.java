package com.michelon.bookslibrary.dtos;

/**
 * @autor raqueldarellimichelon
 * created on 13/05/23 inside the package - com.michelon.bookslibrary.dtos
 **/
public class ReplacementDTO {
    private Integer sourceIndex;
    private Integer destinationIndex;

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


