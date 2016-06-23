public class Aluno{
   String nome,numeroMatricula;
   int idade;
   public void imprimirDadosCadastrais(){
     System.out.println("Nome : " + nome);
     System.out.println("Idade : " + idade);
     System.out.println("Numero Matricula : " + numeroMatricula);
   }
  
   public static void main(String [] args){
    Aluno red1 = new Aluno();
    Aluno red2 = new Aluno();
    Aluno red3 = new Aluno();
    Aluno red4 = new Aluno();

       red1.nome = "Willian";
       red2.nome = "Caio";
       red3.nome = "Edgard";
       red4.nome = "Lavínia";

       red1.idade = 16;
       red2.idade = 17;
       red3.idade = 16;
       red4.idade = 18;
       
       red1.numeroMatricula = "00001";
       red2.numeroMatricula = "00002";
       red3.numeroMatricula = "00003";
       red4.numeroMatricula = "00004";

       red1.imprimirDadosCadastrais();
       System.out.println(" ");
       red2.imprimirDadosCadastrais();
       System.out.println(" ");
       red3.imprimirDadosCadastrais();
       System.out.println(" ");
       red4.imprimirDadosCadastrais();
  }
}
