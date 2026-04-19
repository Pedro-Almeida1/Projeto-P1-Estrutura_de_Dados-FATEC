
public class Teste {

    public static void main(String[] args) {

        //Validado construtores
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
        
        //Criando Validando vetorDinamico
        VetorDinamico arrayDinamico = new VetorDinamico(1);
        arrayDinamico.adicionar(processo);
        arrayDinamico.adicionar(processo2); //redimenciona capacidade para 2
        System.out.println("Capacidade do array: " + arrayDinamico.getCapacidade());
        arrayDinamico.adicionar(processo3); //redimenciona capacidade para 4
        System.out.println("Capacidade do array: " + arrayDinamico.getCapacidade());
        arrayDinamico.adicionar(processo4);
        arrayDinamico.adicionar(processo5); //redimenciona capacidade para 8
        System.out.println("Capacidade do array: " + arrayDinamico.getCapacidade());
        arrayDinamico.adicionar(processo6);
        arrayDinamico.adicionar(processo7);
        arrayDinamico.adicionar(processo8); 
        arrayDinamico.adicionar(processo9); //redimenciona para 16
        arrayDinamico.adicionar(processo10);

        //Imprime o vetor
        arrayDinamico.listar();

        //Busca o maior protocolo
        System.out.println(arrayDinamico.buscarMaiorProtocolo());

        //removendo Processos do vetor
        arrayDinamico.removerUltimo(); //9
        arrayDinamico.removerUltimo(); //8
        arrayDinamico.removerUltimo(); //7
        arrayDinamico.removerUltimo(); //6
        System.out.println("Capacidade do array: " + arrayDinamico.getCapacidade()); // 16
        arrayDinamico.removerUltimo(); //5
        arrayDinamico.removerUltimo(); //4
        arrayDinamico.removerUltimo(); //3
        System.out.println("Capacidade do array: " + arrayDinamico.getCapacidade()); //redimenciona para 8
        arrayDinamico.removerUltimo(); //2 
        arrayDinamico.removerUltimo(); // 1
        System.out.println("Capacidade do array: " + arrayDinamico.getCapacidade()); //redimenciona para  4
        // arrayDinamico.removerUltimo(); // 0

        arrayDinamico.listar();
        
        //Método equals próprio da classe
        System.out.println(processo10.equals(processo10));

        MenuCentralAtendimento menuCentralAtendimento = new MenuCentralAtendimento();

        menuCentralAtendimento.exibirMenuCentralAtendimento();
    }
}
