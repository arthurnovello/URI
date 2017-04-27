import java.util.Scanner;

public class Main {

	public static void quickSort(double[] vetor, int esquerda, int direita) {
		int esq = esquerda;
		int dir = direita;
		double pivo = vetor[(esq + dir) / 2];
		double troca;
		while (esq <= dir) {
			while (vetor[esq] < pivo) {
				esq = esq + 1;
			}
			while (vetor[dir] > pivo) {
				dir = dir - 1;
			}
			if (esq <= dir) {
				troca = vetor[esq];
				vetor[esq] = vetor[dir];
				vetor[dir] = troca;
				esq = esq + 1;
				dir = dir - 1;
			}
		}
		if (dir > esquerda)
			quickSort(vetor, esquerda, dir);
		if (esq < direita)
			quickSort(vetor, esq, direita);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		double A = scn.nextDouble();
		double B = scn.nextDouble();
		double C = scn.nextDouble();
		
		double vetor[] = { A, B, C};
		quickSort(vetor, 0, vetor.length - 1);
		
		A = vetor[2];
		B = vetor[1];
		C = vetor[0];
		
		
		if(A >= (B+C)){
			System.out.println("NAO FORMA TRIANGULO");
		}else{	
			if(Math.pow(A, 2) == (Math.pow(B, 2)+Math.pow(C, 2))){
				System.out.println("TRIANGULO RETANGULO");
			}
			
			if(Math.pow(A, 2) > (Math.pow(B, 2)+Math.pow(C, 2))){
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			
			if(Math.pow(A, 2) < (Math.pow(B, 2)+Math.pow(C, 2))){
				System.out.println("TRIANGULO ACUTANGULO");
			}
			
			if(A == B && B == C){
				System.out.println("TRIANGULO EQUILATERO");
			}else if(A == B || B == C){
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		
		scn.close();
	}

}
