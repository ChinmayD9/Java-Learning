package javaLearning;

import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int current = a;
			for (int j = 0; j < n; j++) {
				int c = (int) Math.pow(2, j);
				current += b * c;
				System.out.print(current + " ");
			}
			System.out.println();
		}

		in.close();

	}

}
