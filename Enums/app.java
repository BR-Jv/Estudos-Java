package Enums;

import java.util.Scanner;

public class app {
   public static void main(String[] args){
      Scanner cin = new Scanner(System.in);
      String planeta;
      System.out.println("Digite o nome de um planeta do sistema solar: ");
      planeta = cin.nextLine().toUpperCase();
      cin.close();

      SistemaSolar ss = new SistemaSolar(planeta);
      ss.Learn();
   }
}
