package com.bpr1210945.examples.customer.test;

import java.time.LocalDate;
import java.time.Month;

import com.bpr1210945.examples.customer.Customer;

public class Test {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		customer
			.setName("Enes")
			.setSurName("Bayraktar")
			.setMarried(false)
			.setBirthDate(LocalDate.of(2000, Month.SEPTEMBER, 25));
		
		System.out.printf("%s %s \n%s \n%d", customer.getName(), customer.getSurName(), customer.getMarried() ? "Evli" : "Bekar", customer.getAge());

	}

}
