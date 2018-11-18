package estruturas_repetitivas;

import java.util.Locale;
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

//	Deseja-se fazer um programa para calcular a nota final de um estudante, considerando as
//	três notas que ele tirou nos três trimestres de seu curso. Caso a nota final do estudante seja
//	menor que 21.00, deve-se mostrar uma mensagem "FAILED" também
	public static void ex01() {
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		System.out.println("Enter three student scores: ");
		double score1 = sc.nextDouble();
		double score2 = sc.nextDouble();
		double score3 = sc.nextDouble();

		double finalScore = score1 + score2 + score3;

		System.out.printf("Final score: %.2f%n", finalScore);

		if (finalScore < 21.0) {
			System.out.println("FAILED");

			sc.close();
		}
	}
}
