
package bean;

/**
 * @author Guilherme Bialas
 */
public class ProdutoBean {
    
    private String categoria, descricao, aplicacao, unidade_de_medida , localizacao, status_peca;
    private Float quantidade, valor, valor_unitario; 
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
    }

    public String getUnidade_de_medida() {
        return unidade_de_medida;
    }

    public void setUnidade_de_medida(String unidade_de_medida) {
        this.unidade_de_medida = unidade_de_medida;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getStatus_peca() {
        return status_peca;
    }

    public void setStatus_peca(String status_peca) {
        this.status_peca = status_peca;
    }

    public Float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Float getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(Float valor_unitario) {
        this.valor_unitario = valor_unitario;
    }
}
