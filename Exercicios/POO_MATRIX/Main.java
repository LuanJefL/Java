import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i,j;

        System.out.printf("Qual vai ser o número de linhas?:");
        i = input.nextInt();

        System.out.printf("Qual vai ser o número de colunas?:");
        j = input.nextInt();

        int[][] matrix = new int[i][j];

        for(int cont1 = 0; cont1 < i; cont1++) {
            for(int cont2 = 0; cont2 < j; cont2++) {

                System.out.printf("Qual vai ser o elemento %dx%d:", cont1 + 1, cont2 + 1);
                matrix[cont1][cont2] = input.nextInt();

            }
        }

        for(int cont1 = 0; cont1 < i; cont1++) {
            for(int cont2 = 0; cont2 < j; cont2++) {

                System.out.printf("%d ", matrix[cont1][cont2]);

            }

            System.out.printf("\n");
        }

        input.close();

    }

}


