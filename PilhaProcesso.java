
public class PilhaProcesso {

    private VetorDinamico vetorDinamico = new VetorDinamico();

    

    public void push(Processo processo) {
        vetorDinamico.adicionar(processo);
    }

    public void pop() {
        if (vetorDinamico.estaVazio()) {
            throw new PilhaVaziaException("A pilha está vazia!");
        }
        vetorDinamico.removerUltimo();
    }

    public Processo peek() {
        if (vetorDinamico.estaVazio()) {
            throw new PilhaVaziaException("A pilha está vazia não há nada a retornar!");
        }
        return vetorDinamico.getDados()[vetorDinamico.getOcupacao()-1];
    }

    public void imprimir(){
        for (int i = vetorDinamico.getOcupacao(); i > 0; i--) {
            System.out.println(vetorDinamico.getDados()[i]);
        }
    }
}
