import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		double sal, nSal = 0, ajuste=0;
		int prct=0;
		
		sal = scn.nextDouble();
		
		if(sal>=0&&sal<=400){
			prct = 15;
			ajuste = ((sal*(prct/100.0)));
			nSal = sal+ajuste;
		}else if(sal>400 && sal<=800){
			prct = 12;
			ajuste = sal*(prct/100.0);
			nSal = sal+ajuste;
		}else if(sal>800 && sal<=1200){
			prct = 10;
			ajuste = sal*(prct/100.0);
			nSal = sal+ajuste;
		}else if(sal>1200 && sal<=2000){
			prct = 7;
			ajuste = sal*(prct/100.0);
			nSal = sal+ajuste;
		}else if(sal>2000){
			prct = 4;
			ajuste = (double)(sal*(prct/100.0));
			nSal = sal+ajuste;
		}
	
		System.out.printf("Novo salario: %.2f\n",nSal);
		System.out.printf("Reajuste ganho: %.2f\n",ajuste);
		System.out.print("Em percentual: "+prct+" %\n");
		
		scn.close();
	}
	

}
