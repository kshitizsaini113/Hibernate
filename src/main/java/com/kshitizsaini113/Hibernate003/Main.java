package com.kshitizsaini113.Hibernate003;

import com.kshitizsaini113.Entity.Student;
import com.kshitizsaini113.Entity.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Student student1 = new Student();
        student1.setStudentName("ABC");
        student1.setStudentSchool("XYZ");
        System.out.println(student1);

        Address address1 = new Address();
        address1.setAddressStreet("Street 1");
        address1.setAddressCity("City 1");
        address1.setAddressDescription("Description");
        address1.setAddressCityMetro(true);
        address1.setAddedDate(new Date());

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(student1);
        session.persist(address1);
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
