package view;

import java.awt.Color;
import model.Categoria;
import utils.Mensagem;
import utils.Limpador;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class CadastroCategoriaView extends javax.swing.JFrame {

    private AdminView main;

    /**
     * Creates new form CadastroCategoriaView
     *
     * @param main
     */
    public CadastroCategoriaView(AdminView main) {
        this.main = main;
        initComponents();
        this.setTitle("Cadastrar Categoria");
        decoracao();
    }
    private void decoracao(){
        getContentPane().setBackground(Color.decode("#3f3f46"));
        lbTitulo.setForeground(Color.decode("#fafaf9"));
        lbNome.setForeground(Color.decode("#fafaf9"));
        lbCodigo.setForeground(Color.decode("#fafaf9"));
        tfCodigoCategoria.setForeground(Color.decode("#18181b"));
        tfNomeCategoria.setForeground(Color.decode("#18181b"));
        btCadastrar.setBackground(Color.decode("#38bdf8"));
        btCadastrar.setForeground(Color.decode("#fafaf9"));
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
        lbNome = new javax.swing.JLabel();
        tfCodigoCategoria = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tfNomeCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNome.setText("Nome da Categoria");

        tfCodigoCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCodigo.setText("Código da Categoria");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitulo.setText("Cadastro de Categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(lbTitulo)
                .addGap(168, 168, 168))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addComponent(lbCodigo)
                    .addComponent(lbNome)
                    .addComponent(tfCodigoCategoria))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbTitulo)
                .addGap(32, 32, 32)
                .addComponent(lbNome)
                .addGap(8, 8, 8)
                .addComponent(tfNomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lbCodigo)
                .addGap(8, 8, 8)
                .addComponent(tfCodigoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        try {
            int codigo = Integer.parseInt(tfCodigoCategoria.getText());
            String nome = tfNomeCategoria.getText();
            Categoria cat = new Categoria(codigo, nome);
            this.main.getCategorias().add(cat);
            new Mensagem().mensagem("Categoria Cadastrada!");
            main.limpaCampo(tfNomeCategoria);
            main.limpaCampo(tfCodigoCategoria);

        } catch (NumberFormatException err) {
            new Limpador().limpaCampo(tfCodigoCategoria);
            new Mensagem().mensagem("Informe apenas números ao cadastrar a categoria");
        }

    }//GEN-LAST:event_btCadastrarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfCodigoCategoria;
    private javax.swing.JTextField tfNomeCategoria;
    // End of variables declaration//GEN-END:variables
}
