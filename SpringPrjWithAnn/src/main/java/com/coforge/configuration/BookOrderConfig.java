package com.coforge.configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.beans.Book;
import com.coforge.beans.Order;

@Configuration

public class BookOrderConfig {
	@Bean(name="ord")
   public Order getOrderBean() {
	   return new Order();
   }
	@Bean(name="book")
   public Book getBookBean() {
	   String authArr[]= {"swapna","amit","vikky"};
	   ArrayList<String> authorList = new ArrayList<>(Arrays.asList(authArr));
	   Book b=new Book(123,"PythonTutorials",600.0,authorList);
	   return b;
	   
   }
}
