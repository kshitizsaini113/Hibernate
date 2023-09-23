package com.kshitizsaini113.Hibernate006;

import com.kshitizsaini113.Entity.Answer;
import com.kshitizsaini113.Entity.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Question question = new Question();
        question.setQuestion("What is the answer?");
        Answer answer = new Answer();
        answer.setAnswer("THis is an answer");
        question.setAnswer(answer);
        answer.setQuestion(question);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(question);
        session.persist(answer);
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
