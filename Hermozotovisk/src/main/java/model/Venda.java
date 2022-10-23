package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ndeba
 */
public class Venda implements Comparator<Venda> {
    
    private LocalDateTime dataHoraVenda;
    private Vendedor vendedor;
    private Cliente cliente;
    private List<ItemProduto> itensCompra;
    private double valorTotal;
    private String formaDePagamento;
    
    private final DateTimeFormatter formataçãoData;
    
    public Venda(Vendedor vendedor, Cliente cliente, List<ItemProduto> itensCompra, String formaDePagamento){
        this.formataçãoData = DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm:ss");
        this.dataHoraVenda = LocalDateTime.now();
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.itensCompra = itensCompra;
        this.formaDePagamento = formaDePagamento;
        calculaValor();
    }
    
    private void calculaValor(){
        for (ItemProduto produto: itensCompra){
            valorTotal += produto.getPreco() * produto.getQuantidade();
        }
    }
    
    public LocalDateTime getDataHoraVenda() {
        return dataHoraVenda;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemProduto> getItensCompra() {
        return itensCompra;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }
    
    @Override
    public String toString(){
        String produtos = "";
        
        for (ItemProduto p : itensCompra){
            produtos += p.getNome() + " R$" + p.getPreco() + " " + p.getQuantidade() + "Un. \n";
        }
        
        return"VENDA REALIZADA DIA: " + getDataHoraVenda() +
                "\nCLIENTE: " + getCliente() + 
                "\nVENDEDOR: " + vendedor
                + "\nFORMA DE PAGAMENTO: " + getFormaDePagamento() + " VALOR TOTAL: R$" + getValorTotal()
                + "\nPRODUTOS: \n" + produtos;
    }

    @Override
    public int compare(Venda o1, Venda o2) {
       if(o1.getValorTotal() > o2.getValorTotal()){
           return 1;
       }else if(o1.getValorTotal() == o2.getValorTotal()){
           return 0;
       }else{
           return -1;
       }
    }

 
}
