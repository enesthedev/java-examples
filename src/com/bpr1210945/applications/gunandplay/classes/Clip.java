package com.bpr1210945.applications.gunandplay.classes;

public class Clip {	
	int bulletCapacity;
	int bulletCount;
	
	/**
	 * Şarjör sınıfı
	 * 
	 * Bu sınıfta şajörün mermi kapasitesini ve mermi sayısını belirten iki değişken atadım, normalde bu değişkenlerin getter ve setterları ile
	 * silah sınıfında ateşleme metodları yazıcaktım ancak ödevde şarjör içinde olmasını istediğiniz için getter ve setterlara gerek kalmadı.
	 * 
	 * Hata mesajlarında silah sınıfı ile direkt bir ilişki içerisinde olduğu için Şarjör yerine silah demeyi uygun gördüm.
	 * 
	 * Silahın ateşlendiği metoda true/false tipinde geri dönüş verdim çünkü kendimce bir hedef sistemi yazmak istedim
	 * bu durumda hedefin vurulup vurulmadığını algılamam gerekiyordu.
	 */
	
	public Clip(int bulletCapacity, int bulletCount) {
		this.bulletCapacity = bulletCapacity;
		this.bulletCount = bulletCount;
	}
	
	public void reload() {
		if (this.bulletCapacity - this.bulletCount > 0) {
			this.bulletCount = this.bulletCapacity;
			return;
		}
		
		System.out.println("Silah zaten dolu.");
	}

	public Boolean fire() {
		if (this.bulletCount > 0) {
			this.bulletCount -= 1;
			return true;
		}
		
		System.out.println("Silahta mermi yok!");
		return false;
	}
}
