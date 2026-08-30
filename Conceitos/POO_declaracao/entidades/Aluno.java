package entidades;

public class Aluno{

    public String nome;
    public int idade;
    public int matricula;
    public Carro carro1;

    public Aluno(String nome, int idade, int matricula, Carro carro1) {

        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.carro1 = carro1; 

    }

    public void dirigir() {

        System.out.println("Nome:" + nome + " Idade:" + idade + " Matrícula:" + matricula);

    }
    public void informar() {

        System.out.println("Nome:" + nome + " Idade:" + idade + " Matrícula:" + matricula);

    }


}