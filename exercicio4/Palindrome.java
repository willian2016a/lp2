public class Palindrome{
   string palavra="xyzararaerjkj";
   char aux; 
   int x=0,y=1;
  public void funcao(){
      for(int i=0;i<palavra.length();i++){
        aux=palavra.substring(x,y);
         for(int j = palavra.length();j=0;j++){
             char [] aux2 = palavra.toCharArray();
             int aux5;
              aux5 = aux.compareTo(aux[j])
             if(aux5 == 0){
                palavra=palavra.indexOf(aux);
                aux3=palavra.lastIndexOf(aux[j]);
               StringBuffer aux4 = new StringBuffer(aux);
               aux4.reverse();
                 if(aux3 == aux4){
                    System.out.println("PALINDROME !!");
                    break;
                 }
             } 
         } 
           x++;
           y++;
       }
  }
   public static void main(String [] args){
        Palindrome p = new Palindrome();
        p.funcao(); 
   }
}
