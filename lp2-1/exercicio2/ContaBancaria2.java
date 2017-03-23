public class ContaBancaria2{
	int agencia, contaCorrente;
	double saldo,limiteExtra;
	double saldoTotal= saldo+limiteExtra;
	String titularConta;

	public void imprimirSaldo(){
		System.out.println("O saldo total é: " + saldo);
	}
	public void imprimirSaldoTotal(){
		System.out.println ("O saldo é: " + saldoTotal); 
	}

	public void imprimirAgencia(){
		System.out.println ("A agência é: " + agencia);
	}

	public void imprimirContaCorrente(){
		System.out.println("A conta-corrente é: " + contaCorrente);
	}

	public void imprimirTitular(){
		System.out.println("O titular da conta é: " + titularConta);
	}

	public static void main (String [] args){


	ContaBancaria2 conta = new ContaBancaria2();
	conta.agencia=3610;
	conta.contaCorrente=15766;
	conta.saldo=35.54;
	conta.limiteExtra=50.00;
	conta.titularConta= "Larissa";


	conta.imprimirTitular();
	conta.imprimirAgencia();
	conta.imprimirContaCorrente();
	conta.imprimirSaldo();
	conta.imprimirSaldoTotal();



	ContaBancaria2 conta1 = new ContaBancaria2();
	conta1.agencia=810;
	conta1.contaCorrente=6132;
	conta1.saldo=42.31;
	conta1.limiteExtra=75.00;
	conta1.titularConta= "Eduardo";


	conta1.imprimirTitular();
	conta1.imprimirAgencia();
	conta1.imprimirContaCorrente();
	conta1.imprimirSaldo();
	conta1.imprimirSaldoTotal();
	}
} 

