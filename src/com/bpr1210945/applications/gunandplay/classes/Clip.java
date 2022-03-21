package com.bpr1210945.applications.gunandplay.classes;

public class Clip {
	int bulletCapacity;
	int bulletCount;
	
	public Clip(int bulletCapacity, int bulletCount) {
		this.bulletCapacity = bulletCapacity;
		this.bulletCount = bulletCount;
	}

	public int getBulletCapacity() {
		return bulletCapacity;
	}

	public void setBulletCapacity(int bulletCapacity) {
		this.bulletCapacity = bulletCapacity;
	}

	public int getBulletCount() {
		return bulletCount;
	}

	public void setBulletCount(int bulletCount) {
		this.bulletCount = bulletCount;
	}
	
}
