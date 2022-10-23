package repository;

import java.util.List;
import model.Venda;

/**
 *
 * @author ndeba
 */
public interface VendaRepository {
    public List<Venda> getVendas();
    public void addVenda(Venda venda);
    
}
