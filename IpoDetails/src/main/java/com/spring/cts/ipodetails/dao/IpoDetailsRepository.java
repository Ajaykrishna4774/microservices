package com.spring.cts.ipodetails.dao;


import org.springframework.data.repository.CrudRepository;

import com.spring.cts.ipodetails.pojo.IpoDetails;



public interface IpoDetailsRepository extends CrudRepository<IpoDetails,Integer> {



Iterable<IpoDetails> findAll();
}
