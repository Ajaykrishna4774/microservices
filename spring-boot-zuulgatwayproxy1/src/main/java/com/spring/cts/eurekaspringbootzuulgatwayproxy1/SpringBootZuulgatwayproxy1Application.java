package com.spring.cts.eurekaspringbootzuulgatwayproxy1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.springbootzuulgatewayproxy.filter.ErrorFilter;
import com.example.springbootzuulgatewayproxy.filter.PostFilter;
import com.example.springbootzuulgatewayproxy.filter.PreFilter;
import com.example.springbootzuulgatewayproxy.filter.RouteFilter;


@SpringBootApplication
@EnableZuulProxy
public class SpringBootZuulgatwayproxy1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulgatwayproxy1Application.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
