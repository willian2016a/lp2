public class Exercicio1_3{
   int a = 45;
    int b = 20;
    int c = 3;
    int x = 0;
    
  public void soma(){
    x = a+b+c;
    System.out.println("Valor da soma : " + x);
  }
  public void multiplicacao(){
    x = a*b*c;
     System.out.println("Valor da multiplicação : " + x);
  }
  public void subtracao(){
    x = a-b-c;
    System.out.println("Valor da subtração : " + x);
  }
  public void divisao(){
     x = a/b/c;
     System.out.println("Valor da divisão : " + x);
  }



  public static void main(String [] args){
    Exercicio1_3 obj = new Exercicio1_3();
    obj.soma();
    obj.multiplicacao();
    obj.subtracao();
    obj.divisao();
  }
}
