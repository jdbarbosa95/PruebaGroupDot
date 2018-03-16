/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebagroupdot.jdbm.entidades;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Portatil-BM
 */
@Entity
public class Socios implements Serializable{
   @Id
   private int idSocios;
    private String NombreSocio;

    public Socios() {
    }

    public Socios(String NombreSocio) {
           this.NombreSocio = NombreSocio;
    }
    
    

    public int getIdSocios() {
        return idSocios;
    }

    public void setIdSocios(int idSocios) {
        this.idSocios = idSocios;
    }

    public String getNombreSocio() {
        return NombreSocio;
    }

    public void setNombreSocio(String NombreSocio) {
        this.NombreSocio = NombreSocio;
    }
    
    
    
    
}
