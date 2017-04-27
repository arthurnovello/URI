import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		double Din; 
		int M, D, cem, ciq, vin, dez, cin, dois, mUm, mCiq, mVin, mDez, mCin, mUUm;
		Din = scn.nextDouble();
		D = (int)Din;
		M = (int)(100*Din - 100*D);		
		
		cem = D/100;
		D = D-(cem*100);
		ciq = D/50;
		D = D-(ciq*50);
		vin = D/20;
		D = D-(vin*20);
		dez = D/10;
		D = D-(dez*10);
		cin = D/5;
		D = D-(cin*5);
		dois = D/2;
		D = D-(dois*2);
		mUm = D;
		
		mCiq = (M/50);
		M = (M-(mCiq*50));
		mVin = (M/25);
		M = (M-(mVin*25));
		mDez = (M/10);
		M = (M-(mDez*10));
		mCin = (M/5);
		M = (M-(mCin*5));
		mUUm = (M);
		
		System.out.println("NOTAS:");
		System.out.println(cem+" nota(s) de R$ 100.00");
		System.out.println(ciq+" nota(s) de R$ 50.00");
		System.out.println(vin+" nota(s) de R$ 20.00");
		System.out.println(dez+" nota(s) de R$ 10.00");
		System.out.println(cin+" nota(s) de R$ 5.00");
		System.out.println(dois+" nota(s) de R$ 2.00");
		
		System.out.println("MOEDAS:");
		System.out.println(mUm+" moeda(s) de R$ 1.00");
		System.out.println(mCiq+" moeda(s) de R$ 0.50");
		System.out.println(mVin+" moeda(s) de R$ 0.25");
		System.out.println(mDez+" moeda(s) de R$ 0.10");
		System.out.println(mCin+" moeda(s) de R$ 0.05");
		System.out.println(mUUm+" moeda(s) de R$ 0.01");
		
		
		scn.close();
		
	}

}
