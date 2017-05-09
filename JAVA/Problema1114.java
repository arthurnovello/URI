import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = 1;
		while(x == 1){
			int senha = scn.nextInt();
			if(senha == 2002){
				System.out.println("Acesso Permitido");
				x = 0;
			}else{
				System.out.println("Senha Invalida");
			}
		}
		scn.close();
	}

}
