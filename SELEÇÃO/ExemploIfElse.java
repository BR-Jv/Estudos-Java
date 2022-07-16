package SELEÇÃO;

import java.util.Scanner;

public class ExemploIfElse {
   /**
    * Verificando se dois vetores(matemática) são paralelos 
    */
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      Vector v1 = new Vector();
      Vector v2 = new Vector();

      System.out.println("Valores do vetor1: ");
      v1.setX(scan.nextInt());
      v1.setY(scan.nextInt());
      v1.setZ(scan.nextInt());
      System.out.println("Valores do vetor2: ");
      v2.setX(scan.nextInt());
      v2.setY(scan.nextInt());
      v2.setZ(scan.nextInt());
      
      if( v1.getX() / v2.getX() == v1.getY()/v2.getY() && v1.getY() / v2.getY() == v1.getZ()/v2.getZ()){
         System.out.println("Os vetores são paralelos!");
      }else {
         System.out.println("Os vetores não são paralelos!");
      }
      
      scan.close();
   }
   
};