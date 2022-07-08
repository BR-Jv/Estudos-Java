package POO;

public class Carro {
   String tipo;
   String cor;
   String placa;
   int numPortas;
   Pessoa dono;
   int cambio;

   void ligar(){
      System.out.println("carro ligado");
   }
   
   void desligar(){
      System.out.println("carro desligado");
   }
   
   void acelerar(){
      System.out.println("carro acelerando");
   }
   
   void frear(){
      System.out.println("carro freando");
   }     

   public Pessoa getDono() {
      return dono;
   }

   public void setDono(Pessoa dono) {
      this.dono = dono;
   }

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

   public int getCambio() {
      return cambio;
   }

   public void setCambio(int cambio) {
      this.cambio = cambio;
   }
   
}
