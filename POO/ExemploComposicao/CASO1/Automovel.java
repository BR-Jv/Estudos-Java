package POO.ExemploComposicao.CASO1;

public class Automovel {
   private Motor motor;
   

   public Automovel(){
      motor = new Motor();
   }
   public Automovel(int potencia){
      motor = new Motor(potencia);
   }


   public Motor getMotor() {
      return motor;
   }
   public void setMotor(Motor motor) {
      this.motor = motor;
   }
   
}
