public class Aluno{
	String nome;
	int idade;
	String numeroMatricula;

	public void imprimirDadosCadastrais(){
		System.out.println("Nome: " + nome + " - Idade: " + idade + " -Número Matrícula: " + numeroMatricula);
	}

	public static void main (String [] args){
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();

	a1.nome="Eduardo";
	a1.idade=17;
	a1.numeroMatricula="201418110078";

	a1.imprimirDadosCadastrais();

	a2.nome="Larissa";
	a2.idade=17;
	a2.numeroMatricula="201418110070";

	a2.imprimirDadosCadastrais();

	a3.nome="Rafaela Silva";
	a3.idade=16;
	a3.numeroMatricula="201418110075";

	a3.imprimirDadosCadastrais();

	a4.nome="Augusto";
	a4.idade=17;
	a4.numeroMatricula="201418110060";

	a4.imprimirDadosCadastrais();

}
}
