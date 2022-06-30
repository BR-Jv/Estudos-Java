package Comandosdeiteracao;

import java.util.Scanner;

public class q02 {
   public static void main(String[] args){
      Scanner leitor = new Scanner(System.in);
      int num = leitor.nextInt();
      leitor.close();
      if(num >= 1 && num <= 4 ){
         System.out.println(num);
      }else {
         System.out.println("Número inválido");
      }
   }
}
