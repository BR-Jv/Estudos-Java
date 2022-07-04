package VetoreseMatrizes;

import java.util.Scanner;

public class questão01 {
   public static void main(String[] args){
      int matrizA[][] = new int[3][4]; 
      int matrizB[][] = new int[3][2];
      System.out.println("Valores da primeira matriz");
      InputValues(matrizA, 3, 4);
      System.out.println("Valores da segunda matriz");
      InputValues(matrizB, 3, 2);
      System.out.println("Valores da terceira matriz");
      OutputValues(matrizA, matrizB);
   }
   
   public static void InputValues(int m[][], int row, int column){
      Scanner inputdata = new Scanner(System.in);  
      
      for(int i = 0; i < row; i++){
         
         for(int j = 0; j < column; j++){
            m[i][j] = inputdata.nextInt();
         }         
      
      }
      
   }

   public static void OutputValues(int m_A[][], int m_B[][]){
      for(int i = 0; i < 3; i++){
         for(int j = 0; j < 4; j++){
            System.out.print(m_A[i][j]+" ");
         }
         OutputValues(m_B, i);
         System.out.println(" ");
      }
   }

   public static void OutputValues(int m[][], int row){
      for(int column = 0; column < 2; column++){
         System.out.print(m[row][column]+" ");
      }
   }

}
