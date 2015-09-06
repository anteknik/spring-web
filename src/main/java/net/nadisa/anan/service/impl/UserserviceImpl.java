package net.nadisa.anan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.nadisa.anan.dao.UserDao;
import net.nadisa.anan.model.Employee;
import net.nadisa.anan.service.UserService;

@Service
public class UserserviceImpl implements UserService {
	
	@Autowired
	UserDao service;
	
	public void authenticate() {
	}

	@Override
	public List<Employee> userList() {
		
		return (List<Employee>) service.findAll();
		
	}
	
	public Employee findUser(Long id) {
		return service.findOne(id);
	}

	public void deleteUser(Long id) {
		service.delete(id);
	}

}
