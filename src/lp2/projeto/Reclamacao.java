package lp2.projeto;

public class Reclamacao {

    private int idReclamacao;// Criar variavel no main para fazer a contagem, sempre que for criada nova reclamacao aumentar a contagem
    private String categoria;    
    
    public Reclamacao(int id, String categoria){
        this.idReclamacao = id;
        this.categoria = categoria;
    }

    public int getIdReclamacao() {
        return idReclamacao;
    }

    public void setIdReclamacao(int idReclamacao) {
        this.idReclamacao = idReclamacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }   
    
}
