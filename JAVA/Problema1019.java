import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = 60;
        int m = n / x;
        int s = n % x;  
        int h = m / x;
        m = m % x; 
        System.out.println(h + ":" + m + ":" + s);
    }
}
