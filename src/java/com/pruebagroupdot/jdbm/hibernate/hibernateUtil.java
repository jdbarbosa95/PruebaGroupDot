package com.pruebagroupdot.jdbm.hibernate;



import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Portatil-BM
 */
public class hibernateUtil {
    
    private static final SessionFactory sessionfactory =  buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        
        try {
            Configuration  confi = new Configuration();
            confi.configure("hibernate.cfg.xml");
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(confi.getProperties()).build();
            
            SessionFactory sessionFactory = confi.buildSessionFactory(serviceRegistry);
            return sessionFactory;
        } catch (Throwable e) 
        {
            System.out.println("La creacion de factory ha fallado "+e);
            throw new ExceptionInInitializerError();
        }

    }

    public static SessionFactory getSessionfactory() {
        return sessionfactory;
    }

    
}
    
    

