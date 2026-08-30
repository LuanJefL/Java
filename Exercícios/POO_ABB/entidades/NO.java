package entidades;

public class NO{

    public int valor;
    public NO esq;
    public NO dir;

    public NO(int valor) {

        this.valor = valor;
        this.esq = null;
        this.dir = null;

    }

    public NO adicionar(NO pai, int valor) {

        if (pai == null) {
            return new NO(valor);
        }

        if (valor < pai.valor) {

            pai.esq = adicionar(pai.esq, valor);

        } else if (valor > pai.valor) {

            pai.dir = adicionar(pai.dir, valor);
        }

        return pai;

    }

    public int max(int A, int B) {

        return (A > B) ? A : B;

    }

    public int altura(NO no) {

        if(no == null) return -1;
        int nivelesq = altura(no.esq);
        int niveldir = altura(no.dir);
        return max(nivelesq, niveldir) + 1;

    }

    public int buscar(NO no, int valor) {

        if(no == null) return -1;
        else if(no.valor == valor) return valor;
        else if(valor < no.valor) return buscar(no.esq, valor);
        else return buscar(no.dir, valor);

    }

    public int buscar_nivel(NO no, int valor, int atual) {

        if(no == null) return -1;
        else if(no.valor == valor) return atual;
        int nivel_esq = buscar_nivel(no.esq, valor, atual + 1);
        if(nivel_esq != -1) return nivel_esq;
        else return buscar_nivel(no.dir, valor, atual + 1);

    }

    public void imprimir_nivel(NO no, int nivel) {

        if(no == null) return;
        else if(nivel == 1) {

            System.out.printf("| %d |",no.valor);

        }
        else {

            imprimir_nivel(no.esq, nivel - 1);
            imprimir_nivel(no.dir, nivel - 1);

        }

    }

    public void imprimir_por_nivel(NO no) {

        int h = altura(no) + 1;

        for(int cont = 0; cont <= h; System.out.printf("\n"), cont++) {

            imprimir_nivel(no, cont);

        }

        
    }

    public void imprimir(NO no) {

        if(no != null) {

            System.out.println(no.valor);
            imprimir(no.esq);
            imprimir(no.dir);

        }

    }

}



