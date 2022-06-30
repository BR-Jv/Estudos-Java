package Comandosdeiteracao;

import java.util.Scanner;

public class q01 {
   public static void main(String[] args){
      Scanner leitor = new Scanner(System.in);
      int nums[] = new int[10];
      for(int i = 0; i < 10; i++){
         nums[i] = leitor.nextInt();
      }
      leitor.close();
      for(int j = 0; j < 10; j++){
         if(nums[j]%2 != 0){
            System.out.println(nums[j]);
         }
      }
   }
}
