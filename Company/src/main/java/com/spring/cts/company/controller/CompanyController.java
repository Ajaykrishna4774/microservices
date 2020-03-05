package com.spring.cts.company.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cts.company.dao.CompanyRepository;
import com.spring.cts.company.pojo.Company;

@CrossOrigin(origins="*")  
@RequestMapping("/company")  
@RestController

public class CompanyController {
	@Autowired
	private CompanyRepository companyRepository;
	
	
	
		@RequestMapping("/getAllcompines")
	public Iterable<Company> getAllUsers()
	{
		return companyRepository.findAll();	
	}
		
		
		
		@PostMapping("/saveCompany")
		public Company saveuser(@RequestBody Company company)
		{
			System.out.println(company);
			companyRepository.save(company);
			return company;
		}
		
		@PutMapping("/updatecompany/{companyname}")
		public Company updateCompany(@RequestBody Company company,@PathVariable("companyname") String companyname)
		{
			company.setCompanyname(companyname);
			System.out.println(company);
			companyRepository.save(company);
			return company;
		}

		@DeleteMapping("/deletecomapany/{companyname}")
		public boolean deleteuser(@PathVariable("companyname") String companyname)
		{

		
			companyRepository.deleteById(companyname);
			return true;
		}
		@GetMapping("/findOneInAll1/{companyname}")
		public  Company findoneinall(@PathVariable("companyname") String companyname)
		{
			
			
			Optional<Company> company= companyRepository.findById(companyname);
			return company.get();
			
			
		}
}

