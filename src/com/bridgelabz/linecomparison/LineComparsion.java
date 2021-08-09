package com.bridgelabz.linecomparison;

public class LineComparsion {
	public static void main(String[] args) {

		int L1x1 = 46;
		int L1y1 = 64;
		int L1x2 = 10;
		int L1y2 = 31;
		
		Double LineLength1 = (Math.sqrt(Math.pow((L1x2 - L1x1),2)) + (Math.pow((L1y2 - L1y1),2)));
		
		System.out.println("Line Length is " +LineLength1);

}
}
