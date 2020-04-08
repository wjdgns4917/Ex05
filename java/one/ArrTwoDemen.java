package com.java.one;

public class ArrTwoDemen {

	public static void main(String[] args) {
		int arr[][]=new int [2][3];
		
		System.out.println("1행2열 값 : "+arr[0][1]);
		arr[0][1]=200;
		System.out.println("1행2열 값 : "+arr[0][1]);
		
		System.out.println("1행3열 값 : "+arr[0][2]);
		arr[0][2]=5000;
		System.out.println("1행3열 값 : "+arr[0][2]);
		
		System.out.println("2행3열 값 : "+arr[1][2]);
		arr[1][2]=3000;
		System.out.println("2행3열 값 : "+arr[1][2]);
	}

}
