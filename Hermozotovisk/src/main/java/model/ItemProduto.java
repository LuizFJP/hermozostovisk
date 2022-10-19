package model;

/**
 *
 * @author ndeba
 */
public class ItemProduto extends Produto{

    private int quantidade;
    
    public ItemProduto(String nome, double preco, String descricao, String categoria) {
        super(nome, preco, descricao, categoria);
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
    public void setCodigo(String codigo) {
        super.setCodigo(codigo); 
    }

    @Override
    public String getCodigo() {
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
}
