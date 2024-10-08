package javaLearning;

import java.util.Scanner;

public class BigTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n, i = 1, big = 0;
		while (i < 10) {
			System.out.println("Enter no ");
			n = s.nextInt();
			if (n > big) {
				big = n;
				i++;

			}
		}
		System.out.println("Big " + big);

	}
}
