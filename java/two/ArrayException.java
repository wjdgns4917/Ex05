package com.java.two;

public class ArrayException {

	public static void main(String[] args) {
		int[]arr=new int[5];
		arr[0]=0;
		try {
			for (int i = 0; i < arr.length; i++) {
				arr[i+1]=200;
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println("OuntOfBound");
		}
	}

}
