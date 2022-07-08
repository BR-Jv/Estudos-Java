package POO;

public class Carro {
   String tipo;
   String cor;
   String placa;
   int numPortas;

   public void setCor(String cor){
      this.cor = cor;
   }

   public String getCor(){
      return cor;
   }

   public String getTipo() {
      return tipo;
   }

   public void setTipo(String tipo) {
      this.tipo = tipo;
   }

   public String getPlaca() {
      return placa;
   }

   public void setPlaca(String placa) {
      this.placa = placa;
   }

   public int getNumPortas() {
      return numPortas;
   }

   public void setNumPortas(int numPortas) {
      this.numPortas = numPortas;
   }
   
}