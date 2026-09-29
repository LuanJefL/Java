public class Main{
    public static void main(String[] args) {

        //Declaração explícita primitivo para Wrapper
        int numero1 = 20;
        Integer numero = Integer.valueOf(numero1);
        //valueOf pega um valor e trnasforma em seu tipo

        //Declaração implicita primitivo para Wrapper
        int numero2 = 40;
        Integer numero02 = numero2;

        //Tipo Integer para String
        String n;
        n = Integer.toString(numero02);

        //Tipo String para Integer
        Integer numero3 = Integer.valueOf(n);
        
        System.out.printf("N1:%d, N2:%d N3:%s N4:%d\n", numero, numero2, n, numero3);


    }

}
