package com.bridgeit.linecomparison;

import java.util.Scanner;

public class LineComparison {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x1 ,y1 ,x2 ,y2 values ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double lenght1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		Double len1 = lenght1;
		System.out.println("enter p1 ,q1 ,p2 ,q2 values ");
		double p1 = sc.nextDouble();
		double q1 = sc.nextDouble();
		double p2 = sc.nextDouble();
		double q2 = sc.nextDouble();
		double lenght2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
		Double len2 = lenght2;
		int res =len1.compareTo(len2);
		if (res == 0) {
			System.out.println(" two line lenghts are equal ");
		} else if (res > 0) {
			System.out.println(" line One lenght is greater than line two lenght  ");
		} else {
			System.out.println(" line One lenght is lesser than line two lenght  ");
		}
	}
}
