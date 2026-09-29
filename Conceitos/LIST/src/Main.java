import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        List<String> Nomes = new ArrayList<>();

        String armazenador;
        int resposta;

        do{
            System.out.printf("Deseja adicionar um nome?\n 1- Sim \t 2- Não\n");
            resposta = input.nextInt();
            input.nextLine(); 
            if(resposta == 1) {
                System.out.printf("Qual vai ser o nome:");
                armazenador = input.nextLine();
                Nomes.add(armazenador);
            }

        }while(resposta != 2);

        Nomes.forEach(x -> System.out.println(x));

        input.close();

    }

}