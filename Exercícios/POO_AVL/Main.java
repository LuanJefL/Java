import library.*;

public class Main{
    public static void main(String[] args) {

        NO Arvore = new NO(2);

        Arvore = Arvore.inserir(Arvore, 23);
        Arvore = Arvore.inserir(Arvore, 2);
        Arvore = Arvore.inserir(Arvore, 3);
        Arvore = Arvore.inserir(Arvore, 9);
        Arvore = Arvore.inserir(Arvore, 356);
        Arvore = Arvore.inserir(Arvore, 12);
        Arvore = Arvore.inserir(Arvore, 63);
        Arvore = Arvore.inserir(Arvore, 45);

        //Arvore.imprimir(Arvore);

        Arvore.imprimir_por_nivel(Arvore);

    }


}