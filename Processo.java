
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
                nivelPrioridade = "Urgente";
                break;
            default:
                throw new AssertionError();
        }
        return "[" + protocolo + "] " + getSolicitante() + " | " + getTipoServico() + " | " + nivelPrioridade  + " | " + getDataHora();
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
    public Processo(String solicitante, String tipoServico, int prioridade) {
        this.protocolo = cont++;
        this.solicitante = solicitante;
        this.tipoServico = tipoServico;
        this.prioridade = prioridade;
        this.dataHora = LocalDateTime.now().format(formatter);
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

    public boolean equals(Processo p){
        return p.getProtocolo() == getProtocolo();
    }
}
