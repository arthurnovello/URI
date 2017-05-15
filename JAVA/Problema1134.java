import java.io.IOException;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		int X = 0, A = 0, G = 0, D = 0;

		Scanner sc = new Scanner(System.in);

		while (X != 4) {

			X = sc.nextInt();

			if (X == 1) {

				A += 1;

			} else if (X == 2) {

				G += 1;

			} else if (X == 3) {

				D += 1;

			}

		}

		System.out.print("MUITO OBRIGADO\n");

		System.out.print("Alcool: " + A + "\n");

		System.out.print("Gasolina: " + G + "\n");

		System.out.print("Diesel: " + D + "\n");

	}

}
