package model;

/**
 *
 * @author ndeba
 */
public class ItemProduto extends Produto{

    private int quantidade;
    
    public ItemProduto(String nome, Integer codigo, Double preco, Integer quantidade) {
        super(nome, codigo, preco);
        this.quantidade = quantidade;
    }

    @Override
    public String getNome() {
        return super.nome;
    }
    
    @Override
    public int getCodigo() {
        return super.codigo;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }  

    @Override
    public String toString() {
        return "";
    }
}
