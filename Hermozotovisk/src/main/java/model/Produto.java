package model;

/**
 *
 * @author Gustavo
 */
public class Produto implements Comparable<Produto> {

    
    protected String nome;
    protected int codigo;
    protected double preco;
    private String categoria;
    private String descricao;
    protected static int codigoProduto = 1;
    public int quantidade;
    
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

    public Produto(String nome, double preco, String descricao, String categoria, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.codigo = Produto.codigoProduto;
        Produto.codigoProduto += 1;
        this.quantidade = quantidade;
    }
    
    protected Produto(String nome, Integer codigo, Double preco){
      this.nome = nome;
      this.codigo = Produto.codigoProduto;
      this.preco = preco;
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

    public int getQuantidade(){
        return quantidade;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade){
        if (quantidade >= 0)
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {

        return " " + nome + " - R$" + preco + " - Disponivel: " + quantidade;
    }
    public String relatoBusca(){
        return "Nome: " + getNome() + "\nPreço: R$" + getPreco() + "\nDescrição: " + getDescricao() + "\nCategoria: " + getCategoria() + "\nCodigo: " + getCodigo() + "\n";
                
    } 
}
