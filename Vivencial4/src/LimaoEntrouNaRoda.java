public class LimaoEntrouNaRoda {
    private No inicio;
    private int quantidade;

    public LimaoEntrouNaRoda(int quantidade) {
        this.quantidade = quantidade;
        this.inicio = null;

        if (quantidade > 0) {
            criarEstrutura();
        }
    }

    private void criarEstrutura() {
        No anterior = null;
        for (int i = 0; i < quantidade; i++) {
            Pessoa pessoa = new Pessoa((int)(Math.random()*10+1));
            No no = new No(pessoa);

            if (anterior != null) {
                anterior.setProximo(no);
            } else {
                inicio = no;
            }

            anterior = no;
        }

        
        if (anterior != null) {
            anterior.setProximo(inicio);
        }
    }

    public int passaObjeto(int vezes) {
        for (int i = 0; i < vezes; i++) {
            inicio = inicio.getProximo(); 
        }

        return inicio.getPessoa().getIdade();
    }

    public Pessoa removePosicao(int posicao) {
        No anterior = null;
        No atual = inicio;

        
        for (int i = 0; i < posicao; i++) {
            anterior = atual;
            atual = atual.getProximo();
        }

        
        if (anterior != null) {
            anterior.setProximo(atual.getProximo());
        } else {
            inicio = atual.getProximo();
        }

        quantidade--;

        return quantidade == 1 ? inicio.getPessoa() : null;
    }

    public void imprimeRoda() {
        No atual = inicio;
        for (int i = 0; i < quantidade; i++) {
            System.out.println(atual.getPessoa().getNome());
            atual = atual.getProximo();
        }
    }
}