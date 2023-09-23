package com.kshitizsaini113.Hibernate005;

import com.kshitizsaini113.Entity.Country;
import com.kshitizsaini113.Entity.EmbeddableCapital;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Country country1 = new Country();
        country1.setCountryName("ABC");

        EmbeddableCapital embeddableCapital1 = new EmbeddableCapital();
        embeddableCapital1.setEmbeddableCapitalName("FGH");

        country1.setEmbeddableCapital(embeddableCapital1);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(country1);
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
