import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int resp = 0;
		int vInt = 0;
		int vGre = 0;
		int emp = 0;
		int jogos = 0;
		
		while(resp!=2){
			int inter = scn.nextInt();
			int gremio = scn.nextInt();
			System.out.println("Novo grenal (1-sim 2-nao)");
			resp = scn.nextInt();
			if(inter>gremio){
				vInt++;
			}else if(gremio>inter){
				vGre++;
			}else{
				emp++;
			}
			jogos++;
		}
		
		System.out.println(jogos+" grenais");
		System.out.println("Inter:"+vInt);
		System.out.println("Gremio:"+vGre);
		System.out.println("Empates:"+emp);
		
		if(vInt>vGre){
			System.out.println("Inter venceu mais");
		}else if(vGre>vInt){
			System.out.println("Gremio venceu mais");
		}else{
			System.out.println("Não houve vencedor");
		}
		
		scn.close();

	}

}
