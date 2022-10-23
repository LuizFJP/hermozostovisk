package view;

import dao.ProdutoDAO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Produto;

/**
 *
 * @author Gustavo
 */

public class RelatorioProdutoView extends javax.swing.JFrame{
    private AdminView main;
    private ProdutoDAO produtoDAO = new ProdutoDAO();
    /**
     * Creates new form RelatorioProdutosView
     */
    public RelatorioProdutoView(AdminView main) {
        this.main = main;
        
        initComponents();
        List<Produto> produtos = this.produtoDAO.getProdutos();
        Collections.sort(produtos);
        for(Produto prod : produtos){
            
            taNome.append("| cod: " + prod.getCodigo() + "| nome: " + prod.getNome() + "| preço: R$" + prod.getPreco());
            taNome.append("\n");
            
        }
        this.setTitle("Relatório de Produtos");
    }
    public String listaProdutos(){
        String buscarCat = tfBuscaCategoria.getText();
        String text = "";
        for(Produto prod : this.produtoDAO.getProdutos()){
            if(prod.getCategoria().equals(buscarCat) && !buscarCat.isBlank()){
                text += prod.getNome() + "\n";
            }
        }
        return text;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taNome = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        taBusca = new javax.swing.JTextArea();
        tfBuscarNome = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbBuscanome = new javax.swing.JLabel();
        tfBuscaCategoria = new javax.swing.JTextField();
        lbBuscaCat = new javax.swing.JLabel();
        btnBuscaCategoria = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taBuscaCat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        taNome.setEditable(false);
        taNome.setColumns(20);
        taNome.setLineWrap(true);
        taNome.setRows(5);
        taNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(taNome);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Lista de Produtos (preço maior para o menor)");

        taBusca.setEditable(false);
        taBusca.setColumns(20);
        taBusca.setRows(5);
        jScrollPane5.setViewportView(taBusca);

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Buscar Produtos");

        lbBuscanome.setText("Buscar por Nome");

        lbBuscaCat.setText("Buscar por Categoria");

        btnBuscaCategoria.setText("Buscar");
        btnBuscaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaCategoriaActionPerformed(evt);
            }
        });

        taBuscaCat.setEditable(false);
        taBuscaCat.setColumns(20);
        taBuscaCat.setRows(5);
        jScrollPane2.setViewportView(taBuscaCat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(231, 231, 231)
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btBuscar))
                            .addComponent(lbBuscanome))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbBuscaCat)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfBuscaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuscaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 162, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(132, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbBuscanome)
                            .addComponent(lbBuscaCat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfBuscaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscar)
                            .addComponent(btnBuscaCategoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane5))
                        .addGap(180, 180, 180))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed

        String buscar = tfBuscarNome.getText();
        Produto p = main.buscarProdutoPorNome(buscar);
        if(p != null){
            main.limpaCampo(taBusca);
            taBusca.append(p.relatoBusca());
            main.limpaCampo(tfBuscarNome);
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btnBuscaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCategoriaActionPerformed
        // TODO add your handling code here:
        taBuscaCat.append(listaProdutos());
    }//GEN-LAST:event_btnBuscaCategoriaActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btnBuscaCategoria;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbBuscaCat;
    private javax.swing.JLabel lbBuscanome;
    private javax.swing.JTextArea taBusca;
    private javax.swing.JTextArea taBuscaCat;
    private javax.swing.JTextArea taNome;
    private javax.swing.JTextField tfBuscaCategoria;
    private javax.swing.JTextField tfBuscarNome;
    // End of variables declaration//GEN-END:variables


}
