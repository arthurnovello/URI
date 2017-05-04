import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int X, Y, t = 0;
		Scanner scn = new Scanner(System.in);
		X = scn.nextInt();
		Y = scn.nextInt();

		if (X > Y) {
			for (int i = X - 1; i > Y; i--) {
				if (i % 2 != 0) {
					t += i;
				}
			}
		} else {
			for (int i = Y - 1; i > X; i--) {
				if (i % 2 != 0) {
					t += i;
				}
			}
		}

		System.out.print(t + "\n");
		scn.close();

	}

}
