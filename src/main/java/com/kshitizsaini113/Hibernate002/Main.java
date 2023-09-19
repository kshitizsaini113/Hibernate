package com.kshitizsaini113.Hibernate002;

import com.kshitizsaini113.Hibernate002.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Student student1 = new Student();
        student1.setStudentID(101);
        student1.setStudentName("ABC");
        student1.setStudentSchool("XYZ");
        System.out.println(student1);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(student1);
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
