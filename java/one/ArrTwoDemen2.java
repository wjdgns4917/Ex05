package com.java.one;

public class ArrTwoDemen2 {

	public static void main(String[] args) {
//		int arr[][]=new int [2][3];
		
		int arr[][]= {
				{0,0,0,0,0},
				{0,0,0,0,1000}
		};
		
		System.out.println("1��2�� �� : "+arr[0][1]);
		arr[0][1]=200;
		System.out.println("1��2�� �� : "+arr[0][1]);
		
		System.out.println("1��3�� �� : "+arr[0][2]);
		arr[0][2]=5000;
		System.out.println("1��3�� �� : "+arr[0][2]);
		
		System.out.println("2��3�� �� : "+arr[1][2]);
		arr[1][2]=3000;
		System.out.println("2��3�� �� : "+arr[1][2]);
		
		System.out.println(arr[1][4]);
	}
	

}
