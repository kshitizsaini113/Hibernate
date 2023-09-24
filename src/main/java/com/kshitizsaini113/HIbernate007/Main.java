package com.kshitizsaini113.HIbernate007;

import com.kshitizsaini113.Entity.Answer1;
import com.kshitizsaini113.Entity.Question1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        List<Answer1> answers = new ArrayList<Answer1>();

        Question1 question = new Question1();
        question.setQuestion("What is the answer?");
        Answer1 answer1 = new Answer1();
        answer1.setAnswer("This is an answer");
        answer1.setQuestion(question);
        answers.add(answer1);
        Answer1 answer2 = new Answer1();
        answer2.setAnswer("This is also an answer");
        answer2.setQuestion(question);
        answers.add(answer2);
        Answer1 answer3 = new Answer1();
        answer3.setAnswer("This is also an alternate answer");
        answer3.setQuestion(question);
        answers.add(answer3);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(question);
        session.persist(answer1);
        session.persist(answer2);
        session.persist(answer3);
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
