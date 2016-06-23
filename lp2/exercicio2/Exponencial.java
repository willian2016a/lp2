import java.lang.Math;
public class Exponencial{
   public void potenciacao(){
      for(int i=0;i<=10;i++){
         System.out.println(i + "  " + Math.pow (i, 2) + "   " + Math.pow (i,3));
      }
   }

   public static void main(String [] args){
      Exponencial result = new Exponencial();
      result.potenciacao();
   }
}
