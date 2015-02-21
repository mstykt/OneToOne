/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mesut.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author mesut
 */
public class Main {
    public static void main(String[] args) {
        Personel personel=new Personel();
        personel.setAdi("Mehmet");
        personel.setSoyadi("Yıldız");
        //-------------------------------------
        
        Meslek meslek=new Meslek();
        meslek.setMeslekAdi("Öğrenci");
        //-------------------------------------
        
        personel.setMeslek(meslek);
        meslek.setPersonel(personel);
        
        SessionFactory sf= new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        session.beginTransaction();
        session.save(personel);
        session.save(meslek);
        session.getTransaction().commit();
        session.close();
        sf.close();
    }
}
