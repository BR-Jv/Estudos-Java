package Iteração;

import java.util.Scanner;

public class ExemploWhile {

   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int n;
      System.out.println("Digite 0 para finalizar o loop");
      n = scan.nextInt();
      while(n != 0){
         n = scan.nextInt();
      }
      scan.close();
      System.out.println("Exemplo finalizado");
   }

}
