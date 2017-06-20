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

		int n = Integer.parseInt(input.readLine());
		int v[] = new int[1000];
		
		for (int i = 0, j = 0; i < v.length; i++, j++) {
			v[i] = j;
			if (j == n-1) {
				j = -1;
			}
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("N[" + i + "] = " + v[i]);
		}
 
    }
 
}
