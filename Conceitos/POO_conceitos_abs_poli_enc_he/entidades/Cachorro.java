package entidades;

public class Cachorro extends Animal{//Extend faz com que Cachorro herde os membros de Animal

    String raca;

    public Cachorro(String nome, String raca, int idade) {

        super(nome, idade);
        this.raca = raca;

    }

    public void latir() {

        System.out.println("Au Au");

    }

    @Override //Sobescreve acima 
    public void informar() {

        System.out.printf("Nome:%s Raca:%s Idade:%d\n", nome, raca, idade);

    }

}