package Enums;

public class SistemaSolar {
   Planetas planeta;

   public SistemaSolar(String planeta){
      this.planeta = Planetas.valueOf(planeta); //convertendo o valor do paraâmetro(string) em uma ENUM
   }

   public void Learn(){
      switch (planeta) {
         case MERCURIO:
            System.out.println("O menor planeta do sistema solar!");
            break;
         case VENUS:
            System.out.println("Conhecido como \"Estrela d\'alva\" ");
            break;
         case TERRA:
            System.out.println("O único planeta conhecido com vida humana");
            break;
         case MARTE:
            System.out.println("Possui dois satélites naturais  \"Fobos e Deimos\" ");
            break;
         case JUPITER:
            System.out.println("1.300 vezes maior do que o planeta Terra");
            break;
         case SATURNO:
            System.out.println("Têm 82 luas");
            break;
         case URANO:
            System.out.println("Seu movimento de translação dura cerca de 84 anos terrestres");
            break;
         case NETUNO:
            System.out.println("Seu movimento de translação equilave a 164 anos terrestres");
            break;
         case PLUTAO:
            System.out.println("Plutão não é mais considerado um planeta do sistema solar, ");
            break;
            default:
            System.out.println("Ei...você não escreveu o nome de uma planeta do sistema solar!");
            break;
      }

   }

}
