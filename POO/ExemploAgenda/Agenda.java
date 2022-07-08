package POO.ExemploAgenda;

public class Agenda {
   private int dia;
   private int mes;
   private int ano;
   private String msg;

   public void Anotar(int dia, int mes, int ano, String msg){
      if(ValidarData(dia, mes)){
         this.dia = dia;
         this.mes = mes;
         this.ano = ano;
         this.msg = msg; 
      }else {
         this.msg = "Erro, data invalida";     
      }   
   }

   private boolean ValidarData(int dia, int mes){
      if(dia >= 1 && dia <= 31 ){
         if(mes >= 1 && mes <= 12){
            return true;
         }
      }
      return false;
   }

   public void mostrarData(){
      System.out.println(msg+" "+dia+"-"+mes+"-"+ano);
   }

}