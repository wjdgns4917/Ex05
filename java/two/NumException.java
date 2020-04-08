package com.java.two;

public class NumException {

	public static void main(String[] args) {
		String[] num= {"23","12","3.141592","998"};
		
		int i=0;
		try {
			for (i = 0; i < num.length; i++) {
				int j = Integer.parseInt(num[i]);
				System.out.println("정수로 변환된 값은 " +j);
			}
		} 
		catch (NumberFormatException e) {
			System.out.println(num[i] + "는 정수로 변환할 수 없습니다.");
		}

	}

}
