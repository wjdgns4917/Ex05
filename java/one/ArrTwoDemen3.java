package com.java.one;

public class ArrTwoDemen3 {

	public static void main(String[] args) {
//		int arr[][]=new int [2][3];

		double score[][]= {
				{3.3,3.4},
				{3.5,3.6},
				{3.7,4.0},
				{4.1,4.2}
		};
//		System.out.println("���� ���� : "+score.length);
//		System.out.println("���� ���� : "+score[0].length);
		
		double sum=0;
		for (int year = 0; year < score.length; year++) {
			for(int term = 0; term < score[year].length; term++)
				sum+=score[year][term];	
		}
		
		int n=score.length;
		int m=score[0].length;
		System.out.println("4�� ��ü ���� ��� : "+sum/(n*m));
		int arr[][]= {
				{0,0,0,0,0},
				{0,0,0,0,1000}
		};
		
//		System.out.println("1��2�� �� : "+arr[0][1]);
//		arr[0][1]=200;
//		System.out.println("1��2�� �� : "+arr[0][1]);
//		
//		System.out.println("1��3�� �� : "+arr[0][2]);
//		arr[0][2]=5000;
//		System.out.println("1��3�� �� : "+arr[0][2]);
//		
//		System.out.println("2��3�� �� : "+arr[1][2]);
//		arr[1][2]=3000;
//		System.out.println("2��3�� �� : "+arr[1][2]);
//		
//		System.out.println(arr[1][4]);
	}
	

}
