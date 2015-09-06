package net.nadisa.anan.dao.impl;

import org.springframework.stereotype.Repository;

import net.nadisa.anan.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

	public void authenticate() {
		System.out.println("UserDaoImpl : authenticate ");

	}

}
