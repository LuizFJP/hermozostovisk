package view;

import dao.ProdutoDAO;
import model.Categoria;
import model.Produto;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import dao.ClienteDAO;
import model.Cliente;
import controller.Controller;


/**
 *
 * @author Gustavo
 */
public class AdminView extends javax.swing.JFrame implements Controller {
    
    private List<Categoria> categorias;
    private ProdutoDAO produtoDAO = new ProdutoDAO();
    private ClienteDAO clienteDAO = new ClienteDAO();
    /**    
    /**
     * Creates new form MainView
     */
    public AdminView(){
        this.categorias = new ArrayList<>();

        
        initComponents();
        this.setTitle("LGC - HermosoStovisk");
    }
    
    public List<Categoria> getCategorias(){
        return this.categorias;
    }
    
    public ProdutoDAO getProdutoDAO() {
        return this.produtoDAO;
    }
    
    @Override
    public void limpaCampo(JTextField textField){
        textField.setText("");
    }
     
    @Override
    public void limpaCampo(JTextArea textArea){
        textArea.setText("");
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mCadastro = new javax.swing.JMenu();
        miCadastrarProduto = new javax.swing.JMenuItem();
        miCadastrarCategoria = new javax.swing.JMenuItem();
        mRelatorio = new javax.swing.JMenu();
        miRelatorioVenda = new javax.swing.JMenuItem();
        miRelatorioCliente = new javax.swing.JMenuItem();
        miRelatorioProdutos = new javax.swing.JMenuItem();
        mVenda = new javax.swing.JMenu();
        miRealizaVenda = new javax.swing.JMenuItem();
        mRemover = new javax.swing.JMenu();
        miRemoverCliente = new javax.swing.JMenuItem();
        miRemoverProduto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 248, 232));

        mCadastro.setText("Cadastrar");

        miCadastrarProduto.setText("Cadastrar Produtos");
        miCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarProdutoActionPerformed(evt);
            }
        });
        mCadastro.add(miCadastrarProduto);

        miCadastrarCategoria.setText("Cadastrar Categorias");
        miCadastrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarCategoriaActionPerformed(evt);
            }
        });
        mCadastro.add(miCadastrarCategoria);

        jMenuBar1.add(mCadastro);

        mRelatorio.setText("Relatórios");

        miRelatorioVenda.setText("Relatório de Vendas");
        mRelatorio.add(miRelatorioVenda);

        miRelatorioCliente.setText("Relatório de Clientes");
        miRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRelatorioClienteActionPerformed(evt);
            }
        });
        mRelatorio.add(miRelatorioCliente);

        miRelatorioProdutos.setText("Relatório de Produtos");
        miRelatorioProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRelatorioProdutosActionPerformed(evt);
            }
        });
        mRelatorio.add(miRelatorioProdutos);

        jMenuBar1.add(mRelatorio);

        mVenda.setText("Venda");

        miRealizaVenda.setText("Realizar Venda");
        miRealizaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRealizaVendaActionPerformed(evt);
            }
        });
        mVenda.add(miRealizaVenda);

        jMenuBar1.add(mVenda);

        mRemover.setText("Remover");

        miRemoverCliente.setText("Remover Cliente");
        mRemover.add(miRemoverCliente);

        miRemoverProduto.setText("Remover Produto");
        miRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRemoverProdutoActionPerformed(evt);
            }
        });
        mRemover.add(miRemoverProduto);

        jMenuBar1.add(mRemover);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1330, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1439, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarProdutoActionPerformed
        // TODO add your handling code here:
        CadastroProdutoView novoProduto = new CadastroProdutoView(this);
        novoProduto.setVisible(true);
    }//GEN-LAST:event_miCadastrarProdutoActionPerformed

    private void miRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioClienteActionPerformed
        // TODO add your handling code here:
        RelatorioClienteView relCliente = new RelatorioClienteView();
        relCliente.setVisible(true);
    }//GEN-LAST:event_miRelatorioClienteActionPerformed

    private void miCadastrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarCategoriaActionPerformed
        // TODO add your handling code here:
        CadastroCategoriaView novaCategoria = new CadastroCategoriaView(this);
        novaCategoria.setVisible(true);
    }//GEN-LAST:event_miCadastrarCategoriaActionPerformed

    private void miRelatorioProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioProdutosActionPerformed
        // TODO add your handling code here:
        RelatorioProdutoView relProd = new RelatorioProdutoView(this);
        relProd.setVisible(true);
    }//GEN-LAST:event_miRelatorioProdutosActionPerformed

    private void miRealizaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRealizaVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miRealizaVendaActionPerformed

    private void miRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRemoverProdutoActionPerformed
        // TODO add your handling code here:

      RemoverProdutoView remProd = new RemoverProdutoView();
      remProd.setVisible(true);

    }//GEN-LAST:event_miRemoverProdutoActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mCadastro;
    private javax.swing.JMenu mRelatorio;
    private javax.swing.JMenu mRemover;
    private javax.swing.JMenu mVenda;
    private javax.swing.JMenuItem miCadastrarCategoria;
    private javax.swing.JMenuItem miCadastrarProduto;
    private javax.swing.JMenuItem miRealizaVenda;
    private javax.swing.JMenuItem miRelatorioCliente;
    private javax.swing.JMenuItem miRelatorioProdutos;
    private javax.swing.JMenuItem miRelatorioVenda;
    private javax.swing.JMenuItem miRemoverCliente;
    private javax.swing.JMenuItem miRemoverProduto;
    // End of variables declaration//GEN-END:variables

    @Override
    public Produto buscarProdutoPorNome(String nome) {
        for(Produto p: this.produtoDAO.getProdutos()){
            if(p.getNome().contains(nome)){
                return p;
            }
        }
        return null;
    }

    @Override
    public Produto buscarProdutoPorCodigo(int codigo) {

        return null;
    }

    @Override
    public Cliente buscarClientePorNome(String nome) {
        for (Cliente c : clienteDAO.getClientes()) {
            if(c.getNome().toLowerCase().contains(nome.toLowerCase()))
                return c;
        }
        return null;
    }

    @Override
    public Cliente buscarClientePorCPF(String CPF) {
        for (Cliente c : clienteDAO.getClientes()) {
            if(CPF.equals(c.getCPF()))
                return c;
        }
        return null;
    }

    @Override
    public void mensagem(String mensagem) {
          JOptionPane.showMessageDialog(null, mensagem);
    }
}
