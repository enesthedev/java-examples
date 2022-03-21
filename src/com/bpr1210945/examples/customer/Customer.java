package com.bpr1210945.examples.customer;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Customer {
	String name;
	String surName;
	LocalDate birthDate;
	Boolean married;
	
	public Customer setName(String customerName) {
		name = customerName;
		return this;
	}
		
	public Customer setSurName(String customerSurName) {
		surName = customerSurName;
		return this;
	}
	
	public Customer setBirthDate(LocalDate customerBirthDate) {
		birthDate = customerBirthDate;
		return this;
	}
	
	public Customer setMarried(Boolean customerMarried) {
		married = customerMarried;
		return this;
	}

	public String getName() {
		return name;
	}
	
	public String getSurName() {
		return surName;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public Boolean getMarried() {
		return married;
	}
	
	
	public int getAge() {
		return (int) (birthDate.until(LocalDate.now(), ChronoUnit.DAYS) / 360);
	}
}
