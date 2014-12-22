package org.casewebjpa.main.model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	public static EntityManagerFactory getEntityManagerFactory() {

		EntityManagerFactory emf = Persistence 
				.createEntityManagerFactory("casejpa");
		return emf;
	}

	public static void main(String[] args) {
		/*try {
			System.out.println(EntityManagerUtil.getEntityManagerFactory());
		} catch (Exception e) {
			System.out.println("doesnt exist");
		}*/
		EntityManagerUtil.getEntityManagerFactory();
	}
}
