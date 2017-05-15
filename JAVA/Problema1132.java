import java.io.IOException;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		int X, Y;

		Scanner sc = new Scanner(System.in);

		X = sc.nextInt();

		Y = sc.nextInt();

		if (X > Y) {

			int total = 0;

			for (int i = Y; i <= X; i++) {

				if (i % 13 != 0) {

					total += i;

				}

			}

			System.out.print(total + "\n");

		} else if (X < Y) {

			int total2 = 0;

			for (int i = X; i <= Y; i++) {

				if (i % 13 != 0) {

					total2 += i;

				}

			}

			System.out.print(total2 + "\n");

		}

	}

}
