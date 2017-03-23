public class Exercicio1_3{
	int a,b,c;
	
	public void soma(){
		int soma= a+b+c;
		System.out.println ("O valor da soma foi: " + soma);
	}

	public void subtracao(){
		int subtracao= a-b-c;
		System.out.println ("O valor da subtracao foi: " + subtracao);
	}

	public void multiplicacao(){
		int multiplicacao= a*b*c;
		System.out.println ("O valor da multiplicacao foi: " + multiplicacao);
	}

	public void divisao(){
		int divisao= a/b/c;
		System.out.println ("O valor da divisao foi: " + divisao);
	}

		
public static void main (String [] args){
		
	Exercicio1_3 calculadora = new Exercicio1_3();
	calculadora.a= 45;
	calculadora.b= 20;
	calculadora.c= 3;

	calculadora.soma();
	calculadora.subtracao();
	calculadora.multiplicacao();
	calculadora.divisao();
}
}
