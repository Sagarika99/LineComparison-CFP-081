package com.bridgelabz.linecomparison;

public class LineComparsion {
	public static void main(String[] args) {

		int L1x1 = 46;
		int L1y1 = 64;
		int L1x2 = 10;
		int L1y2 = 31;
		int L2x1 = 24;
		int L2y1 = 24;
		int L2x2 = 14;
		int L2y2 = 25;
		
		Double LineLength1 = (Math.sqrt(Math.pow((L1x2 - L1x1),2)) + (Math.pow((L1y2 - L1y1),2)));
		
		System.out.println("Line Length is " +LineLength1);
		
		Double LineLength2 = (Math.sqrt(Math.pow((L2x2 - L2x1),2)) + (Math.pow((L2y2 - L2y1),2)));
		
		System.out.println(" Checking Equality of LineLength1 " + LineLength1 + " and LineLength2 " + LineLength2 + " : " +LineLength1.equals(LineLength2));
		
		System.out.println(" Comparing LineLength1 " + LineLength1 + " and LineLength2 " + LineLength2 + " : " +LineLength1.compareTo(LineLength2));
		
		

}
}
