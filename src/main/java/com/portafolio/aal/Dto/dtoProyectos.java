/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.aal.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author lazze
 */
public class dtoProyectos {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String fechaE;
    @NotBlank
    private String linkE;
    @NotBlank
    private String linkkE;
    @NotBlank
    private String linkkkE;
    
     //Constructores

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreP, String descripcionP, String fechaE, String linkE, String linkkE, String linkkkE) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.fechaE = fechaE;
        this.linkE = linkE;
        this.linkkE = linkkE;
        this.linkkkE = linkkkE;
    }
       //Getters y Setters

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }

    public String getLinkE() {
        return linkE;
    }

    public void setLinkE(String linkE) {
        this.linkE = linkE;
    }

    public String getLinkkE() {
        return linkkE;
    }

    public void setLinkkE(String linkkE) {
        this.linkkE = linkkE;
    }

    public String getLinkkkE() {
        return linkkkE;
    }

    public void setLinkkkE(String linkkkE) {
        this.linkkkE = linkkkE;
    }
    
}
