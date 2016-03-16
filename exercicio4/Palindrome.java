public class Palindrome{
public void funcao(String parametro){   
   String palavra;
   palavra = parametro;
   String aux,rev; 
   int x=0;
   int y=1;
   int z,w,l=0,k=0,h;
   boolean p = false;
   String res,aux7,wil;
   wil =  " " + palavra + " ";	
      for(int i=0;i<palavra.length();i++){
        aux=palavra.substring(x,y);
         for(int j=palavra.length() + 1;j>=2;j--){
      	     if(j > i + 2){
		 h=j;
	         aux7 = wil.substring(h-1,h);
                 boolean aux5 = false;
                 aux5 = aux.equals(aux7);
             if(aux5 == true){
                res = wil.substring(i+1,j);
               StringBuffer aux4 = new StringBuffer(res);
               aux4.reverse();
               rev = aux4.toString();
                 if(res.equals(rev) && res.length() == 5){
                    System.out.println("PALINDROME: "+ res);
		    System.out.println("Posicao: " + (i) + "-" + (j - 2));
		    p = true;
                 }
             } 
	}		
         } 
           x++;
           y++;
       }
	if(p == false){
	    System.out.println("Palindrome de tamanho 5 nao encontrado.");
	}
    }
   public static void main(String [] args){
        String parametro = args[0];
	Palindrome p = new Palindrome();
        p.funcao(parametro); 
   }
}
