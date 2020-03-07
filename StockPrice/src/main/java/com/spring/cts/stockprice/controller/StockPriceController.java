package com.spring.cts.stockprice.controller;

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

import com.spring.cts.stockprice.dao.StockPriceRepository;
import com.spring.cts.stockprice.pojo.StockPrice;


@RestController@CrossOrigin(origins="*")  
@RequestMapping("/stockPrice") 
public class StockPriceController {

	@Autowired

	private StockPriceRepository stockpriceRepository;

	@RequestMapping("/getAllStockPrice")

	public Iterable<StockPrice> getAllStockPrice() {

		return stockpriceRepository.findAll();

	}

	@PostMapping("/savestockprice")
	
	public StockPrice saveStockPrice(@RequestBody StockPrice stockprice) {

		System.out.println(stockprice);

		stockpriceRepository.save(stockprice);

		return stockprice;

	}

	@PutMapping("/updateStockPrice/{stockexchange}")

	public StockPrice updateStockPrice(@RequestBody StockPrice stockprice,
			@PathVariable("stockexchange") String stockexchange) {

		stockprice.setStockexchange(stockexchange);

		System.out.println(stockprice);

		stockpriceRepository.save(stockprice);

		return stockprice;

	}

	@DeleteMapping("/deletestockprice/{stockexchange}")

	public Boolean deleteStockPrice(@PathVariable("stockexchange") String stockexchange) {

		System.out.println(stockexchange);

		Optional<StockPrice> stockprice = stockpriceRepository.findById(stockexchange);

		stockpriceRepository.delete(stockprice.get());

		return true;

	}

	@GetMapping("/findOneInAll5/{stockexchange}")

	public StockPrice findoneinall(@PathVariable("stockexchange") String stockexchange)

	{

		Optional<StockPrice> stockprice = stockpriceRepository.findById(stockexchange);

		return stockprice.get();

	}

}
