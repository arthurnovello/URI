import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int x = scn.nextInt();
		int y = scn.nextInt();
		int tmp=0;
		
		while(y<=0){
			y = scn.nextInt();
		}
		
		for(int i = 1; i<=y; i++){
			tmp = x+tmp;
			x++;
		}
		System.out.println(tmp);
		
		scn.close();
	}

}
