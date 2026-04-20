
public class PilhaPrioridade extends PilhaProcesso{

    PilhaProcesso pilhaProcessoBaixa;
    PilhaProcesso pilhaProcessoNormal;
    PilhaProcesso pilhaProcessoUrgente;

    public PilhaPrioridade() {
        this.pilhaProcessoBaixa = new PilhaProcesso();
        this.pilhaProcessoNormal = new PilhaProcesso();
        this.pilhaProcessoUrgente = new PilhaProcesso();
    }
    
    public void push(Processo p) {
        switch (p.getPrioridade()) {
            case 1 ->
                pilhaProcessoBaixa.push(p);
            case 2 ->
                pilhaProcessoNormal.push(p);
            case 3 ->
                pilhaProcessoUrgente.push(p);
        }
    }

    public void pop() {
        if (!pilhaProcessoUrgente.estaVazio()) {
            pilhaProcessoUrgente.pop();
        } else if (!pilhaProcessoNormal.estaVazio()) {
            pilhaProcessoNormal.pop();
        } else {
            pilhaProcessoBaixa.pop();
        }
    }

    public Processo peek() {
        if (!pilhaProcessoUrgente.estaVazio()) {
            return pilhaProcessoUrgente.peek();
        } else if (!pilhaProcessoNormal.estaVazio()) {
            return pilhaProcessoNormal.peek();
        } else {
            return pilhaProcessoBaixa.peek();
        }
    }

    public int tamanho() {
        int somaTotal = 0;
        somaTotal += pilhaProcessoBaixa.quantidade();
        somaTotal += pilhaProcessoNormal.quantidade();
        somaTotal += pilhaProcessoUrgente.quantidade();

        return somaTotal;
    }

    public void listar() {
        if (!pilhaProcessoUrgente.estaVazio()) {
            pilhaProcessoUrgente.imprimir();
        } else if (!pilhaProcessoNormal.estaVazio()) {
            pilhaProcessoNormal.imprimir();
        } else {
            pilhaProcessoBaixa.imprimir();
        }
    }
}
