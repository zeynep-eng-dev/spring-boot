package com.hıbernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(LibraryDB.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            List<LibraryDB> array = session.createQuery("from LibraryDB").getResultList();
            for (LibraryDB a : array) {
                System.out.println(a.getName());
            }
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
