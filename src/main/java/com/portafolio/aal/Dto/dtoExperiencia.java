/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.aal.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String fechaE;
    @NotBlank
    private String linkE;
    @NotBlank
    private String linkkE;
    @NotBlank
    private String linkkkE;
    
    //Constructor//

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String fechaE, String linkE, String linkkE, String linkkkE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechaE = fechaE;
        this.linkE = linkE;
        this.linkkE = linkkE;
        this.linkkkE = linkkkE;
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

    //Getter & Setter//
    public void setLinkkkE(String linkkkE) {
        this.linkkkE = linkkkE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }

 
    
}
