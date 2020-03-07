package com.spring.cts.stockprice.pojo;


import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

@Table(name = "stockPrice")
public class StockPrice {
	
	

	@Override

	public String toString() {

		return "StockPrice [companyname=" + companyname + ", stockexchange=" + stockexchange + ", currentprice="

				+ currentprice + ", date=" + date + ", time=" + time + "]";

	}
	
	@Id
	private String stockexchange;

	private String companyname;
	

	private Integer currentprice;

	
	Date date=new Date();


	private String time;
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getCurrentprice() {
		return currentprice;
	}

	public void setCurrentprice(Integer currentprice) {
		this.currentprice = currentprice;
	}
	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getStockexchange() {
		return stockexchange;
	}

	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}

	

	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
