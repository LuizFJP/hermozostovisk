package view;

import controller.Controle;
import dao.ProdutoDAO;
import model.Categoria;
import model.Produto;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class AdminView extends javax.swing.JFrame implements Controle {
    
    private List<Categoria> categorias;
    private ProdutoDAO produtoDAO = new ProdutoDAO();;
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

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mCadastro;
    private javax.swing.JMenu mRelatorio;
    private javax.swing.JMenuItem miCadastrarCategoria;
    private javax.swing.JMenuItem miCadastrarProduto;
    private javax.swing.JMenuItem miRelatorioCliente;
    private javax.swing.JMenuItem miRelatorioProdutos;
    private javax.swing.JMenuItem miRelatorioVenda;
    // End of variables declaration//GEN-END:variables

    @Override
    public Produto buscarProdutoPorNome(String nome) {
        for(Produto p: this.produtoDAO.getProdutos()){
            if(nome.equals(p.getNome())){
                return p;
            }
        }
        return null;
    }

    @Override
    public Produto buscarProdutoPorCodigo(String codigo) {
        for (Produto p : this.produtoDAO.getProdutos()){
            if(codigo.equals(p.getCodigo()))
                return p;
        }
        return null;
    }
}
