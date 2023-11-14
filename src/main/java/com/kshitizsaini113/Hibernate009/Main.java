package com.kshitizsaini113.Hibernate009;

import com.kshitizsaini113.Entity.Question1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Question1 question1 = session.get(Question1.class, 1);
        System.out.println(question1.getQuestionId());
        System.out.println(question1.getQuestion());

        System.out.println(question1.getAnswers().size());

        session.close();
        sessionFactory.close();
    }
}
