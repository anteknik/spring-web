package net.nadisa.anan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.nadisa.anan.dao.UserDao;
import net.nadisa.anan.service.UserService;

@Service
public class UserserviceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	public void authenticate() {
		System.out.println("UserserviceImpl : authenticate");
		userDao.authenticate();

	}

}
