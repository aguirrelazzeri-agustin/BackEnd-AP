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
    private String fechaP;
    @NotBlank
    private String linkP;
    @NotBlank
    private String MateriaP;
    @NotBlank
    private String linkComP;
    
     //Constructores

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreP, String descripcionP, String fechaP, String linkP, String MateriaP, String linkComP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.fechaP = fechaP;
        this.linkP = linkP;
        this.MateriaP = MateriaP;
        this.linkComP = linkComP;
        
    }
    
    //geter and setter 

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

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }

    public String getLinkP() {
        return linkP;
    }

    public void setLinkP(String linkP) {
        this.linkP = linkP;
    }

    public String getMateriaP() {
        return MateriaP;
    }

    public void setMateriaP(String MateriaP) {
        this.MateriaP = MateriaP;
    }

    public String getLinkComP() {
        return linkComP;
    }

    public void setLinkComP(String linkComP) {
        this.linkComP = linkComP;
    }
    
    }

   