import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, c, a, b;
		double ac, bc;

		n = sc.nextInt();

		while (n > 0) {
			c = 0;
			a = sc.nextInt();
			b = sc.nextInt();
			ac = sc.nextDouble();
			bc = sc.nextDouble();
			while (a <= b) {
				a *= (ac / 100.0) + 1.0;
				b *= (bc / 100.0) + 1.0;
				c++;
				if (c > 100) {
					System.out.println("Mais de 1 seculo.");
					break;
				}
			}
			if (c <= 100) {
				System.out.println(c + " anos.");
			}
			n--;
		}
		sc.close();
	}

}
