package POO.ExemploCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List {
   public static void main(String[] arg){
      //Criando uma ArrayList a partir de um vetor
      
      String[] nomesCores = {"Azul", "Amarelo", "Verde", "Cinza", "Preto", "Branco", "Laranja", "Roxo"};
      ArrayList<String> cores = new ArrayList<String>(Arrays.asList(nomesCores)); //Arrays.asList() - Transforma meu vetor em uma ArrayList

      //Ordenando minha ArrayList 

      Collections.sort(cores); //Ordem crescente
      
      //Mostrando minha ArrayList
      
      for(String cor : cores) {
         System.out.println(cor);
      } 
      
   }
}
