package numberSystem;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Enter the number = ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = i; j < n - (i * 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
