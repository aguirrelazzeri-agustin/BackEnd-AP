
package com.portafolio.aal.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String fechaE;
    private String linkE;
    private String linkkE;
    private String linkkkE;

    
    //Consutructores

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String fechaE, String linkE, String linkkE, String linkkkE) {
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

    public void setLinkkkE(String linkkkE) {
        this.linkkkE = linkkkE;
    }
    
    //Getter & Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
