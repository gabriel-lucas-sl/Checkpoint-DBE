package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.model.UserRegistration;
import br.com.fiap.utils.JpaUtils;

public class UserRegistrationDAO {

	public void save(UserRegistration user) {
		EntityManager manager = JpaUtils.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		
		manager.close();
	}

	public List<UserRegistration> getAll() {
		EntityManager manager = JpaUtils.getEntityManager();
		String jpsql = "SELECT u FROM UserRegistration u";
		List<UserRegistration> usersList = manager.createQuery(jpsql, UserRegistration.class).getResultList();
		return usersList;
	}

	
}
