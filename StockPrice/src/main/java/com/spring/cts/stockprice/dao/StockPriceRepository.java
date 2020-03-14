package com.spring.cts.stockprice.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.cts.stockprice.pojo.StockPrice;






public interface StockPriceRepository extends CrudRepository<StockPrice,String>{

	List<StockPrice> findByCompanyname(String companyname);

}
