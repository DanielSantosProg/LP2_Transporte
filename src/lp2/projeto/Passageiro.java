package lp2.projeto;
import java.util.Date;

public class Passageiro {
    
    private String nome;
    private String cpf;
    private String tipoPassageiro;
    private String tipoPagamento;
    private int limiteMaxTroca;
    private Date ultimoHorarioAcessado;

    public Passageiro(String nome, String cpf, String tipoPass, String tipoPag, int limiteMax){
        this.nome = nome;
        this.cpf = cpf;
        this.tipoPassageiro = tipoPass;
        this.tipoPagamento = tipoPag;
        this.limiteMaxTroca = limiteMax;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }    
      
    public String getTipoPassageiro() {
        return tipoPassageiro;
    }

    public void setTipoPassageiro(String tipoPassageiro) {
        this.tipoPassageiro = tipoPassageiro;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public int getLimiteMaxTroca() {
        return limiteMaxTroca;
    }

    public void setLimiteMaxTroca(int limiteMaxTroca) {
        this.limiteMaxTroca = limiteMaxTroca;
    }

    public Date getUltimoHorarioAcessado() {
        return ultimoHorarioAcessado;
    }

    public void setUltimoHorarioAcessado(Date ultimoHorarioAcessado) {
        this.ultimoHorarioAcessado = ultimoHorarioAcessado;
    }
    
    
    
}
