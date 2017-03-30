import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        double raio = scn.nextDouble();

        double vol = (3.14159*Math.pow(raio, 3)*(4/3.0));

        System.out.printf("VOLUME = %.3f\n",vol);


    }
 
}
