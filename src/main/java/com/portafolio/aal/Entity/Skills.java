/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.aal.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author lazze
 */
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombreSkill;
    private String imgSkill;
    private int porcentaje;
    
    //Constructores

    public Skills() {
    }

    public Skills(String nombreSkill, String imgSkill, int porcentaje) {
        this.nombreSkill = nombreSkill;
        this.imgSkill = imgSkill;
        this.porcentaje = porcentaje;
    }
    //Getter && Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public String getImgSkill() {
        return imgSkill;
    }

    public void setImgSkill(String imgSkill) {
        this.imgSkill = imgSkill;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
}
