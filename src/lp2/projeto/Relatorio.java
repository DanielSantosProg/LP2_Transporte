package lp2.projeto;

public class Relatorio {
    
    private int idRelatorio;// Criar variavel no main para fazer a contagem, sempre que for criado novo relatorio aumentar a contagem
    private String categoria;
    
    public Relatorio(int id, String categoria){
        this.idRelatorio = id;
        this.categoria = categoria;
    }

    public int getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }       
    
}
