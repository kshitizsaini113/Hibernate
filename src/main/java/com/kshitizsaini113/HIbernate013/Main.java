package com.kshitizsaini113.HIbernate013;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        String queryString1 = "select q.questionId, q.question, a.answerId, a.answer from Question1 as q inner join q.answers as a";
        Query<?> query1 = session.createQuery(queryString1);

        List<Object[]> list = (List<Object[]>) query1.getResultList();

        for(Object[] arr: list) {
            System.out.println(Arrays.toString(arr));
        }

        session.close();
        sessionFactory.close();
    }
}
