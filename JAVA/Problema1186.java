import java.io.IOException;
import java.io.*;
import java.text.DecimalFormat; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.0");
		
		double m[][] = new double[12][12];		
		String str = input.readLine();
		
		double result = 0.0;
		int c = 0, p = m.length - 1;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = Double.parseDouble(input.readLine());
				if (j > p) {
					result += m[i][j];
					c++;
				}
			}
			p--;
		}
		System.out.println(str.equalsIgnoreCase("S") ? df.format(result).replaceAll(",", ".") : df.format(result / c).replaceAll(",", "."));
		
 
    }
 
}
