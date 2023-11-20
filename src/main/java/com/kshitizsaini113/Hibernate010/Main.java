package com.kshitizsaini113.Hibernate010;

import com.kshitizsaini113.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        String queryString1 = "from Student";
        Query<Student> query1 = session.createQuery(queryString1, Student.class);

        List<Student> list1 = query1.list();

        for(Student stu: list1) {
            System.out.println(stu);
        }

        String queryString2 = "from Student as s where s.studentID>:x";
        Query<Student> query2 = session.createQuery(queryString2, Student.class);
        query2.setParameter("x", "2");

        List<Student> list2 = query2.list();

        for(Student stu: list2) {
            System.out.println(stu);
        }

        session.close();
        sessionFactory.close();
    }
}
