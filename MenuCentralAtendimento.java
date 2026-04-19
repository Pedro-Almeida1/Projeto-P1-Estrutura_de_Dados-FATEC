
import java.util.Scanner;

public class MenuCentralAtendimento {

    private CentralAtendimento centralAtendimento = new CentralAtendimento();
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenuCentralAtendimento() {
        int opcao = 0;
        while (opcao != 6) {
            System.out.println("""
                --- BEM VINDO A CENTRAL DE ATENDIMENTO ---
                Opções:
                1: Abrir processo
                2: Atender Próximo
                3: Desfazer Último Atendimento
                4: Listar Próximos
                5: Listar Histórico

                6: Sair
                """);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criarProcesso(scanner, centralAtendimento);
                    break;
                case 2:
                    centralAtendimento.atenderProximo();
                    break;
                case 3:
                    centralAtendimento.desfazerUltimoAtendimento();
                    break;
                case 4:
                    centralAtendimento.listarPendentes();
                    break;
                case 5:
                    centralAtendimento.listarHistorico();
                    break;

                default:
                    System.out.println("Opção não encontrada");
            }

        }
    }
    // private static void desfazerUltimoAtendimento(CentralAtendimento centralAtendimento){
    //     Processo ultimoAtendido = centralAtendimento.

    // }

    // private static void atenderProximo(CentralAtendimento centralAtendimento) {
    //     try {
    //        Processo proximo = centralAtendimento.atendimentosPendentes.peek();
    //        System.out.println(proximo);
    //     } catch (Exception e) {
    //         e.getMessage();
    //     }
    // }

    private static void criarProcesso(Scanner scanner, CentralAtendimento centralAtendimento) {
        try {
            scanner.nextLine();
            System.out.print("Solicitante: ");
            String solicitante = scanner.nextLine();
            System.out.print("Tipo de Serviço: ");
            String tipoServico = scanner.nextLine();
            System.out.print("Prioridade: ");
            int prioridade = scanner.nextInt();
           

            Processo processo = new Processo(solicitante, tipoServico, prioridade);
            centralAtendimento.abrirProcesso(processo);
            System.out.println("Processo aberto");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
