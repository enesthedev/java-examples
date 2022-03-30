package com.bpr1210945.applications.diagonalsum.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bpr1210945.applications.diagonalsum.classes.TwoDMatrix;

public class DiagonalSumTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		message("Diagonal Toplam Programı", 0);
		message("Lütfen dize bilgilerini giriniz", 1);
		
		message("Oluşturulacak dizinin boyutunu giriniz:", 2);
		int size = Integer.parseInt(reader.readLine().trim());
		
		
		TwoDMatrix matrix = new TwoDMatrix(size, size);
		

	}
	
	public static void message(String message, int linecount) {
		if (message == null || message.isEmpty()) {
			throw new IllegalArgumentException("Property 'message' type is not valid or empty string");
		}
		
		for (int i = 0; i < linecount; i++) {
			System.out.println();
		}
		System.out.print(message);
	}
}
