package model;
import repository.IPessoa;
/**
 *
 * @author luizportel4
 */
public class Cliente extends Pessoa {

    private String endereco;

    public Cliente(String nome, String cpf, String endereco) {
        super(nome, cpf);
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
    
    public void removeClient(String cpf) {
        
    }
    @Override
    public String toString(){
        return this.getNome() + "\n Endereço: " + this.getEndereco() + "\n CPF: " + this.getCPF();

    }
}
