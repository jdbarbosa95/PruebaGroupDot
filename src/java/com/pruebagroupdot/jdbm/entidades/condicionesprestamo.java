/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebagroupdot.jdbm.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Portatil-BM
 */
public class condicionesprestamo {
    
   

    @Id
    private int idCondicionesPrestamo;
    private float Tasa;
    private float MontoMaxDisponible;
    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Socios Socios_idSocios;    

    public condicionesprestamo() {
    }

    public condicionesprestamo( float Tasa, float MontoMaxDisponible, Socios Socios_idSocios) {
    
        this.Tasa = Tasa;
        this.MontoMaxDisponible = MontoMaxDisponible;
        this.Socios_idSocios = Socios_idSocios;
    }

   
    
    public int getIdCondicionesPrestamo() {
        return idCondicionesPrestamo;
    }

    public void setIdCondicionesPrestamo(int idCondicionesPrestamo) {
        this.idCondicionesPrestamo = idCondicionesPrestamo;
    }

    public float getTasa() {
        return Tasa;
    }

    public void setTasa(float Tasa) {
        this.Tasa = Tasa;
    }

    public float getMontoMaxDisponible() {
        return MontoMaxDisponible;
    }

    public void setMontoMaxDisponible(float MontoMaxDisponible) {
        this.MontoMaxDisponible = MontoMaxDisponible;
    }

    public Socios getSocios_idSocios() {
        return Socios_idSocios;
    }

    public void setSocios_idSocios(Socios Socios_idSocios) {
        this.Socios_idSocios = Socios_idSocios;
    }
    
    
    
    
}
