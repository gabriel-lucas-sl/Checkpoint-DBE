package br.com.fiap.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class JpaUtils {
	
	private static final String PROGRAMER_PERSISTENCE = "progamer-persistence-unit";
	
	public static EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(PROGRAMER_PERSISTENCE);
		EntityManager manager = factory.createEntityManager();
		return manager;
	}

}
