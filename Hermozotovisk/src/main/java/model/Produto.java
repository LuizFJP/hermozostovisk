package model;

/**
 *
 * @author Gustavo
 */
public class Produto implements Comparable<Produto> {

    
    private String nome;
    private int codigo;
    private double preco;
    private String categoria;
    String descricao;
    private static int codigoProduto = 1;
    public Integer quantidade;
    
    @Override
    public int compareTo(Produto o) {
        if(this.preco == o.preco) {
            return 0;
        } else if(this.preco < o.preco) {
            return 1;
        } else {
            return -1;
        }
    }

    public Produto(String nome, double preco, String descricao, String categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.codigo = Produto.codigoProduto;
        Produto.codigoProduto += 1;
    }

    public Produto(String nome, double preco, String descricao, String categoria, Integer quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.codigo = Produto.codigoProduto;
        Produto.codigoProduto += 1;
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isBlank())
        this.nome = nome;
    }

    public int getCodigo(){
        return this.codigo;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco < 0)
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getQuantidade(){
        return quantidade;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(Integer quantidade){
        if (quantidade >= 0)
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {

        return " " + nome + " - R$" + preco + " - Em estoque: " + quantidade;
    }
    public String relatoBusca(){
        return "Nome: " + getNome() + "\nPreço: R$" + getPreco() + "\nDescrição: " + getDescricao() + "\nCategoria: " + getCategoria() + "\nCodigo: " + getCodigo() + "\n";
                
    } 
}
