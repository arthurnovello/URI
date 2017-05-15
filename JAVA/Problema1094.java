import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		int N, X, total = 0, total_C = 0, total_R = 0, total_S = 0;
		float total_C_porcent = 0, total_R_porcent = 0, total_S_porcent = 0;
		String animal;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			X = sc.nextInt();
			animal = sc.next();
			total += X;
			if (animal.equals("C")) {
				total_C += X;
			} else if (animal.equals("R")) {
				total_R += X;
			} else if (animal.equals("S")) {
				total_S += X;
			}
			total_C_porcent = (float) ((total_C * 100.00) / total);
			total_R_porcent = (float) ((total_R * 100.00) / total);
			total_S_porcent = (float) ((total_S * 100.00) / total);

		}

		System.out.print("Total: " + total + " cobaias\n");
		System.out.print("Total de coelhos: " + total_C + "\n");
		System.out.print("Total de ratos: " + total_R + "\n");
		System.out.print("Total de sapos: " + total_S + "\n");

		System.out.printf("Percentual de coelhos: %.2f", total_C_porcent);
		System.out.print(" %\n");
		System.out.printf("Percentual de ratos: %.2f", total_R_porcent);
		System.out.print(" %\n");
		System.out.printf("Percentual de sapos: %.2f", total_S_porcent);
		System.out.print(" %\n");

	}

}
