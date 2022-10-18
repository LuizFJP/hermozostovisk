package view;

import dao.ProdutoDAO;
import model.Categoria;
import model.Produto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo
 */
public class CadastroProdutoView extends javax.swing.JFrame {

    private AdminView main;
    private ProdutoDAO produtoDAO;

    /**
     * Creates new form ViewCadastroProduto
     *
     * @param main
     */
    public CadastroProdutoView(AdminView main) {
        this.main = main;
        this.produtoDAO = main.getProdutoDAO();
        initComponents();
        this.setTitle("Cadastrar Produtos");
        for (Categoria cat : this.main.getCategorias()) {
            cbCategoria.addItem(cat.getNome());
        }
        this.generateList();
    }

    public void generateList() {
        for (Produto pDAO : this.produtoDAO.getProdutos()) {
            DefaultTableModel model = (DefaultTableModel) tbListaProdutos.getModel();
            Object data[] = {
                pDAO.getNome(), pDAO.getCategoria(), pDAO.getPreco(), pDAO.getDescricao()
            };
            model.addRow(data);

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
        jTable1 = new javax.swing.JTable();
        tfNomeProduto = new javax.swing.JTextField();
        tfPrecoProduto = new javax.swing.JTextField();
        lbTituloProduto = new javax.swing.JLabel();
        lbNomeProduto = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        lbNomeCategoria = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btCadastro = new javax.swing.JButton();
        tfDescricaoProduto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbListaProdutos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        tfPrecoProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbTituloProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTituloProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloProduto.setLabelFor(this);
        lbTituloProduto.setText("Cadastrar Produto");
        lbTituloProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbNomeProduto.setText("Nome do Produto");

        lbNomeCategoria.setText("Selecionar Categoria");

        jLabel1.setText("Preço R$");

        jLabel2.setText("Descrição do Produto");

        btCadastro.setText("Cadastrar");
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });

        tbListaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Categoria", "Preço R$", "Descrição"
            }
        ));
        jScrollPane2.setViewportView(tbListaProdutos);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Lista de Produtos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tfPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfDescricaoProduto, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 180, Short.MAX_VALUE)
                        .addComponent(lbNomeCategoria, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfNomeProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(lbNomeProduto, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(btCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(223, 223, 223))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbTituloProduto)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeProduto)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 30, Short.MAX_VALUE)
                        .addComponent(lbNomeCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCadastro))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed
        // TODO add your handling code here:
        String nome = tfNomeProduto.getText();
        String descricao = tfDescricaoProduto.getText();
        String preco = tfPrecoProduto.getText();
        String categoria = (String) cbCategoria.getSelectedItem();
        Produto prod = new Produto(nome, Double.parseDouble(preco), descricao, categoria);
        this.produtoDAO.addProduto(prod);
        JOptionPane.showMessageDialog(null, "Produto Criado com Sucesso!");

        this.generateList();
    }//GEN-LAST:event_btCadastroActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastro;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbNomeCategoria;
    private javax.swing.JLabel lbNomeProduto;
    private javax.swing.JLabel lbTituloProduto;
    private javax.swing.JTable tbListaProdutos;
    private javax.swing.JTextField tfDescricaoProduto;
    private javax.swing.JTextField tfNomeProduto;
    private javax.swing.JTextField tfPrecoProduto;
    // End of variables declaration//GEN-END:variables
}
