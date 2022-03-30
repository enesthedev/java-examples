package com.bpr1210945.applications.diagonalsum.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bpr1210945.applications.diagonalsum.classes.TwoDMatrix;

public class DiagonalSumTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Oluşturulacak dizinin X boyutunu giriniz:");
		int sizeX = Integer.parseInt(reader.readLine().trim());
		
		System.out.println("\n");
		System.out.print("Oluşturulacak dizinin Y boyutunu giriniz:");
		int sizeY = Integer.parseInt(reader.readLine().trim());
		
		TwoDMatrix matrix = new TwoDMatrix(sizeX, sizeY);
		
		message("");
	}
	
	public static void message(String message) {
		if (message == null || message.isEmpty()) {
			throw new IllegalArgumentException("message type is not valid or empty string");
		}
		System.out.println("\n");
		System.out.print(message);
	}
}
