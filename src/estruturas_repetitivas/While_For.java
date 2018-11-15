package estruturas_repetitivas;

import java.util.Scanner;

public class While_For {

	public static void while_for() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter N: ");
		int n = sc.nextInt();
		while (n <= 0) {
			n = sc.nextInt();
		}

		int higher = Integer.MIN_VALUE;
		for (int i = 1; i < n; i++) {
			System.out.println("Value #" + i + ": ");
			int x = sc.nextInt();
			if (x > higher) {
				higher = x;
			}
		}

		System.out.println("Higher = " + higher);
		sc.close();
	}

}
