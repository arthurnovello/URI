import java.io.IOException;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		int x, y;

		Scanner sc = new Scanner(System.in);

		while (((x = sc.nextInt()) != 0)

				&& ((y = sc.nextInt()) != 0)) {

			if (x > 0 && y > 0) {

				System.out.print("primeiro\n");

			} else if (x > 0 && y < 0) {

				System.out.print("quarto\n");

			} else if (x < 0 && y < 0) {

				System.out.print("terceiro\n");

			} else if (x < 0 && y > 0) {

				System.out.print("segundo\n");

			}

		}

	}

}
