package VetoreseMatrizes;

import java.util.Scanner;

public class q02 {
   public static void main(String[] args){
      Scanner reader = new Scanner(System.in);
      
      int M, N;
      System.out.println("Type values for M and N: ");
      M = reader.nextInt(); //Valor da linha
      N = reader.nextInt(); //Valor da coluna
   
      int matriz[][] = new int[M][N];
      System.out.println("Type values for Matriz: ");
      for(int row = 0; row < M; row++){
         for(int column = 0; column < N;column++){
            matriz[row][column] = reader.nextInt();
         }
      }
      reader.close();

      System.out.println("highest value found is: "+highestValue(matriz, M, N));

   }
   
   public static int highestValue(int m[][], int limit_row, int limit_column){
      int value = m[0][0];
      for(int row = 0; row < limit_row; row++){
         for(int column = 0; column < limit_column; column++){
            if(m[row][column] > value){
               value = m[row][column];
            }
         }
      }
      return value;
   }


}
