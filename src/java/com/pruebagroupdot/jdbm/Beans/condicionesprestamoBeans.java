/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebagroupdot.jdbm.Beans;

import com.pruebagroupdot.jdbm.DAO.condicionesprestamoDAO;
import com.pruebagroupdot.jdbm.entidades.condicionesprestamo;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Portatil-BM
 */
@ManagedBean
@RequestScoped
public class condicionesprestamoBeans {

    private condicionesprestamo cp = new condicionesprestamo();

    private condicionesprestamoDAO cpdao;

    private float cuotas, valorFinal,valorac;
    private condicionesprestamo prestador;

    public String obtenerData() {

        prestador = (condicionesprestamo) cpdao.obtPre(valorac);
        if (prestador == null) {

            FacesContext.getCurrentInstance()
                    .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "No hay prestamistas",
                    "No hay socio disponible."));

        } else {
            valorFinal = valorFin(prestador, valorac);
            cuotas = Cuotas(valorFinal);
        }
        System.out.println(""+prestador.getSocios_idSocios());
        return "welcomePrimefaces";
    }

    public float valorFin(condicionesprestamo cp, float valorAc) {

        valorFinal = cpdao.calcularValorFinal(cp.getTasa(), valorAc);
        return valorFinal;
    }

    public float Cuotas(float valfinal) {

        cuotas = cpdao.calcularcuotas(valfinal);
        return cuotas;
    }



    public condicionesprestamo getCp() {
        return cp;
    }

    public void setCp(condicionesprestamo cp) {
        this.cp = cp;
    }

    public float getCuotas() {
        return cuotas;
    }

    public void setCuotas(float cuotas) {
        this.cuotas = cuotas;
    }

    

    public condicionesprestamo getPrestador() {
        return prestador;
    }

    public void setPrestador(condicionesprestamo prestador) {
        this.prestador = prestador;
    }

    public float getValorac() {
        return valorac;
    }

    public void setValorac(float valorac) {
        this.valorac = valorac;
    }

    public float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }

    
}
