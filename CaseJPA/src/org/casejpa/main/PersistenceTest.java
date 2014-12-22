package org.casejpa.main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

public class PersistenceTest {

	public static void main(String[] args) {

		try {
			EntityManagerFactory entityManagerFactory = EntityManagerUtil
					.getEntityManagerFactory();

			EntityManager entityManager = entityManagerFactory
					.createEntityManager();

			EntityTransaction entityTransaction = entityManager
					.getTransaction();

			entityTransaction.begin();

			Event event = new Event();

			event.setDate(new Date());
			event.setTitle("Title");

			entityManager.persist(event);

			entityTransaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}

	}

}
