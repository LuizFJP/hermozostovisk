package model;

/**
 *
 * @author Gustavo
 */
public class Produto {

    private String nome;
    private String preco;
    private String categoria;
    private String descricao;
    private static int codigoProduto;
    private int codigo;

    public Produto(String nome, String preco, String descricao, String categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.codigo = Produto.codigoProduto;
        Produto.codigoProduto += 1;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setNome(String nome) {
        if (!nome.isBlank()) {
            this.nome = nome;
        }
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        if (!preco.isBlank()) {
            this.preco = preco;
        }
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
        return " " + nome + " " + preco + " " + descricao + " " + getCategoria() + "\n";
    }

    public String relatoBusca() {
        return "Nome: " + getNome() + "\nPreço: " + getPreco() + "\nDescrição: " + getDescricao() + "\nCategoria: " + getCategoria() + "\nCódigo:" + getCodigo() + "\n";

    }
}
