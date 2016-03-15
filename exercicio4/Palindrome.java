public class Palindrome{
   String palavra="xyzararaerjxj";
   String aux; 
   int x=0,y=1,z,w,l,k,h;;
   String res,aux7;
  public void funcao(){
      for(int i=0;i<palavra.length();i++){
        aux=palavra.substring(x,y);
         for(int j=palavra.length();j==0;j--){
             System.out.print("dfre");
             h=j;
             k=palavra.indexOf(h);
             l=palavra.lastIndexOf(h+1);
             aux7 = palavra.substring(k,l);
             boolean aux5 = false;
              aux5 = aux.contentEquals(aux7);
             if(aux5 == true){
                String aux3;
                z=palavra.indexOf(aux);
                w=palavra.lastIndexOf(aux7);
                res = palavra.substring(z,w);
               StringBuffer aux4 = new StringBuffer(res);
               aux4.reverse();
               String rev = aux4.toString();
                 if(res.equals(rev)){
                    System.out.println("PALINDROME !!");
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
