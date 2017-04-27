import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(), x = scn.nextInt(), b = scn.nextInt(), y = scn.nextInt(), c, d;
        
        if(a==y && b==y && y==x)
        {
            c=x-y;
            d=24+a-b;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", d, c);
        }
        else if(a==b && y>x)
        {
            c=y-x;
            d=a-b;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", d, c);
        }
        else if(a==b && x>y)
        {
            c=60-x+y;
            d=24-a+b-1;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", d, c);
        }
        else if(x==y && a<b)
        {
            c=0;
            d=b-a;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", d, c);
        }
        else if(x==y && a>b)
        {
            c=0;
            d=24-a+b;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", d, c);
        }
        else if(b>a && y>x)
        {
            c=y-x;
            d=b-a;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", d, c);
        }
        else if(a<b && x>y)
        {
            c=60-x+y;
            d=b-a-1;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", d, c);
        }
        else if(a>b && x<y)
        {
            c=y-x;
            d=24-a-1+b;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", d, c);
        }
        else if(a>b && x>y)
        {
            c=60+y-x;
            d=24+b-a-1;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", d, c);
        }
        
        scn.close();
        
	}

}
