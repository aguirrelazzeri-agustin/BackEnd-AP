/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.aal.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreP;
    private String descripcionP;
    private String fechaP;
    private String linkP;
    private String materiaP;
    private String integrantesP;
    private String linkComP;
    
    //Constructores

    public Proyecto() {
    }

    public Proyecto(String nombreP, String descripcionP, String fechaP, String linkP, String materiaP, String integrantesP, String linkComP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.fechaP = fechaP;
        this.linkP = linkP;
        this.materiaP = materiaP;
        this.integrantesP = integrantesP;
        this.linkComP = linkComP;
    }

    public Proyecto(String nombreP, String descripcionP, String fechaE, String linkE, String linkkE, String linkkkE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
            

    //Getter && Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
        return materiaP;
    }

    public void setMateriaP(String materiaP) {
        this.materiaP = materiaP;
    }

    public String getIntegrantesP() {
        return integrantesP;
    }

    public void setIntegrantesP(String integrantesP) {
        this.integrantesP = integrantesP;
    }

    public String getLinkComP() {
        return linkComP;
    }

    public void setLinkComP(String linkComP) {
        this.linkComP = linkComP;
    }
    
    
}
