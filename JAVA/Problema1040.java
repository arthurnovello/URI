import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float n1 = scn.nextFloat();
		float n2 = scn.nextFloat();
		float n3 = scn.nextFloat();
		float n4 = scn.nextFloat();
		float nE = 0;
		float  med = (float) (((n1*2)+(n2*3)+(n3*4)+n4)/10);
		String media = String.format("%,.1f", med);
		System.out.println("Media: "+media);
		
		if(med>7){
			System.out.println("Aluno aprovado.");
			
		} else if(med<5) {
			System.out.println("Aluno reprovado.");
			
		} else {
			System.out.println("Aluno em exame.");
			nE = scn.nextFloat();
			String exame = String.format("%,.1f", nE);
			System.out.println("Nota do exame: "+exame);
			med = (float)((med+nE)/2);
			if (med<4.9){
				System.out.println("Aluno reprovado.");
				
			} else {
				System.out.println("Aluno aprovado.");
			}
			media = String.format("%,.1f", med);
			System.out.println("Media final: "+media);
		}
		scn.close();
	}

}
