package com.bpr1210945.applications.productmanager.classes;

import java.util.Random;

public class Price {
	int max;
	
	public Price setMax(int maxNumber) {
		this.max = maxNumber;
		return this;
	}
	
	public int getMax() {
		return this.max;
	}
	
	public double random() {
		Random rand = new Random();
		return rand.nextInt(this.max);
	}
}
