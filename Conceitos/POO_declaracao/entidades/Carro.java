package entidades;

public class Carro{

    public String modelo;
    public String cor;
    public int ano;

    public Carro(String modelo, String cor, int ano) {

        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;

    }

    public void especificar() {

        System.out.println(modelo + " " + cor + " " + ano);

    }


}