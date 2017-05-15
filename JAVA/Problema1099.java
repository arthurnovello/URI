import java.io.IOException;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		int N;

		int intervalo_i, intervalo_f;

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			int total_impar = 0;

			intervalo_i = sc.nextInt();

			intervalo_f = sc.nextInt();

			if (intervalo_i > intervalo_f) {

				for (int j = intervalo_i - 1; j > intervalo_f; j--) {

					if (j % 2 != 0) {

						total_impar += j;

					}

				}

			} else if (intervalo_i < intervalo_f) {

				for (int j = intervalo_i + 1; j < intervalo_f; j++) {

					if (j % 2 != 0) {

						total_impar += j;

					}

				}

			} else {

				total_impar = 0;

			}

			System.out.print(total_impar + "\n");

		}

	}

}
