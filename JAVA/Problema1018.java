import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
    
     
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
          
        int VALOR,VALOR_TOTAL;
         
        VALOR = Integer.parseInt(in.readLine());
         
        VALOR_TOTAL = VALOR;
         
        System.out.printf("%d\n", VALOR);
         
         
        if(0<VALOR && VALOR < 1000000){
        if(VALOR/100>0){
        VALOR_TOTAL = VALOR/100;
        VALOR = VALOR%100;
         
        System.out.printf("%d nota(s) de R$ 100,00\n", VALOR_TOTAL);
        }else{
        System.out.printf("0 nota(s) de R$ 100,00\n");
        }
        if(VALOR/50>0){
        VALOR_TOTAL = VALOR/50;
        VALOR = VALOR%50;
         
        System.out.printf("%d nota(s) de R$ 50,00\n", VALOR_TOTAL);
        }else{
        System.out.printf("0 nota(s) de R$ 50,00\n");
        }
  
         if(VALOR/20>0){
        VALOR_TOTAL = VALOR/20;
        VALOR = VALOR%20;
         
        System.out.printf("%d nota(s) de R$ 20,00\n", VALOR_TOTAL);
        }else{
        System.out.printf("0 nota(s) de R$ 20,00\n");
        }
          
        if(VALOR/10>0){
        VALOR_TOTAL = VALOR/10;
        VALOR = VALOR%10;
         
        System.out.printf("%d nota(s) de R$ 10,00\n", VALOR_TOTAL);
        }else{
        System.out.printf("0 nota(s) de R$ 10,00\n");
        }
         
         if(VALOR/5>0){
        VALOR_TOTAL = VALOR/5;
        VALOR = VALOR%5;
         
        System.out.printf("%d nota(s) de R$ 5,00\n", VALOR_TOTAL);
        }else{
        System.out.printf("0 nota(s) de R$ 5,00\n");
        }       
   
        if(VALOR/2>0){
        VALOR_TOTAL = VALOR/2;
        VALOR = VALOR%2;
         
        System.out.printf("%d nota(s) de R$ 2,00\n", VALOR_TOTAL);
        }else{
        System.out.printf("0 nota(s) de R$ 2,00\n");
        }
         
        if(VALOR/1>0){
        VALOR_TOTAL = VALOR/1;        
        System.out.printf("%d nota(s) de R$ 1,00\n", VALOR_TOTAL);
        }   else{
        System.out.printf("0 nota(s) de R$ 1,00\n");
        }             
    }
    }
}
