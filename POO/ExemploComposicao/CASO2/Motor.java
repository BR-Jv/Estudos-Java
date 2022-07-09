package POO.ExemploComposicao.CASO2;

public class Motor {
   private int potencia;

   Motor(){
      potencia = 1000;
   }

   Motor(int potencia){
      this.potencia = potencia;
   }

   public int getPotencia() {
      return potencia;
   }

   public void setPotencia(int potencia) {
      this.potencia = potencia;
   }
}
