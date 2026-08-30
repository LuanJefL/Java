import java.util.Scanner;

public class Main{

    public static int fatorial(int n) {

        if(n == 1) {

            return 1;

        } 

        return n + fatorial(n - 1);

    }

    public static void main(String[] args) {

        int n1, n2;

        Scanner input = new Scanner(System.in);

        System.out.printf("Qual fatorial deseja saber?:");
        n1 = input.nextInt();

        n2 = fatorial(n1);

        System.out.println("O resultado foi:" + n2);

        input.close();

    }

}