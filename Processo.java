
import java.time.LocalDateTime;

public class Processo {

    private int protocolo;
    private String solicitante;
    private String tipoServico;
    private int prioridade;
    private String dataHora;
    private static int cont = 001;

    @Override
    public String toString() {
        String nivelPrioridade;

        switch (prioridade) {
            case 1:
                nivelPrioridade = "Baixa";
                break;
            case 2:
                nivelPrioridade = "Média";
                break;
            case 3:
                nivelPrioridade = "Normal";
                break;
            default:
                throw new AssertionError();
        }
        return "[" + protocolo + "] " + getSolicitante() + " | " + getTipoServico() + " | " + nivelPrioridade  + " | " + getDataHora();
    }

    public Processo(String solicitante, String tipoServico, int prioridade) {
        this.protocolo = cont++;
        this.solicitante = solicitante;
        this.tipoServico = tipoServico;
        this.prioridade = prioridade;
        this.dataHora = LocalDateTime.now().toString();
    }

    public int getProtocolo() {
        return protocolo;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
}
