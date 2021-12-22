package com.practice.corejava.interview;

public class YearProgram {
	
	public static void main(String[] args) {
		System.out.println(findMonth(100, 3600));
	}
	
	private static int findMonth(long x, long s) {
		long num = s/x;
		
		if(num > 12) {
			num = num % 12;
			if(num == 0)
				num = 12;
		}
		
		return (int)num;
	}

}
