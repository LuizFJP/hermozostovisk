/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.company.exercicios.projetoprog2;

/**
 *
 * @author sonho
 */
public class Produto{
    private String nome;
    private String codigo;
    private String preco;
    private String categoria;
    private String descricao;
    

    public Produto(String nome, String preco, String descricao, String categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
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
        return " " + nome + " " + preco + " " + descricao + " " + getCategoria() + "\n";
    }
    public String relatoBusca(){
        return "Nome: " + getNome() + "\nPreço: " + getPreco() + "\nDescrição: " + getDescricao() + "\nCategoria: " + getCategoria() + "\n";
                
    }

    
    
    
    
}
