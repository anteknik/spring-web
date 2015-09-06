package net.nadisa.anan.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import net.nadisa.anan.model.Employee;

public interface UserDao extends PagingAndSortingRepository<Employee, Long> {
	
}
