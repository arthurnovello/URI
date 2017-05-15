import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws IOException {
		int N;
		float valor1, valor2, valor3;
		float m;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			valor1 = sc.nextFloat();
			valor2 = sc.nextFloat();
			valor3 = sc.nextFloat();
			m = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;
			System.out.printf("%.1f\n", m);
		}
	}

}
