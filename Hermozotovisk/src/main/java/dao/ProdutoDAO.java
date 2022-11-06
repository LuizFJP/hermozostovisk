package dao;

import java.util.ArrayList;
import java.util.List;
import model.Produto;

/**
 *
 * @author luizportel4
 */
public class ProdutoDAO{
    public static List<Produto> produtos = new ArrayList<>();
    
    public ProdutoDAO(){
//        populateProdutos();
    }
    public void addProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void removeProduto(int i){
        produtos.remove(i);
    }
    public void removeProduto(Produto prod){
        produtos.remove(prod);
    }

    private void populateProdutos() { //caso queira adicionar algo, copie isso: new Produto("", 1000.00, "", "", 0),
        Produto[] produtos = {
            new Produto("Processador", 800.00, "Processador intel quase derretido do uso.", "CPUs", 30),
            new Produto("Placa de vídeo", 3500.00, "Placa de vídeo que roda campo minado.", "GPUs", 31),
            new Produto("Monitor", 1000.00, "Tela que machuca o olho", "Periféricos", 567),
            new Produto("Teclado gamer", 300.00, "Teclado que não tem todas as teclas que vc precisa, porém brilha.", "Periféricos", 64),
            new Produto("Mouse Gamer", 600.00, "Mouse que faz tudo que um mouse normal faz, só que brilha", "Periféricos", 873),
            new Produto("Cadeira Gamer", 1200.00, "Cadeira bonita que machuca as costas", "Escritório", 23),
            new Produto("Cadeira de Escritório", 2000, "Cadeira feia que machuca as costas A LONGO PRAZO", "Escritório", 15),
        };
        for (Produto p : produtos) {
            this.produtos.add(p);
        }
    }

    
}
