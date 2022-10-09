package model;

/**
 *
 * @author Gustavo
 */
public class Produto{
    private String nome;
    private String codigo;
    private double preco;
    private String categoria;
    private String descricao;

    public Produto(String nome, double preco, String descricao, String categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isBlank())
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (!codigo.isBlank())
        this.codigo = codigo;
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

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return " " + nome + " R$" + preco + " " + descricao + " " + getCategoria() + "\n";
    }
    public String relatoBusca(){
        return "Nome: " + getNome() + "\nPreço: R$" + getPreco() + "\nDescrição: " + getDescricao() + "\nCategoria: " + getCategoria() + "\n";
                
    } 
}
