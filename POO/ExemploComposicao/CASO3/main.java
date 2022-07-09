package POO.ExemploComposicao.CASO3;

public class main {
   public static void main(String[] args){
      Automovel automovel = new Automovel();
      Motor motor = new Motor();

      automovel.setMotor(motor);
   }
}
