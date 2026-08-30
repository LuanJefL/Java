import entidades.Aluno;
import entidades.Carro;

public class Main{

    public static void main(String[] args) {

        Carro carro1 = new Carro("Corsa", "Azul", 2020);
        Aluno aluno1 = new Aluno("Bernadete", 27, 394839, carro1);

        carro1.especificar();
        aluno1.dirigir();

    }


}

