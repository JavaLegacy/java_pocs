package org.casehibernate.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtilTest {

	public static void main(String[] args) {
		Configuration configuration;

		/* The types above is interface */

		ServiceRegistry serviceRegistry;
		SessionFactory sessionFactory;
		Session session;

		try {

			configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);

			session = sessionFactory.openSession();

			Person person = new Person();
			person.setAge("22");
			person.setName("name");

			session.beginTransaction();
			session.save(person);
			session.getTransaction().commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
		}

	}

}
