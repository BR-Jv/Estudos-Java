package Arrays;

public class EsemploMatriz {
   public static void main(String[] args){
      String[][] m = new String[4][4];
      
      for(int row = 0; row < m.length; row++){
         for(int col = 0; col < m.length; col++){
            if(row == col ){
               m[row][col] = "*";
            }else {
               m[row][col] = "@";
            }
         }
      }

      for(int r = 0; r < m.length; r++){
         for(int c = 0; c < m.length; c++){
            System.out.print(m[r][c]+" ");
         }
         System.out.println();
      }
   }
}
