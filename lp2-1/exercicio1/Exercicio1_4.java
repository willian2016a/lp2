public class Exercicio1_4{
	float a,b,c;
	
	public void soma(){
		float soma= a+b+c;
		System.out.println ("O valor da soma foi: " + soma);
	}

	public void subtracao(){
		float subtracao= a-b-c;
		System.out.println ("O valor da subtracao foi: " + subtracao);
	}

	public void multiplicacao(){
		float multiplicacao= a*b*c;
		System.out.println ("O valor da multiplicacao foi: " + multiplicacao);
	}

	public void divisao(){
		float divisao= a/b/c;
		System.out.println ("O valor da divisao foi: " + divisao);
	}

		
public static void main (String [] args){
		
	Exercicio1_4 calculadora = new Exercicio1_4();
	calculadora.a= 45;
	calculadora.b= 20;
	calculadora.c= 3;

	calculadora.soma();
	calculadora.subtracao();
	calculadora.multiplicacao();
	calculadora.divisao();
}
}
