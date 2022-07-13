package POO.ExemploCollection;

import java.util.HashSet;

public class Set {
   public static void main(String[] arg){
      
      //Conjunto de quem sabe Inglês
      
      HashSet<String> ingles = new HashSet<String>(); 
      ingles.add("João");
      ingles.add("Maria");
      System.out.println(ingles);

      //Conjunto de quem sabe Espanhol
      
      HashSet<String> espanhol = new HashSet<String>(); 
      espanhol.add("Roberta");
      espanhol.add("Maria");
      System.out.println(espanhol);
      
      //Conjunto Interseção - Sabem os dois Idiomas 
      
      HashSet<String> ing_e_esp = new HashSet<String>(ingles); //Inicio esse conjunto com os que sabem inglês 
      ing_e_esp.retainAll(espanhol); //Mantenho quem está no conjunto Espanhol 
      System.out.println(ing_e_esp);

      //Conjunto Diferença - Só sabem Inglês
      
      HashSet<String> ing_e_nao_esp = new HashSet<String>(ingles);//Inicio esse conjunto com os que sabem inglês 
      ing_e_nao_esp.removeAll(espanhol); //Removo quem está no conjunto Espanhol
      System.out.println(ing_e_nao_esp);

   }
}
