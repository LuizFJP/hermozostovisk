package br.udesc.prog2.hermozostoviski.model;

/**
 *
 * @author luizportel4
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
