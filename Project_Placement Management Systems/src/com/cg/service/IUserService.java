package com.cg.service;

import com.cg.entites.User;

public interface IUserService {
	User addNewUser(User user) ; 
	User updateUser(User user) ; 
	//User login(User user); 
	boolean logOut();


}
