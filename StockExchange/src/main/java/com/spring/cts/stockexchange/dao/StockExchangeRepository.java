package com.spring.cts.stockexchange.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.cts.stockexchange.pojo.StockExchange;








public interface StockExchangeRepository  extends CrudRepository<StockExchange,Integer> {
	

}
