package com.kshitizsaini113.Hibernate012;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        String queryString1 = "update Student as s set s.studentName=:x where s.studentID=:y";
        Query<?> query1 = session.createQuery(queryString1);
        query1.setParameter("x", "TestingUpdate");
        query1.setParameter("y", "2");

        Transaction tx = session.beginTransaction();
        int updatedNo = query1.executeUpdate();
        tx.commit();

        System.out.println("Number of updated rows are : " + updatedNo);

        session.close();
        sessionFactory.close();
    }
}
