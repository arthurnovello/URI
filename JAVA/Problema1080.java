import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		int N = 100, X, m = 0, p = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= N; i++) {
			X = sc.nextInt();

			if (m > X) {
				m = m;
				p = p;
			} else {
				m = X;
				p = i;
			}

		}
		System.out.print(m + "\n" + p + "\n");
	}

}
