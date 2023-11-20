package com.kshitizsaini113.Hibernate011;

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

        String queryString1 = "delete from Student as s where s.studentID=:x";
        Query<?> query1 = session.createQuery(queryString1);
        query1.setParameter("x", "1");

        Transaction tx = session.beginTransaction();
        int updatedNo = query1.executeUpdate();
        tx.commit();

        System.out.println("Number of updated rows are : " + updatedNo);

        session.close();
        sessionFactory.close();
    }
}
