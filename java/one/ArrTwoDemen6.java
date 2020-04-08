package com.java.one;

import java.util.Arrays;

public class ArrTwoDemen6 {

	public static void main(String[] args) {
		
	//계단식 비정방형 배열을 선언하고
	//1씩 증가하는 값을 입력하고
	//출력하시오
		int arr[][]=new int[5][];
		arr[0]=new int[1];
		arr[1]=new int[2];
		arr[2]=new int[3];
		arr[3]=new int[4];
		arr[4]=new int[5];
		
		int num=0;
		for (int i = 0; i < arr.length; i++) 
			for (int j = 0; j < arr[i].length; j++) 
			arr[i][j]=num++;		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) 
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
	}

}
