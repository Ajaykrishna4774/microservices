package com.spring.cts.company.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.cts.company.pojo.Company;


public interface CompanyRepository  extends CrudRepository<Company,String>{
	Iterable<Company> findAll();
}
