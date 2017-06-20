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
		DecimalFormat df = new DecimalFormat("0.0000");
		
		double v[] = new double[100];
		
		double n = Double.parseDouble(input.readLine());
		v[0] = n;
		
        for (int i = 1; i < v.length; i++) {
        	v[i] = v[i-1] / 2;
        }

		for (int i = 0; i < v.length; i++) {
	       	System.out.println("N[" + i + "] = " + df.format(v[i]).replaceAll(",", "."));
		}
 
    }
