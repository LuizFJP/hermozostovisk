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
<<<<<<< HEAD
        return this.getNome() + "\nEndereço: " + this.getEndereco() + "\nCPF: " + this.getCPF();
=======
        return this.getNome() + "\n Endereço: " + this.getEndereco() + "\n CPF: " + this.getCPF() + "\n";
>>>>>>> 1a2eae3662f29c02730616dd53374991b1f88c27
    }
}
