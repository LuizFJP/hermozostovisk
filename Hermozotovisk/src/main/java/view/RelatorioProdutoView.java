package view;

import dao.ProdutoDAO;
import model.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */

public class RelatorioProdutoView extends javax.swing.JFrame {
    private AdminView main;
    private ProdutoDAO produtoDAO;
    /**
     * Creates new form RelatorioProdutosView
     */
    public RelatorioProdutoView(AdminView main) {
        this.main = main;
        this.produtoDAO = main.getProdutoDAO();
        
        initComponents();
        for(Produto prod : this.produtoDAO .getProdutos()){
            taNome.append(prod.getNome());
            taNome.append("\n");
        }
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

        taNome.setEditable(false);
        taNome.setColumns(20);
        taNome.setLineWrap(true);
        taNome.setRows(5);
        taNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(taNome);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Lista de Produtos");

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

        jLabel5.setText("Buscar Produtos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btBuscar)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(tfBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed

        String buscar = tfBuscarNome.getText();
        Produto p = main.buscarProdutoPorNome(buscar);
        
        if(p != null){
            taBusca.append(p.relatoBusca());
        }else{
            JOptionPane.showMessageDialog(null, "Produto não está no Sistema");
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea taBusca;
    private javax.swing.JTextArea taNome;
    private javax.swing.JTextField tfBuscarNome;
    // End of variables declaration//GEN-END:variables
}
