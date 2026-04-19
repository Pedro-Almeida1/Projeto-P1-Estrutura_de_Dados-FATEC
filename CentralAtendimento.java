public class CentralAtendimento {
    public PilhaProcesso atendimentosPendentes = new PilhaProcesso(); //principal
    public PilhaProcesso historicoParaDesfazer = new PilhaProcesso(); //auxiliar

    public void abrirProcesso (Processo p) {
        atendimentosPendentes.push(p);
        limpar();
    }

    private void limpar(){
        PilhaProcesso historicoParaDesfazer = new PilhaProcesso();
    }

    public void atenderProximo(){
        Processo tempProcesso = atendimentosPendentes.peek();
        atendimentosPendentes.pop();
        historicoParaDesfazer.push(tempProcesso);
        System.out.println(tempProcesso);
    }

    public void desfazerUltimoAtendimento(){
        Processo tempProcesso = historicoParaDesfazer.peek();
        historicoParaDesfazer.pop();
        atendimentosPendentes.push(tempProcesso);
        System.out.println(tempProcesso);
    }

    public void listarPendentes(){
        atendimentosPendentes.imprimir();
    }

    public void listarHistorico(){
        historicoParaDesfazer.imprimir();
    }
}
