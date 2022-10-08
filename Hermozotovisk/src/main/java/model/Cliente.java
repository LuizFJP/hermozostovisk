package model;
import interfaces.IPessoa;
/**
 *
 * @author luizportel4
 */
public class Cliente extends Pessoa implements IPessoa {

    private String endereco;

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
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

    public String getCpf() {
        return cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
