package com.kshitizsaini113.Hibernate003;

import com.kshitizsaini113.Entity.Student;
import com.kshitizsaini113.Entity.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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

        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("src/main/resources/image.png");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        byte[] data;
        try {
            data = new byte[fileInputStream.available()];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fileInputStream.read(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        address1.setImage(data);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(student1);
        session.persist(address1);
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
