package com.java.two;

public class NumException {

	public static void main(String[] args) {
		String[] num= {"23","12","3.141592","998"};
		
		int i=0;
		try {
			for (i = 0; i < num.length; i++) {
				int j = Integer.parseInt(num[i]);
				System.out.println("������ ��ȯ�� ���� " +j);
			}
		} 
		catch (NumberFormatException e) {
			System.out.println(num[i] + "�� ������ ��ȯ�� �� �����ϴ�.");
		}

	}

}
