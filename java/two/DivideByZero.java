package com.java.two;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.println("�������� �Է�");
		dividend=sc.nextInt();
		System.out.println("�������� �Է�");
		divisor=sc.nextInt();
		
		try {
			System.out.println(dividend+"�� "+ divisor + "�� ������ ����"+ dividend/divisor+ "�Դϴ�.");
		
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("0���� ��������!!!!");
		}
	}

}
