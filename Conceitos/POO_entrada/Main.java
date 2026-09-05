import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1,n2,n3;

        System.out.printf("O primeiro número da soma:");
        n1 = input.nextInt(); 

        System.out.printf("O segundo número da soma:");
        n2 = input.nextInt();

        n3 = n1 + n2;

        System.out.printf("O resultado final foi:%d\n", n3);

        input.close();

    }

}