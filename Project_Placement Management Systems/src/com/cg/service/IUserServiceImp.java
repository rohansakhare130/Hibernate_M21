package com.cg.service;

import com.cg.entites.User;
import com.cg.reprository.IUserRepository;
import com.cg.reprository.IUserRepositoryImpl;

public class IUserServiceImp implements IUserService {

	//1: we are going to use EntityManager method-CRUD
	private IUserRepository us;
			//default constructor
	public IUserServiceImp()
		{
			super();
			us =new IUserRepositoryImpl();
					
		}
	@Override
	public User addNewUser(User user) {
		us.beginTransaction();
		us.addNewUser(user);
		us.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		us.beginTransaction();
		us.updateUser(user);
		us.commitTransaction();
		return user;
	}

	/*@Override
	public User login(User user) {
		us.beginTransaction();
		
		us.commitTransaction();
		return user;
	}*/

	@Override
	public boolean logOut() {
		System.exit(0);
		return true;
	}
	

}