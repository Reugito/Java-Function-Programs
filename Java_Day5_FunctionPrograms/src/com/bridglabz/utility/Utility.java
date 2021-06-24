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
	
	public int[][] getInt2DArray(int m, int n) {
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
	
	public double[][] getDouble2DArray(int m, int n) {
		double[][] array = new double[m][n];
		System.out.println("Enter "+(m*n)+" elements in Doublearray");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				
				array[i][j]=scanner.nextDouble();
			}
		}
		return array;
	}
	
	public void printInt2DArray(int[][] IntArray, int m, int n) {
		PrintWriter writer = new PrintWriter(System.out);
		for (int i=0; i<m; i++){
			for (int j=0; j<n; j++) {
				writer.write(" arr[" + i + "][" + j + "] = "+IntArray[i][j]); 
				writer.flush(); 
			}
			System.out.println();
		}  
	}
	
	public void printDouble2Array(double[][] Array, int m, int n) {
		PrintWriter writer = new PrintWriter(System.out);
		for (int i=0; i<m; i++){
			for (int j=0; j<n; j++) {
				writer.write(" arr[" + i + "][" + j + "] = "+Array[i][j]); 
				writer.flush(); 
			}
			System.out.println();
		}  
	}
	
	public int[] getArray(int n) {
		Utility utilityobj = new Utility();
		int[] array = new int[n];
		System.out.println("Enter "+n+" elements in intArray");
		for(int i=0;i<n;i++) {
			array[i]=utilityobj.getIntValue();
		}
		return array;	
	}
	
	public void getSumAddZero(int[] array, int n) {
		Utility utilityobj1 = new Utility();
		for(int i=0;i<n;i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					if(array[i]+array[j]+array[k] == 0) {
						utilityobj1.distinctTripplet(array[i],array[j],array[k]);
					}
				}
			}
		}
		
		System.out.println("number of uniq tripplet = "+cnt);
	}
	static String tripletCollection = "";
	static int cnt = 0;
	public void distinctTripplet(int num1, int num2, int num3) {
		String str = ""+num1+num2+num3;
		if(! tripletCollection.contains(str)){
			cnt++;
			tripletCollection += str;
			System.out.println(num1+", "+num2+", "+num3);
		}
	}
}
