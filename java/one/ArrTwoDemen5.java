package com.java.one;

import java.util.Arrays;

public class ArrTwoDemen5 {

	public static void main(String[] args) {
		
		int intArray[][]=new int[4][]; //�� ���� ���۷��� �迭  ����
		intArray[0]=new int[3]; // 1���� ���� 3���� �迭 ����
		intArray[1]=new int[2]; // 2���� ���� 2���� �迭 ����
		intArray[2]=new int[3]; // 3���� ���� 3���� �迭 ����
		intArray[3]=new int[2]; // 4���� ���� 2���� �迭 ����
		
		//�Է�
		for (int i = 0; i < intArray.length; i++) { //�࿡ ���� �ݺ�
			for (int j = 0; j < intArray[i].length; j++) { //���� ���� �ݺ�
				intArray[i][j]=(i+1)*10+j;
			}
		}
		//���1
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) 
				System.out.print(intArray[i][j]+" ");
				System.out.println(); // ���� �ٷ� �Ѿ��
			}
		System.out.println("=================");
		//for each
		for (int[] tempArr : intArray ) {
			System.out.println(Arrays.toString(tempArr));
			
		}
	}

}
