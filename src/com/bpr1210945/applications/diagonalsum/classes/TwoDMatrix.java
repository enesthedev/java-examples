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
	
	public void addRow(int column, String[] values) {
		for (int i = 0; i < this.row; i++) {
			this.array[column][i] = Integer.parseInt(values[i]);
		}
	}
	
	public int sumDiagonalFromLeft() {
		return this.diagonal.left();
	}
	
	private class DiagonalSum {
		int [][] diagonalArray;
		
		public DiagonalSum(int[][] array) {
			this.diagonalArray = array;
		}
		
		public int left() {
			int total = 0;
			for (int r = 0; r < this.diagonalArray.length; r++) {
				for (int c = 0; c < this.diagonalArray[r].length; c++) {
					if (r == c) {
						total += this.diagonalArray[r][r];
					}
				}
			}
			return total;
		}
	}
}
