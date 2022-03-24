package com.bpr1210945.applications.gunandplay.classes;

public class Gun {
	Clip clip;
	String name;
	
	int range;

	/**
	 * Silah sınıfı
	 * 
     * Silahları ayırt edebilmem için bir de isim parametresi ekledim, Silah sınıfı bir menzil ve isim içermek zorundadır.
     * Şarjör opsiyonel olduğu için sınıfın eklenip eklenmediğini null kontrolü yaparak sağladım, reload ve fire metodları ise Clip.java içerisinde yazılı.
     * Ödev gereği burada sadece ekstradan kontroller sağlamış oldum.
     * 
     * Şarjör için getter kullanmama gerek yoktu çünkü bunun kullanılabileceği bir alan mevcut değil. Ateş etme kısmına biraz daha eğlenceli olabilmesi için
     * bir hedef ekledim, bu hedef sayesinde hedef menzilin içerisindeyse ölen hedef de yazıyor olucak, minik bir komut satırı bazlı shooter oyunu gibi.
	 */
	
	public Gun(int range, String name) {
		this.range = range;
		this.name = name;
	}
	
	public Gun fire(Target target) {
		if (this.clip == null) {
			System.out.println("Silahta bir şarjör mevcut değil!");
			return this;
		}
		
		if (target.getRange() < range) {
			if (this.clip.fire()) {
				target.kill();
			}
			return this;
		}
		
		System.out.println("Hedef, Silahın menzili dışında.");
		return this;
	}
	
	public Gun reload() {
		if (this.clip == null) {
			System.out.println("Silahta bir şarjör mevcut değil!");
			return this;
		}
		
		this.clip.reload();
		return this;
	}

	public Gun setClip(Clip clip) {
		this.clip = clip;
		return this;
	}
	
}
