package net.nadisa.anan.service;

import java.util.List;

import net.nadisa.anan.model.Employee;

public interface UserService {
	public void authenticate();
	public List<Employee> userList();
	public Employee findUser(Long id);
	public void deleteUser(Long id);
	
}
