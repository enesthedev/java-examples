package com.bpr1210945.applications.gunandplay.classes;

public class Clip {
	int bulletCapacity;
	int bulletCount;
	
	public Clip(int bulletCapacity, int bulletCount) {
		this.bulletCapacity = bulletCapacity;
		this.bulletCount = bulletCount;
	}
	
	public void reload() {
		if (this.bulletCapacity - this.bulletCount > 0)
			this.bulletCount = this.bulletCapacity;
	}

	public void fire() {
		if (this.bulletCount > 0)
			this.bulletCount -= 1;
	}
}
