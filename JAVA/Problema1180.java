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
		String str = input.readLine();
		String s[] = str.split(" ");
		int v[] = new int[n];
		
		int pm = 0;
		for (int i = 0; i < v.length; i++) {
			v[i] = Integer.parseInt(s[i]);
			if (v[i] < v[pm]) {
				pm = i;
			}
		}
		
		System.out.println("Menor valor: " + v[pm]);
		System.out.println("Posicao: " + pm);
 
    }
 
}
