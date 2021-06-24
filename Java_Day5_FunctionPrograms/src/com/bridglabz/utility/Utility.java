package com.bridglabz.utility;

import java.io.PrintWriter; 

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	
	public Utility() {
		scanner = new Scanner(System.in);
	}
	
	public int getIntValue() {
		return scanner.nextInt();
	}
	
	public int[][] getIntArray(int m, int n) {
		Utility utilityobj = new Utility();
		int[][] array = new int[m][n];
		System.out.println("Enter "+(m*n)+" elements in intArray");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				
				array[i][j]=utilityobj.getIntValue();
			}
		}
		return array;
	}
	
	public double[][] getDoubleArray(int m, int n) {
		double[][] array = new double[m][n];
		System.out.println("Enter "+(m*n)+" elements in Doublearray");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				
				array[i][j]=scanner.nextDouble();
			}
		}
		return array;
	}
	
	public void printIntArray(int[][] IntArray, int m, int n) {
		PrintWriter writer = new PrintWriter(System.out);
		for (int i=0; i<m; i++){
			for (int j=0; j<n; j++) {
				writer.write(" arr[" + i + "][" + j + "] = "+IntArray[i][j]); 
				writer.flush(); 
			}
			System.out.println();
		}  
	}
	
	public void printDoubleArray(double[][] IntArray, int m, int n) {
		PrintWriter writer = new PrintWriter(System.out);
		for (int i=0; i<m; i++){
			for (int j=0; j<n; j++) {
				writer.write(" arr[" + i + "][" + j + "] = "+IntArray[i][j]); 
				writer.flush(); 
			}
			System.out.println();
		}  
	}
}
