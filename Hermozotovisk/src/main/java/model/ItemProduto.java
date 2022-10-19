package model;

/**
 *
 * @author ndeba
 */
public class ItemProduto extends Produto{

    public Integer quantidade;
    
    public ItemProduto(String nome, double preco, String descricao, String categoria, Integer quantidade) {
        super(nome, preco, descricao, categoria);
        this.quantidade = quantidade;
    }

    @Override
    public String relatoBusca() {
        return super.relatoBusca();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void setDescricao(String descricao) {
        super.setDescricao(descricao);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }
    
    @Override
    public String getCategoria() {
        return super.getCategoria(); 
    }

    @Override
    public void setPreco(double preco) {
        super.setPreco(preco);
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    @Override
    public int getCodigo() {
        return super.getCodigo();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getNome() {
        return super.getNome();
    } 
    
    public Integer getQuantidade(){
        return this.quantidade;
    }
}
