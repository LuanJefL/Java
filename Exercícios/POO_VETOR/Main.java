import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];

        for(int cont = 0; cont < 5; cont++) {

            System.out.printf("Qual vai ser o número %d: ", cont + 1);
            numeros[cont] = input.nextInt();

        }

        System.out.println("A lista ficou da seguinte forma: ");

        for(int cont = 0; cont < 5; cont++) {

            System.out.printf("| %d |", numeros[cont]);

        }

        input.close();

    }


}