
public class VetorDinamico {

    private Processo[] dados;
    private int capacidade;
    private int capacidadeInicial;
    private int ocupacao;

    public VetorDinamico(int capacidade) {
        this.dados = new Processo[capacidade];
        this.capacidade = capacidade;
        this.capacidadeInicial = capacidade;
        this.ocupacao = 0;
    }

    public VetorDinamico() {
        this(4);
    }

    public int getOcupacao(){
        return ocupacao;
    }

    public Processo[] getDados() {
        return dados;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public boolean estaCheio() {
        return capacidade == ocupacao;
    }

    public boolean estaVazio() {
        return ocupacao == 0;
    }

    private void dobrarVetor() {
        capacidade *= 2;
        redimencionar();
    }

    private void reduzirVetor() {
        if (ocupacao < capacidade * 0.25 && (capacidade / 2) >= capacidadeInicial) {
            capacidade /= 2;
            redimencionar();
        }
    }

    private void redimencionar() {
        Processo[] temp = new Processo[capacidade];
        for (int i = 0; i < ocupacao; i++) {
            temp[i] = dados[i];
        }
        dados = temp;
    }

    public void adicionar(Processo p) {
        if (estaCheio()) {
            dobrarVetor();
        }
        dados[ocupacao] = p;
        ocupacao++;
    }

    public void removerUltimo() {
        if (estaVazio()) {
            System.out.println("Lista Vazia");
        }
        ocupacao--;
        dados[ocupacao] = null;
        reduzirVetor();
    }

    public int buscarMaiorProtocolo() {
        int maior = dados[0].getProtocolo();
        if (!estaVazio()) {
            for (int i = 1; i < ocupacao; i++) {
                if (dados[i].getProtocolo() > maior) {
                    maior = dados[i].getProtocolo();
                }
            }
        }
        return maior;
    }

    public void listar() {
        for (int i = 0; i < ocupacao; i++) {
            System.out.println(dados[i].toString());
        }
    }

    public int buscarPorProtocolo(int protocoloProcurado) {
        for (int i = 0; i < ocupacao; i++) {
            if (dados[i].getProtocolo() == protocoloProcurado) {
                return i;
            }
        }
        return -1;
    }

    public void bubble() {

    }
}
