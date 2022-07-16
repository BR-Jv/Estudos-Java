package SELEÇÃO;

import java.util.Scanner;

public class ExemploSwitch {
   public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   System.out.println("Digite um caractere: ");
   char caractere = scan.nextLine().charAt(0); 
   switch(caractere){
      case 'a':
         System.out.println("Afeganistão");
         break;
      case 'b':
         System.out.println("Bélgica");
         break;
      case 'c':
         System.out.println("Cabo Verde");
         break;
      case 'd':
         System.out.println("Dinamarca");
         break;
      case 'e':
         System.out.println("Egito");
         break;
      case 'f':
         System.out.println("Filipinas");
         break;
      case 'g':
         System.out.println("Gana");
         break;
      case 'h':
         System.out.println("Haiti");
         break;
      case 'i':
         System.out.println("Índia");
         break;
      case 'j':
         System.out.println("Jamaica");
         break;
      case 'k':
         System.out.println("não existe");
         break;
      case 'l':
         System.out.println("Líbano");
         break;
      case 'm':
         System.out.println("Macedónia do Norte");
         break;
      case 'n':
         System.out.println("Nepal");
         break;
      case 'o':
         System.out.println("Omã");
         break;
      case 'p':
         System.out.println("Paquistão");
         break;
      case 'q':
         System.out.println("Quénia");
         break;
      case 'r':
         System.out.println("Reino Unido");
         break;
      case 's':
         System.out.println("Salomão");
         break;
      case 't':
         System.out.println("Tailândia");
         break;
      case 'u':
         System.out.println("Uganda");
         break;
      case 'v':
         System.out.println("Venezuela");
         break;
      case 'w':
         System.out.println("não existe");
         break;
      case 'y':
         System.out.println("não existe");
         break;
      case 'z':
         System.out.println("Zâmbia");
         break;
      default:
         System.out.println("Erro, caractere inválido");
   }
   scan.close();
   }
}
