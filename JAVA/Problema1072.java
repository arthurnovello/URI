import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N, X, entrada = 0, saida = 0;
		int intervalo_i = 10, intervalo_f = 20;

		Scanner scn = new Scanner(System.in);

		N = scn.nextInt();
		for (int i = 1; i <= N; i++) {
			X = scn.nextInt();
			if (X >= intervalo_i && X <= intervalo_f) {
				entrada += 1;
			} else {
				saida += 1;
			}
		}
		System.out.print(entrada + " in\n" + saida + " out\n");

		scn.close();
	}

}
