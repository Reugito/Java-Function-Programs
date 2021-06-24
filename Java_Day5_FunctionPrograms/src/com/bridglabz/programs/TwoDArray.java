package com.bridglabz.programs;

import com.bridglabz.utility.Utility;

public class TwoDArray {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the number of columns in array: " );
		int m = utility.getIntValue();
		System.out.print("Enter the number of row in array: " );
		int n = utility.getIntValue();
		
		int[][] intArray = utility.getInt2DArray(m, n);
		utility.printInt2DArray(intArray, m, n);
		
		double[][] ArrayOfdouble = utility.getDouble2DArray(m, n);
		utility.printDouble2Array(ArrayOfdouble, m, n);
	}
}
