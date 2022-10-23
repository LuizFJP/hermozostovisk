package model;

/**
 *
 * @author ndeba
 */
public class ItemProduto {

    private String nome;
    private Integer codigo;
    public Integer quantidade;
    private Double preco; 

    public ItemProduto(String nome, Integer codigo, Integer quantidade, Double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    

    

    @Override
    public String toString() {
        return super.toString();
    }
}
