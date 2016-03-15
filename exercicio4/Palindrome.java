import java.lang.String;
public class Palindrome{
   String palavra="xyzararaerjxj";
   String aux; 
   int x=0;
	int y=1;
   int z,w,l,k,h;
   String res,aux7;
	
  public void funcao(){
      //Laço onde o i irá se fixar
      for(int i=0;i<palavra.length();i++){
     //pegando a primeira letra da palavra
        aux=palavra.substring(x,y);
      //Laço que irá variar o j 
         for(int j=palavra.length();j>=0;j--){
      //pegando a última letra da string
             h=j;
             k=palavra.indexOf(h-1);
             l=palavra.lastIndexOf(h);
             aux7 = palavra.substring(k,l);
             boolean aux5 = false;
              aux5 = aux.contentEquals(aux7);
             if(aux5 == true){
                z=palavra.indexOf(aux);
                w=palavra.lastIndexOf(aux7);
                res = palavra.substring(z,w);
               StringBuffer aux4 = new StringBuffer(res);
               aux4.reverse();
               String rev = aux4.toString();
                 if(res.equals(rev)){
                    System.out.println("PALINDROME: "+ res);
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
