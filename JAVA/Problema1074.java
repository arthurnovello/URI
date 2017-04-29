import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		
		for(int i = 0; i<x; i++){
			float n = scn.nextFloat();
			
			if(n%2==0){
				if(n>0){
					System.out.println("EVEN POSITIVE");
				}else if(n<0){
					System.out.println("EVEN NEGATIVE");
				}else{
					System.out.println("NULL");
				}
			}else{
				if(n>0){
					System.out.println("ODD POSITIVE");
				}else if(n<0){
					System.out.println("ODD NEGATIVE");
				}
			}
			
		}

		scn.close();
	}

}
