public class Calculadora{
  public float soma(float v1,float v2){
     System.out.println("Soma : " + (v1+v2));
     return v1+v2;
  }
  public float subtracao(float v1,float v2){
     System.out.println("Subtração : " + (v1-v2));
     return v1-v2;
  }
  public float multiplicacao(float v1,float v2){
     System.out.println("Multiplicação : " + (v1*v2));
     return v1*v2;
  }
  public float divisao(float v1,float v2){
     System.out.println("Divisão : " + (v1/v2));
     return v1/v2;
  }

  public static void main(String [] args){
    Calculadora blue1 = new Calculadora();
    Calculadora blue2 = new Calculadora();
    Calculadora blue3 = new Calculadora();
    
    blue1.soma(2,3);
    blue2.soma(4,6);
    blue3.soma(12,10);
    System.out.println(" ");
    blue1.subtracao(2,3);
    blue2.subtracao(4,6);
    blue3.subtracao(12,10);
    System.out.println(" ");
    blue1.multiplicacao(2,3);
    blue2.multiplicacao(4,6);
    blue3.multiplicacao(12,10);
    System.out.println(" ");
    blue1.divisao(2,3);
    blue1.divisao(4,6);
    blue1.divisao(12,10);
  }
}
