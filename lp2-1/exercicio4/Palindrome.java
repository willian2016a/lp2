public class Palindrome{

	public static String palavra;
	public static int letra;
	public static int tamanhopalavra;
	public static int qtdvezes;
	public static String evlixo;

public void confere(int x){
	boolean bool = true;	
		for (int i=0; i<x; i++){
			evlixo = palavra.substring(i,i+letra);
			StringBuffer reverso = new StringBuffer(evlixo);
			reverso.reverse();
			String rever = reverso.toString();
		
		if(evlixo.equals(rever)){
			System.out.println("Palindrome: " + evlixo);
			System.out.println ("Posição: " + (i+1) + "-" + (i+letra));
			bool=false;	
		}
		}
		if (bool){
			System.out.println("O palíndromo com 5 letras, não foi encontrado");
		}
}
		

public static void main(String[]args){

	Palindrome obj = new Palindrome();
	obj.palavra = args[0];
	obj.evlixo="";
	obj.tamanhopalavra = palavra.length();
	obj.qtdvezes = tamanhopalavra - letra;
	obj.letra= 5;
	int y = qtdvezes;
	obj.confere(y);

}
}
