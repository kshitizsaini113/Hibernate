package com.kshitizsaini113.Hibernate004;

import com.kshitizsaini113.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Student student1 = session.get(Student.class, 1);
        System.out.println(student1);

        Student student2 = session.getReference(Student.class, 2);
        System.out.println(student2);

        session.close();
        sessionFactory.close();
    }
}
