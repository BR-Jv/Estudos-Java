package POO.ExemploAgenda;

public class app {
   public static void main(String[] args){
      Agenda agenda = new Agenda();
      agenda.Anotar(1, 12, 2022, "dia de ir no médico");
      agenda.mostrarData();
   }
}
