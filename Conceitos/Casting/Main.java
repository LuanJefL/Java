public class Main{

    public static void main(String[] args) {

        int a = 5,b = 2;
        double c,d;

        c = a / b; //Entende como divisão de inteiros 
        d = (double) a/b; //Converte para o tipo double e não corta o resultado

        System.out.printf("Sem casting:%f\n", c);
        System.out.printf("Com casting:%f\n", d);

    }

}