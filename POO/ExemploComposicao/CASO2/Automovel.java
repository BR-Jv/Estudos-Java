package POO.ExemploComposicao.CASO2;

public class Automovel {
   private Motor motor;

   public void ligarPrimeiraVez(){
      motor = new Motor();
   }
   public void ligarPrimeiraVez(int potencia){
      motor = new Motor(potencia);
   }
}
