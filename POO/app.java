package POO;

public class app {
   public static void main(String[] args){
      
      Carro newCar = new Carro(); //Criando o objeto carro
      newCar.setCor("White");
      newCar.setNumPortas(4);
      newCar.setPlaca("KYB-2506");
      newCar.setTipo("SUV");
      
      Pessoa pessoa = new Pessoa();
      pessoa.setNome("João Victor");
      pessoa.setIdade(22);
      pessoa.setCar(newCar);
      
      /* Troca de mensagem entre objetos*/
      pessoa.ligarCarro();
      pessoa.setCambioCarro(1);
      pessoa.acelerarCarro();
      pessoa.setCambioCarro(2);
      pessoa.acelerarCarro();
      pessoa.setCambioCarro(1);
      pessoa.acelerarCarro();
      pessoa.setCambioCarro(0);
      pessoa.frearCarro();
      pessoa.desligarCarro();
   }
}