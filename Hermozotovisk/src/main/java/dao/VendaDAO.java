/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Venda;
import repository.VendaRepository;

/**
 *
 * @author sonho
 */
public class VendaDAO implements VendaRepository{
    public static List<Venda> vendas = new ArrayList();

    @Override
    public List<Venda> getVendas() {
       return vendas;
    }

    @Override
    public void addVenda(Venda venda) {
        vendas.add(venda);
    }
    
}
