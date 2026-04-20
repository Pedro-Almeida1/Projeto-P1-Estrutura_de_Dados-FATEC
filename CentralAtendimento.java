public class CentralAtendimento {
    public PilhaProcesso atendimentosPendentes = new PilhaPrioridade(); //principal
    public PilhaProcesso historicoParaDesfazer = new PilhaPrioridade(); //auxiliar

    public void abrirProcesso (Processo p) {
        atendimentosPendentes.push(p);
        limpar();
    }

    private void limpar(){
        PilhaProcesso historicoParaDesfazer = new PilhaPrioridade();
    }

    public void atenderProximo(){
        Processo tempProcesso = atendimentosPendentes.peek();
        historicoParaDesfazer.push(tempProcesso);
        System.out.println(tempProcesso);
        atendimentosPendentes.pop();
    }

    public void desfazerUltimoAtendimento(){
        Processo tempProcesso = historicoParaDesfazer.peek();
        atendimentosPendentes.push(tempProcesso);
        System.out.println(tempProcesso);
        historicoParaDesfazer.pop();
    }

    public void listarPendentes(){
        atendimentosPendentes.imprimir();
    }

    public void listarHistorico(){
        historicoParaDesfazer.imprimir();
    }
}
