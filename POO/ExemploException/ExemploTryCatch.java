package POO.ExemploException;

import java.util.Scanner;

public class ExemploTryCatch {

   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int idade;
      try {
         System.out.println("Digite sua idade: ");
         idade = scan.nextInt();
         scan.close();
         System.out.println("Sua idade é "+idade);
      }catch(Exception ex){
         System.out.println("Erro!");
      }

   }
}