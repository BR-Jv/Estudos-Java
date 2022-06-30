package Comandosdeselecao;

public class Questao02 {
   public static int n1;
   public static int n2;
   public static int n3;

   public static boolean Triangulo(){
      if(n1+n2>n3 && n1+n3>n2 && n2+n3>n1){
         return true;
      }
      return false;
   }
}
