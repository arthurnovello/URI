import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner scn =new Scanner(System.in);
        String string;
        int dI, dF, hI, hF, mI, mF, sI, sF;
        int d = 0, h = 0, m = 0, s = 0;
        boolean ho = false, mi = false, se = false;
        
        string = scn.next();
        dI =scn.nextInt();
        hI =scn.nextInt();
        string =scn.next();
        mI =scn.nextInt();
        string =scn.next();
        sI =scn.nextInt();
        string =scn.next();
        dF =scn.nextInt();
        hF =scn.nextInt();
        string =scn.next();
        mF =scn.nextInt();
        string =scn.next();
        sF =scn.nextInt();
        
        if(hI > hF)
            ho = true;
        if(mI > mF)
            mi = true;
        if(sI > sF)
            se = true;

        while(dI != dF)  {
                d++;   dI++;
        }

        while(hI != hF){
                h++;
                hI++;
                if(hI == 25)
                    hI = 1;
        }

        while(mI != mF)  {
                m++;
                mI++;
                if(mI == 61)
                    mI = 1;
                }

        while(sI != sF)  {
                s++;
                sI++;
                if(sI == 61)
                    sI = 1;
                }

        if(ho == true)
            d--;
        if(mi == true)
            h--;
        if(se == true)
            m--;
        System.out.print(d+" dia(s)\n");
        System.out.print(h+" hora(s)\n");
        System.out.print(m+" minuto(s)\n");
        System.out.print(s+" segundo(s)\n"); 
        
        scn.close();

	}

}
