package POO;

public class Pessoa {
   private String nome;
   private int idade;
   private Carro car;
   
   void ligarCarro(){
      car.ligar();
   }

   void desligarCarro(){
      car.desligar();
   }

   void acelerarCarro(){
      car.acelerar();
   }

   void frearCarro(){
      car.frear();
   }

   void setCambioCarro(int marcha){
      car.setCambio(marcha);
   }

   public String getNome() {
      return nome;
   }
   
   public void setNome(String nome) {
      this.nome = nome;
   }
   
   public int getIdade() {
      return idade;
   }
   
   public void setIdade(int idade) {
      this.idade = idade;
   }
   
   public Carro getCar() {
      return car;
   }
   
   public void setCar(Carro car) {
      this.car = car;
   }
   
}
