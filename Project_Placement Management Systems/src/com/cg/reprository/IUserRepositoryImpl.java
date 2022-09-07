package com.cg.reprository;

import javax.persistence.EntityManager;

import com.cg.entites.User;

public class IUserRepositoryImpl implements IUserRepository {
	
	//we are going to use EntityManager method-CRUD
	private EntityManager em;
			
	
	public IUserRepositoryImpl() {
				super();
				em = JPAUtil.getEntityManager();
			}
	// getter and setter method
	@Override
	public User addNewUser(User user) {
		em.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		em.merge(user);
		return user;
	}

	@Override
	public User deleteUser(long id) {
		em.remove(id);
		return null;
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}
	

}