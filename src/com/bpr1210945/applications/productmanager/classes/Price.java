package com.bpr1210945.applications.productmanager.classes;

import java.util.Random;

public class Price {
	int max;
	
	/**
	 * Fiyat sınıfı 
	 *
	 * Bu sınıfta fiyatın maksimum değerini alan bir değişken atadım. Bu değişkenin getter ve setterlarını oluşturup random metodunu oluşturdum.
	 * 
	 * Random metodu rastgele bir sayı oluşturmak için kullanılıyor. Bu sayıyı oluştururken java'nın kendi kütüphanesinden Random sınıfını kullandım.
	 * Random sınıfının nextInt fonksiyonuna max olarak tanımladığım değişkeni gönderdiğimde, 0 ila max aralığında rastgele bir sayı türetmiş oluyorum.
	 */
	
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
