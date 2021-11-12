package com.bridgeit.linecomparison;

import java.util.Scanner;

public class LineComparison {
	private final double pointX1;
	private final double pointX2;
	private final double pointY1;
	private final double pointY2;
	
	public LineComparison(double pointX1, double pointX2, double pointY1, double pointY2) {
		super();
		this.pointX1 = pointX1;
		this.pointX2 = pointX2;
		this.pointY1 = pointY1;
		this.pointY2 = pointY2;
	}
	
	public double lengthOfLine() {
		
		double length = Math.sqrt(Math.pow((pointX2 - pointX1),2) + Math.pow((pointY2 -pointY1),2));
		return length;
	}
	
	public static void compareTwoLines(double len1,double len2) {
		Double lenght1=len1;
		Double lenght2=len2;
		 double res =lenght1.compareTo(lenght2);
		if (res == 0) {
			System.out.println(" \n  line one and line two lenghts are equal  ");
		} else if (res > 0) {
			System.out.println("\n line One lenght is greater than line two lenght  ");
		} else {
			System.out.println("\n line One lenght is lesser than line two lenght  ");
		}
	}
	
	public static void main(String[] args) {
		LineComparison lineComparison =new LineComparison(10, 20, 30, 40);
		double len1 = lineComparison.lengthOfLine();
		LineComparison lineComparison2 =new LineComparison(50, 70, 90, 60);
		double len2 = lineComparison2.lengthOfLine();
		compareTwoLines(len1,len2);
		
	}
}
