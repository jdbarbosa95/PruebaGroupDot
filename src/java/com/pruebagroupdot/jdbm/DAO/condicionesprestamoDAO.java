/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebagroupdot.jdbm.DAO;

import com.pruebagroupdot.jdbm.entidades.condicionesprestamo;
import com.pruebagroupdot.jdbm.hibernate.hibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Portatil-BM
 */
public class condicionesprestamoDAO {
    
    float va;
    
   public float calcularValorFinal(float ti,float va){
        
        float vfinal = va *(1 + 36 * ti);
        return vfinal ;
    }
   
   public float calcularcuotas(float valorfinal){
       
       float valorCuotas = valorfinal / 36;
       return valorCuotas;  
       
       
   }
   public condicionesprestamo obtPre(float valorAc){
        try {
            Session session = hibernateUtil.getSessionfactory().openSession();
        String hql ="select * from condicionesprestamo where MontoMaxDisponible >='"+valorAc+"' order by Tasa asc limit 1";
        Query query = session.createQuery(hql);
       condicionesprestamo pre = (condicionesprestamo) query.list().get(1);
           
        return pre;
        
        } catch (Throwable e) {
             System.out.println("La creacion de factory ha fallado "+e);
            throw new ExceptionInInitializerError();
        }
        
    }
   
}
