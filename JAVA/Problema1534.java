import java.io.IOException;
import java.io.*; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		do {
			n = Integer.parseInt(input.readLine());
        	int x[][] = new int[n][n];

            for (int i = 0; i <= n - 1; i++) {
                for (int j = 0 ; j <= n - 1; j++) {
                    if (n % 2 == 0){
                        if (i == j){
                            x[i][j] = 1;
                        } else if (i == ((n - 1) - j)){
                            x[i][j] = 2;
                        } else {
                            x[i][j] = 3;
                        }
                    } else {
                        if (i == ((n - 1) - j)){
                            x[i][j] = 2;
                        } else if (i == j){
                            x[i][j] = 1;
                        } else {
                            x[i][j] = 3;
                        }
                    }
                }
            }
            
            for (int i = 0; i <= n - 1; i++) {
                for (int j = 0; j <= n - 1; j++) {
                    System.out.printf("%d", x[i][j]);
                    if (j == n - 1){
                    	System.out.println("");
                    }
                }
            }
		} while (input.ready());
 
    }
 
}
