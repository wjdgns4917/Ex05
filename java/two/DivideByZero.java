package com.java.two;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.println("나뉨수를 입력");
		dividend=sc.nextInt();
		System.out.println("나눗수를 입력");
		divisor=sc.nextInt();
		
		try {
			System.out.println(dividend+"를 "+ divisor + "로 나누면 몫은"+ dividend/divisor+ "입니다.");
		
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("0으로 나눴군요!!!!");
		}
	}

}
