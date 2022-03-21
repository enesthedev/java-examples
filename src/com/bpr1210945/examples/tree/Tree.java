package com.bpr1210945.examples.tree;

public class Tree {
	
	float height;
	
	String type;
	
	public Tree(float height, String type) {
		this.type = type;
		this.height = height;
	}
	
	void printInfo() {
		System.out.println("Ağaç bilgileri:");
		System.out.println("Tip:" + this.type);
		System.out.println("Yükseklik:" + this.height);
	}

	public static void main(String[] args) {
		Tree tree = new Tree(3.2f, "Çam");
		tree.printInfo();
	}

}
