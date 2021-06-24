package com.bridglabz.programs;

import com.bridglabz.utility.Utility;

public class TwoDArray {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the number of columns in array: " );
		int m = utility.getIntValue();
		System.out.print("Enter the number of row in array: " );
		int n = utility.getIntValue();
		
		int[][] intArray = utility.getIntArray(m, n);
		utility.printIntArray(intArray, m, n);
		
		double[][] ArrayOfdouble = utility.getDoubleArray(m, n);
		utility.printDoubleArray(ArrayOfdouble, m, n);
	}
}
