package com.bridgelabz.linecomparison;

public class LineComparsion {
	public static void LineEquals() {

		int L1x1 = 46;
		int L1y1 = 64;
		int L1x2 = 10;
		int L1y2 = 31;
		int L2x1 = 24;
		int L2y1 = 24;
		int L2x2 = 14;
		int L2y2 = 25;
		
		Double LineLength1 = (Math.sqrt(Math.pow((L1x2 - L1x1),2)) + (Math.pow((L1y2 - L1y1),2)));
		System.out.println("Line 1 Length is " +LineLength1);
		
		Double LineLength2 = (Math.sqrt(Math.pow((L2x2 - L2x1),2)) + (Math.pow((L2y2 - L2y1),2)));
		System.out.println("Line 2 Length is " +LineLength2);
		
		System.out.println(" Checking Equality of LineLength1 " + LineLength1 + " and LineLength2 " + LineLength2 + " : " +LineLength1.equals(LineLength2));
		System.out.println();
	}
	
	public static void LineCompareTo() {
		int L1x1 = 42;
		int L1y1 = 78;
		int L1x2 = 19;
		int L1y2 = 21;
		int L2x1 = 54;
		int L2y1 = 37;
		int L2x2 = 10;
		int L2y2 = 89;
		
		double LineLength1 = (Math.sqrt(Math.pow((L1x2 - L1x1),2)) + (Math.pow((L1y2 - L1y1),2)));
		System.out.println("Line 1 Length is " +LineLength1);
		
		double LineLength2 = (Math.sqrt(Math.pow((L2x2 - L2x1),2)) + (Math.pow((L2y2 - L2y1),2)));
		System.out.println("Line 2 Length is " +LineLength2);
		
		Double len1 = new Double(LineLength1);
		Double len2 = new Double(LineLength2);
		
		if (len1.compareTo(len2) == 0)
			System.out.println("both lines are equal");
		else if (len1.compareTo(len2) < 0)
			System.out.println(" Length of Line 1 is less than length of Line 2 ");
		else
			System.out.println(" Length of Line 1 is greater than length of Line 2 ");				
	}
}
