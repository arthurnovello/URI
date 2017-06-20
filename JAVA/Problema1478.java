import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       int N;
          
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder buff = new StringBuilder();
        
        N = Integer.parseInt(br.readLine()); 
        
        
      while (N != 0) {

         int[][] M = new int[N][N];
         for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
               if (i == 0){
                  M[i][j] = j+1;
               } else {
                  if (j == 0){
                     M[i][j] = i+1;
                  } else {
                     M[i][j] = M[i-1][j-1];
                  }
               }
            }
         }

         for (int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
               if (j == N - 1) {
                  buff.append(String.format("%3d\n", M[i][j]));
               } else {
                  buff.append(String.format("%3d ", M[i][j]));
               }
            }
         }
         buff.append("\n");
         System.out.print(buff.toString());
         buff.setLength(0);

         N = Integer.parseInt(br.readLine());
      }
 
    }
 
}
