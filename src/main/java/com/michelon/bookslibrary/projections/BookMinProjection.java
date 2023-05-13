package com.michelon.bookslibrary.projections;

/**
 * @autor raqueldarellimichelon
 * created on 13/05/23 inside the package - com.michelon.bookslibrary.projections
 **/
public interface BookMinProjection {

    //create get methods that are corresponded with my query
    Long getId();
    String getTitle();
    Integer getBookYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();

}
