import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		float n2 = scn.nextFloat();
		float n1 = scn.nextFloat();
		
		if (n1 == 0 && n1 == n2){
			System.out.println("Origem");
			
		} else if (n1 == 0){
			System.out.println("Eixo X");
			
		}else if (n2 == 0){
			System.out.println("Eixo Y");
			
		}else{
			if (n1 > 0 && n2 > 0){
				System.out.println("Q1");
				
			} else if (n1 > 0 && n2 < 0){
				System.out.println("Q2");
				
			}else if (n1 < 0 && n2 < 0){
				System.out.println("Q3");
				
			}else{
				System.out.println("Q4");
				
			}
			
		}
		
		scn.close();
	}

}
