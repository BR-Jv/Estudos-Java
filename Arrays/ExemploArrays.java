package Arrays;

import java.util.Scanner;

public class ExemploArrays {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int arr[] = new int[3];

      for(int i = 0; i < 3; i++){
         arr[i] = scan.nextInt();
      }
      scan.close();

      for(int j = 0; j < 3; j++){
         System.out.print(arr[j]+" ");

      }
      
   }
}
