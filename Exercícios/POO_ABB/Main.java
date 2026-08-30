import entidades.*;

public class Main{
    public static void main(String[] args) {

        NO Arvore = new NO(12);

        Arvore.adicionar(Arvore, 23);
        Arvore.adicionar(Arvore, 2);
        Arvore.adicionar(Arvore, 3);
        Arvore.adicionar(Arvore, 9);
        Arvore.adicionar(Arvore, 356);
        Arvore.adicionar(Arvore, 12);
        Arvore.adicionar(Arvore, 63);
        Arvore.adicionar(Arvore, 45);

        System.out.println(Arvore.esq.dir.valor);

        System.out.println("A Altura da árvore é:" + Arvore.altura(Arvore));

        System.out.println("O valor foi: " + (Arvore.buscar(Arvore, 47) == 45 ? 45 : "Não encontrado"));

        System.out.println("O valor foi encontrado na altura:" + Arvore.buscar_nivel(Arvore, 45, 0));

        //Arvore.imprimir_nivel(Arvore, 2);

        Arvore.imprimir_por_nivel(Arvore);

        //Arvore.imprimir(Arvore);

    }

}