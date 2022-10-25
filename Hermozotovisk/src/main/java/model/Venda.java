package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ndeba
 */
public class Venda implements Comparator<Venda>, Comparable<Venda> {
    
    private LocalDateTime dataHoraVenda;
    private Vendedor vendedor;
    private Cliente cliente;
    private List<ItemProduto> itensCompra;
    private double valorTotal;
    private String formaDePagamento;
    private static int codigoVenda = 1;
    private int codigo;
    
    private final DateTimeFormatter formataçãoData;
    
    public Venda(Vendedor vendedor, Cliente cliente, List<ItemProduto> itensCompra, String formaDePagamento){
        this.codigo = Venda.codigoVenda;
        Venda.codigoVenda += 1;
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
            valorTotal += produto.getPreco();
        }
    }
    
    public String getDataHoraVenda() {
        return dataHoraVenda.format(formataçãoData);
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

    public int getCodigo() {
        return codigo;
    }
    
    
    @Override
    public String toString(){
        String produtos = "";
        
        for (ItemProduto p : itensCompra){
            produtos += p.getNome() + " R$" + p.getPreco()/p.getQuantidade() + " - " + p.getQuantidade() + " Un. \n";
        }
        
        return"VENDA REALIZADA DIA: " + getDataHoraVenda() +
                "\nCLIENTE: " + getCliente() + 
                "\nVENDEDOR: " + vendedor
                + "\nFORMA DE PAGAMENTO: " + getFormaDePagamento() 
                + "\nPRODUTOS: " + produtos
                + "\nVALOR TOTAL: R$" + getValorTotal() + "\n";
    }

    @Override
    public int compare(Venda o1, Venda o2) {

            return compareTo(o2); 
    }

    @Override
    public int compareTo(Venda o) {
        if(this.getValorTotal() < o.getValorTotal()){
            return 1;
        }else if(this.getValorTotal() > o.getValorTotal()){
            return -1;
    }else{
            return 0;
        }
    }

 
}
