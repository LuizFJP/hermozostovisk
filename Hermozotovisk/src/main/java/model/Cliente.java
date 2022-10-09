package model;
import interfaces.IPessoa;
/**
 *
 * @author luizportel4
 */
public class Cliente extends Pessoa {

    private String endereco;

    public Cliente(String nome, String cpf, String senha, String endereco) {
        super(nome, cpf, senha);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getNome() {
        return super.nome;
    }

    public String getCPF() {
        return cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
