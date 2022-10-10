package view;

import model.Categoria;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class CadastroCategoriaView extends javax.swing.JFrame {
    private AdminView main;
    /**
     * Creates new form CadastroCategoriaView
     * @param main
     */
    public CadastroCategoriaView(AdminView main) {
        this.main = main;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfNomeCategoria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfCodigoCategoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();

        tfNomeCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("Nome da Categoria");

        tfCodigoCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Código da Categoria");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadastrar)
                    .addComponent(tfCodigoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCodigoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btCadastrar)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        int codigo = Integer.parseInt(tfCodigoCategoria.getText());
        String nome = tfNomeCategoria.getText();
        Categoria cat = new Categoria(codigo, nome);
        this.main.getCategorias().add(cat);
        JOptionPane.showMessageDialog(null, "Categoria Cadastrada!");
        main.limpaCampo(tfNomeCategoria);
        main.limpaCampo(tfCodigoCategoria);
        
    }//GEN-LAST:event_btCadastrarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfCodigoCategoria;
    private javax.swing.JTextField tfNomeCategoria;
    // End of variables declaration//GEN-END:variables
}
