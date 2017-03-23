public class Exercicio1_5{
	double a,b,c;
	
	public void soma(){
		double soma= a+b+c;
		System.out.println ("O valor da soma foi: " + soma);
	}

	public void subtracao(){
		double subtracao= a-b-c;
		System.out.println ("O valor da subtracao foi: " + subtracao);
	}

	public void multiplicacao(){
		double multiplicacao= a*b*c;
		System.out.println ("O valor da multiplicacao foi: " + multiplicacao);
	}

	public void divisao(){
		double divisao= a/b/c;
		System.out.println ("O valor da divisao foi: " + divisao);
	}

		
public static void main (String [] args){
		
	Exercicio1_5 calculadora = new Exercicio1_5();
	calculadora.a= 45;
	calculadora.b= 20;
	calculadora.c= 3;

	calculadora.soma();
	calculadora.subtracao();
	calculadora.multiplicacao();
	calculadora.divisao();
}
}
