package com.ex;

public class Ex02 {

	public static void main(String[] args) {
		
		int sum1 = 0;
		for (int i = 0; i < 10; i++)  
			sum1 +=i;
		System.out.println(sum1);
		
		int sum2 = 0;
		for (int i = 9; i > 0; i--) { 
			sum2 +=i;}
		System.out.println(sum2);
		
		int sum3 = 0;
		for (int i = 0; i > 10; i++) { 
			sum3 ++;}
		System.out.println(sum3);
		
		int sum4 = 0;
		for (int i = 0; i < 10; sum4 +=i, i++); 
		System.out.println(sum4);
	}

}
