import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int j=0, k=0, l=0, m=0;
		
		for(int i = 0; i<5; i++){
			float n = scn.nextFloat();
			if(n%2==0){
				j++;
			}else{
				k++;
			}
			if(n>0){
				l++;
			}else if(n<0){
				m++;
			}
			
		}
		
		System.out.println(j +" valor(es) par(es)");
		System.out.println(k +" valor(es) impar(es)");
		System.out.println(l +" valor(es) positivo(s)");
		System.out.println(m +" valor(es) negativo(s)");
		scn.close();
	}

}
