package com.bpr1210945.applications.gunandplay.classes;

public class Target {
	String name;
	
	int range;
	
	/**
	 * Hedef sınıfı
	 * 
     * Bu sınıfı minik bir oyun havası verebilmesi için ekledim, bu hedef sınıfı sayesinde insanlar, hayvanlar oluşturup silahları onlara ateşleyebiliriz.
     * Bunun bir ilerisinde insan sınıfı oluşturup onlara tip ekleyerek hedef mi yoksa ateşleyen mi olduğunu yapmak bunu daha da çok bir oyuna benzetebilir.
     * 
     * Menzil konusunda bir setter'a ihtiyaç duymadım bu sınıf için constructor harici veri eklenebilmesi amacı dışında olurdu.
     * Kill metodu ise Gun tarafında çalışmakta.
	 */
	
	public Target(int range, String name) {
		this.range = range;
		this.name = name;
	}
	
	public void kill() {
		System.out.println("Hedef " + this.name + " öldürüldü.");
		return;
	}

	public int getRange() {
		return range;
	}
}
