import java.io.IOException;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		float x, media = 0, total = 0, total2 = 0;

		Scanner sc = new Scanner(System.in);

		while (total2 != 2) {	

			x = sc.nextFloat();

			if (x >= 0.0 && x <= 10.0) {

				total += x;

				total2 += 1;

			} else {

				System.out.print("nota invalida\n");

			}

		}

		media = (float) total / 2;

		System.out.printf("media = %.2f\n", media);

	}

}
