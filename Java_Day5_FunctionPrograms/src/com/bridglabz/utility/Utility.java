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
	
	public Integer[][] getInt2DArray(int m, int n) {
		Integer[][] array = new Integer[m][n];
		System.out.println("Enter "+(m*n)+"integer values in intArray");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				
				array[i][j]=getIntValue();
			}
		}
		return array;
	}
	
	public Double[][] getDouble2DArray(int m, int n) {
		Double[][] array = new Double[m][n];
		System.out.println("Enter "+(m*n)+" double values in Doublearray");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				
				array[i][j]=scanner.nextDouble();
			}
		}
		return array;
	}
	
	public Boolean[][] getBoolean2DArray(int m, int n) {
		Boolean[][] array = new Boolean[m][n];
		System.out.println("Enter "+(m*n)+" boolean values in Boolean array");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				
				array[i][j]=scanner.nextBoolean();
			}
		}
		return array;
	}
	
	public <t>void printArray(t[][] Array, int m, int n) {
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
		int[] array = new int[n];
		System.out.println("Enter "+n+" elements in intArray");
		for(int i=0;i<n;i++) {
			array[i]=getIntValue();
		}
		return array;	
	}
	
	public void getSumAddZero(int[] array, int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					if(array[i]+array[j]+array[k] == 0) {
						distinctTripplet(array[i],array[j],array[k]);
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
	
	public void getEuclidianDist(int x, int y) {
		double distance;
		distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		System.out.println("Euclidian distance from points = "+distance);
	}

	public void getRoots(int a, int b, int c) {
		double root1, root2, delta;
		delta = b*b - 4*a*c;
		if(delta > 0) {
			root1 = (-b + Math.sqrt(delta))/(2*a);
			root2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("Roots of "+a+"x*x+"+b+"x"+c+" = "+root1+" "+root2);
		}
		else if (delta == 0) {

		      root1 = root2 = -b / (2 * a);
		      System.out.println("root1 = root2 = "+root1);
		}
		else {
		      double real = -b / (2 * a);
		      double imaginary = Math.sqrt(-delta) / (2 * a);
		      System.out.println("root1 = "+real+"+"+imaginary);
		      System.out.println("root1 = "+real+"-"+imaginary);
		    }
	}

	public double getDoubleValue() {
		return scanner.nextDouble();
	}

	public void getWindChill(double t, double v) {
		if (t < 50 && t > -50) {
			if(v >= 3 && v <= 120) {
				double pow =Math.pow ((0.4275*t - 35.75)*v, 0.16);
				double w = 35.74 + 0.6215*t + pow;
				System.out.println("Wind chill = "+w);
			}
			else
				System.out.println("wind speed v is not between 3 to 120 ");		
		}
		else
			System.out.println("tempreture t is grater 50 ");
		
	}
}
