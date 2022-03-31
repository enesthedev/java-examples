package com.bpr1210945.applications.diagonalsum.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bpr1210945.applications.diagonalsum.classes.TwoDMatrix;

public class DiagonalSumTest {

	/**
	 * Test Durumu
	 * 
	 * Program kullanıcıdan diagonal toplamı olacağı matrisin boyutlarını ister, ardından
	 * boşluklu ve satır satır olucak şekilde matrisin içeriğini girmesini bekler.
	 * 
	 * Girilen bilgilerle yeni bir iki boyutlu matris oluşturulur ve diagonal toplamları hesaplanır.
	 * 
	 * message metodu daha rahat şekilde konsole yazı yazdırabilmek için yazılmıştır, message(mesaj, boşluksayısı) şeklinde kullanabilirsiniz.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		message("Diagonal Toplam Programı", 0);
		message("Lütfen dize bilgilerini giriniz", 1);
		
		message("Oluşturulacak dizinin boyutunu giriniz:", 2);
		int size = Integer.parseInt(reader.readLine().trim());
		
		
		TwoDMatrix matrix = new TwoDMatrix(size, size);
		
		
		message("Dizinin elemenlarını aralarında boşluk olucak şekilde giriniz", 2);
		message("\n", 0);
		for (int i = 0; i < size; i++) {
			
			message("Satır " + (i + 1) + ':', 0);
			String[] row = reader.readLine().split(" ");
			
			if (row.length != size) {
				message("Lütfen dizi boyutunda eleman girişi yapınız.\nŞuanki dizi boyutu: " + row.length, 1);
				return;
			}
			
			matrix.addRow(i, row);
		}
		
		message("Soldan diagonal toplam: " + matrix.sumDiagonalFromLeft(), 2);
		message("Sağdan diagonal toplam: " + matrix.sumDiagonalFromRight(), 1);

		reader.close();
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