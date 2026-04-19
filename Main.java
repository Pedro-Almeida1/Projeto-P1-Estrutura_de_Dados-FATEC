public class Main {
    public static void main(String[] args) {

        

        Processo processo = new Processo("pedro", "Saúde", 2);
        Processo processo2 = new Processo("Gustavo", "Financeiro", 1);
        Processo processo3 = new Processo("Marcos", "Saúde", 3);
        Processo processo4 = new Processo("Vanessa", "Financeiro", 2);
        Processo processo5 = new Processo("Beatriz", "Financeiro", 1);
        Processo processo6 = new Processo("Marcelo", "Financeiro", 1);
        Processo processo7 = new Processo("Bianca", "Saude", 2);
        Processo processo8 = new Processo("Larissa", "Hospitalar", 3);
        Processo processo9 = new Processo("Maria", "Advogado", 3);
        Processo processo10 = new Processo("Arlete", "Financeiro", 1);
        VetorDinamico arrayDinamico = new VetorDinamico(5);
        arrayDinamico.adicionar(processo);
        arrayDinamico.adicionar(processo2);
        arrayDinamico.adicionar(processo3);
        arrayDinamico.adicionar(processo4);
        arrayDinamico.adicionar(processo5);
        System.out.println(arrayDinamico.getCapacidade());
        arrayDinamico.adicionar(processo6);
        System.out.println(arrayDinamico.getCapacidade());
        arrayDinamico.adicionar(processo7);
        arrayDinamico.adicionar(processo8);
        arrayDinamico.adicionar(processo9);
        arrayDinamico.adicionar(processo10);

        arrayDinamico.imprimirVetor();

        // System.out.println(arrayDinamico.buscarMaiorProtocolo());

        arrayDinamico.removerUltimo();
        arrayDinamico.removerUltimo();
        arrayDinamico.removerUltimo();
        arrayDinamico.removerUltimo();
        System.out.println(arrayDinamico.getCapacidade());
        arrayDinamico.removerUltimo();
        arrayDinamico.removerUltimo();
        arrayDinamico.removerUltimo();
        arrayDinamico.removerUltimo();
        System.out.println(arrayDinamico.getCapacidade());

        // arrayDinamico.imprimirVetor();


    }
}
