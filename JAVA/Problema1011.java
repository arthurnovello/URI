import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        double raio = scn.nextDouble();

        double vol = (3.14159*Math.pow(raio, 3)*(4/3.0));

        System.out.printf("VOLUME = %.3f\n",vol);


    }
 
}
