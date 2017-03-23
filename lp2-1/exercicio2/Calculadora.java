public class Calculadora{
	int v1,v2;
	
	public void soma(){
		int soma= v1+v2;
		System.out.println ("A soma dos dois números são: " + soma);
	}

	public void subtracao(){
		int subtracao= v1-v2;
		System.out.println ("A subtração dos dois números são: " + subtracao);
	}

	public void multiplicacao(){
		int multiplicacao= v1*v2;
		System.out.println ("A multiplicação dos dois número são: " + multiplicacao);
	}

	public void divisao(){
		int divisao= v1/v2;
		System.out.println ("A divisão dos dois números são: " + divisao);
	}

		
public static void main (String [] args){
	
	System.out.println("Objetivo Um: ");	
	Calculadora cal = new Calculadora();
	cal.v1=50;
	cal.v2=50;

	cal.soma();
	cal.subtracao();
	cal.multiplicacao();
	cal.divisao();

	
	System.out.println("Objetivo Dois: ");	
	Calculadora cal2 = new Calculadora();
	cal2.v1=150;
	cal2.v2=150;

	cal2.soma();
	cal2.subtracao();
	cal2.multiplicacao();
	cal2.divisao();

	System.out.println("Objetivo Três: ");	
	Calculadora cal3 = new Calculadora();
	cal3.v1=100;
	cal3.v2=100;

	cal3.soma();
	cal3.subtracao();
	cal3.multiplicacao();
	cal3.divisao();
}
}
