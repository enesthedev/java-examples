package com.bpr1210945.applications.diagonalsum.classes;

public class TwoDMatrix {
	int row;
	int column;
	int[][] array;
	
	DiagonalSum diagonal;
	
	public TwoDMatrix(int sizeX, int sizeY) {
		this.row = sizeX;
		this.column = sizeY;
		this.array = new int [sizeX][sizeY];
		this.diagonal = new DiagonalSum(this.array);
	}
	
	private class DiagonalSum {
		int [][] diagonalArray;
		
		public DiagonalSum(int[][] array) {
			this.diagonalArray = array;
		}
	}
}
