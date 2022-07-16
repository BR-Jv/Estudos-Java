package Registros;

import java.util.Scanner;

public class app {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      Pessoa p1 = new Pessoa();
      
      p1.nome = scan.nextLine();
      p1.telefone = scan.nextLine();
      p1.enderecoResidencia.cep = scan.nextLine();
      p1.enderecoResidencia.rua = scan.nextLine();
      p1.enderecoResidencia.numero = scan.nextInt();
      scan.close();
   }
}
