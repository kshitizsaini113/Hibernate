package com.kshitizsaini113.Hibernate001;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Project Started");
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        System.out.println("Session Factory : " + sessionFactory);
        System.out.println(sessionFactory.isClosed());
        sessionFactory.close();
        System.out.println(sessionFactory.isClosed());
    }
}
