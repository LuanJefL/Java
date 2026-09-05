package recursos;

public class NO{

    int valor;
    int altura;
    NO esq;
    NO dir;

    public NO(int valor) {

        this.valor = valor;
        this.altura = 0;
        this.esq = null;
        this.dir = null;


    }

    public int max(int A, int B) {

        return (A > B) ? A : B;

    }

    public int get_altura(NO no) {

        if(no == null)
        return -1;

        return no.altura;

    }

    public int fator_balanceamento(NO no) {

        return get_altura(no.esq) - get_altura(no.dir);

    }

    public int atualizar_altura(NO no) {

        return 1 + max(get_altura(no.esq), get_altura(no.dir));

    }

    //Rotação na direita
    public NO LL(NO A) {

        NO B = A.esq;
        NO subarvore = B.dir;

        B.dir = A;
        A.esq = subarvore;

        A.altura = atualizar_altura(A);
        B.altura = atualizar_altura(B);

        return B;

    }

    //Rotação na esquerda
    public NO RR(NO A) {

        NO B = A.dir;
        NO subarvore = B.esq;

        B.esq = A;
        A.dir = subarvore;

        A.altura = atualizar_altura(A);;
        B.altura = atualizar_altura(B);;

        return B;

    }

    //Balanceamento
    public NO balancear(NO no) {

        int fatorbalanceamento = fator_balanceamento(no);

        //LL
        if(fatorbalanceamento > 1 && fator_balanceamento(no.esq) >= 0) {

            return LL(no);

        }

        //LR
        if(fatorbalanceamento > 1 && fator_balanceamento(no.esq) < 0) {

            no.esq = RR(no.esq);

            return LL(no);

        }

        //RR
        if(fatorbalanceamento < -1 && fator_balanceamento(no.dir) <= 0) {

            return RR(no);

        }
        
        //RL
        if(fatorbalanceamento < -1 && fator_balanceamento(no.dir) > 0) {

            no.dir = LL(no.dir);

            return RR(no);

        }

        return no;

    }

    public NO inserir(NO no, int valor) {

        if(no == null) return new NO(valor);
        else if(valor < no.valor) no.esq = inserir(no.esq, valor);
        else if(valor > no.valor)no.dir = inserir(no.dir, valor);
        else return no;

        no.altura = atualizar_altura(no);

        no = balancear(no);

        return no;

    }

    public void imprimir_nivel(NO no, int nivel) {

        if(no == null) return;
        else if(nivel == 1) {

            System.out.printf("| %d |", no.valor);

        }
        else {

            imprimir_nivel(no.esq, nivel - 1);
            imprimir_nivel(no.dir, nivel - 1);

        }

    }

    public void imprimir_por_nivel(NO no) {

        int h = no.altura + 1;

        for(int cont = 0; cont <= h; System.out.println(""), cont++) {

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