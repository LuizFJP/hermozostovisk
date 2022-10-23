package view;

import dao.ClienteDAO;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;
import model.ItemProduto;
import model.Produto;
import dao.ProdutoDAO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.Cliente;
import controller.Controller;

/**
 *
 * @author Nicolas
 */
public class VendaView extends javax.swing.JFrame implements Controller {

    private ProdutoDAO produtoDAO = new ProdutoDAO();
    private ClienteDAO clienteDAO = new ClienteDAO();
    List<ItemProduto> pedido = new ArrayList<>();
    
    public VendaView(Funcionario vendedor) {
        initComponents();
        
        vendedorAtual.setText("Vendedor(a): " + vendedor.getNome());
        this.setTitle("Realizar Venda");
        atualizarTotal();
    }

    private void atualizarTotal() {
        Double valorTotalDaCompra = 0.0;
        for (int i = 0; i < tbProdutos.getRowCount(); i++){
            valorTotalDaCompra += Double.parseDouble(tbProdutos.getValueAt(i, 3).toString());
        }
        tfTotal.setText("" + valorTotalDaCompra);
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
        jList1 = new javax.swing.JList<>();
        bgFormasDePagamento = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tfNomeProduto = new javax.swing.JTextField();
        tfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JButton();
        tfTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btAdicionar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCPF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfNomeCliente = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        ltClientes = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        ltProdutos = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        btRemover = new javax.swing.JButton();
        btCadCliente = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        rbDinheiro = new javax.swing.JRadioButton();
        tfEndereco = new javax.swing.JTextField();
        JLabel12 = new javax.swing.JLabel();
        btFecharPedido = new javax.swing.JButton();
        rbCredito = new javax.swing.JRadioButton();
        rbDebito = new javax.swing.JRadioButton();
        spQuantidade = new javax.swing.JSpinner();
        rbBoletoBancario = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btPesquisarCliente = new javax.swing.JButton();
        vendedorAtual = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setLocation(new java.awt.Point(0, 0));
        setState(1);

        jLabel1.setText("Cod. Produto:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("NOME DA LOJA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Pesquisar");

        jLabel4.setText("Nome:");

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        tfTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel5.setText("TOTAL: R$");

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Pedido");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Cliente");

        jLabel8.setText("CPF:");

        jLabel9.setText("Nome:");

        jScrollPane3.setViewportView(ltClientes);

        jScrollPane4.setViewportView(ltProdutos);

        jLabel10.setText("Quantidade");

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btCadCliente.setText("Cadastrar Cliente");
        btCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadClienteActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel11.setText("Cliente novo?");

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Código", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tbProdutos);

        bgFormasDePagamento.add(rbDinheiro);
        rbDinheiro.setText("Dinheiro (à vista)");

        JLabel12.setText("Endereço:");

        btFecharPedido.setText("Fechar pedido");
        btFecharPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharPedidoActionPerformed(evt);
            }
        });

        bgFormasDePagamento.add(rbCredito);
        rbCredito.setText("Cartão de Crédito");

        bgFormasDePagamento.add(rbDebito);
        rbDebito.setText("Cartão Débito");

        spQuantidade.setValue(1);

        bgFormasDePagamento.add(rbBoletoBancario);
        rbBoletoBancario.setText("Boleto Bancário");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("DADOS DA COMPRA");

        jButton1.setText("CONCLUIR");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1x (à vista)", "2x", "3x", "4x", "5x", "6x", "7x", "8x", "9x", "10x", "11x", "12x" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        btPesquisarCliente.setText("Pesquisar");

        vendedorAtual.setText("Vendedor(a): null");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btPesquisarCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rbCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbDebito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbBoletoBancario)
                                    .addComponent(rbDinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btPesquisar))))
                            .addComponent(jLabel3)
                            .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btCadCliente)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(spQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btFecharPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(218, 218, 218))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vendedorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendedorAtual))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(spQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btRemover))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(btFecharPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadCliente)
                            .addComponent(btPesquisarCliente))))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbDinheiro)
                                .addGap(2, 2, 2)
                                .addComponent(rbCredito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(rbDebito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbBoletoBancario)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1007, 828));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        Produto item = ltProdutos.getSelectedValue();
        int quantidade = (int) spQuantidade.getValue();
        if (quantidade <= 0 || quantidade > item.getQuantidade()){
           mensagem("Quantidade invalida ou excedente");
        }
        else{
        inserirItemTabela(item, quantidade);
        atualizarTotal();
        
        limpaCampo(tfNomeProduto);
        limpaCampo(tfCodigo);
        }
    }//GEN-LAST:event_btAdicionarActionPerformed
  
    private void btCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadClienteActionPerformed
        CadClienteView cadastroClienteView = new CadClienteView();
        cadastroClienteView.setVisible(true);
    }//GEN-LAST:event_btCadClienteActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        
        Produto resultadoPorNome = buscarProdutoPorNome(tfNomeProduto.getText());
        Produto resultadoPorCodigo = buscarProdutoPorCodigo(tfCodigo.getText());
        
        //APENAS A PESQUISA POR NOME ESTÁ FUNCIONANDO!
        
        if (campoCodigoVazio() && !campoNomeVazio()){
            verificarEMostrar(resultadoPorNome);
        }
        else if(campoNomeVazio() && !campoCodigoVazio()){
            verificarEMostrar(resultadoPorCodigo);
        }
        else if(!campoNomeVazio() && !campoCodigoVazio()){
            if (resultadoPorNome.equals(resultadoPorCodigo))
                verificarEMostrar(resultadoPorNome);
            else {
            mensagem("Não encotrado");
            limpaCampo(tfNomeProduto);
            limpaCampo(tfCodigo);
            }
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed

        removerItemTabela();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btFecharPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharPedidoActionPerformed

        pedido = gerarPedido();
        mensagem("Pedido gerado com sucesso");
        verificarEMostrar(buscarProdutoPorNome(ltProdutos.getSelectedValue().getNome()));
    }//GEN-LAST:event_btFecharPedidoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel12;
    private javax.swing.ButtonGroup bgFormasDePagamento;
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btCadCliente;
    private javax.swing.JButton btFecharPedido;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btPesquisarCliente;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> ltClientes;
    private javax.swing.JList<Produto> ltProdutos;
    private javax.swing.JRadioButton rbBoletoBancario;
    private javax.swing.JRadioButton rbCredito;
    private javax.swing.JRadioButton rbDebito;
    private javax.swing.JRadioButton rbDinheiro;
    private javax.swing.JSpinner spQuantidade;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNomeCliente;
    private javax.swing.JTextField tfNomeProduto;
    private javax.swing.JTextField tfTotal;
    private javax.swing.JLabel vendedorAtual;
    // End of variables declaration//GEN-END:variables

   //----------------- Metodos de criaçao da venda -----------------//
    
    private List<ItemProduto>gerarPedido(){
        List<ItemProduto> pedidoGerado = new ArrayList<>();
        
        byte colunaNome = 0;
        byte colunaCodigo = 1;
        byte colunaQuantidade = 2;
        byte colunaPreco = 3;
        
        for (int linhaAtual = 0; linhaAtual < tbProdutos.getRowCount(); linhaAtual++){
            String nome = (String)tbProdutos.getValueAt(linhaAtual, colunaNome);
            Integer codigo = (int)tbProdutos.getValueAt(linhaAtual, colunaCodigo);
            Integer quantidade = (int)tbProdutos.getValueAt(linhaAtual, colunaQuantidade);
            Double preco = (Double)tbProdutos.getValueAt(linhaAtual, colunaPreco);
            
            ItemProduto item = new ItemProduto(nome, codigo, quantidade, preco);
            
            pedidoGerado.add(item);
            
            Produto prod = buscarProdutoPorNome(nome);
            prod.setQuantidade(prod.getQuantidade() - quantidade);
        }
        
        return pedidoGerado;
    }
    
    
    
   //----------------- Metodos de manipulaçao da tabela -----------------//
    
    private void mostrarResultado(Produto resultado){
        DefaultListModel<Produto> listaProdutos = new DefaultListModel();
        listaProdutos.addElement(resultado);
            ltProdutos.setModel(listaProdutos);
    }
    
    private boolean inserirItemTabela(Produto item, Integer quantidade){
        DefaultTableModel model = (DefaultTableModel) tbProdutos.getModel();
        for (int i = 0; i < tbProdutos.getRowCount(); i++){
            if (item.getNome().equals(tbProdutos.getValueAt(i, 0))){
               Integer quantidadeAnterior = Integer.parseInt(tbProdutos.getValueAt(i, 2).toString());
              if(quantidadeAnterior + Integer.parseInt(spQuantidade.getValue().toString()) > item.getQuantidade()){
                 mensagem("Produto excedente da quantidade em estoque");
                 return false;
              }else{
                  tbProdutos.setValueAt(quantidadeAnterior + quantidade, i, 2);
                  Double novoPreco = item.getPreco() * Integer.parseInt(tbProdutos.getValueAt(i, 2).toString());
                  tbProdutos.setValueAt(novoPreco, i, 3);
                return false;
              }
            }
        }
        model.addRow(new Object[]{item.getNome(), item.getCodigo(), quantidade, item.getPreco()*quantidade});
        return true;
    }
    
    private void removerItemTabela(){
        ((DefaultTableModel) tbProdutos.getModel()).removeRow(tbProdutos.getSelectedRow());
        atualizarTotal();
    }
    
    //----------------- Metodos de orientação pesquisa e busca -----------------//
    
    private void verificarEMostrar (Produto p){
        if (p == null)
            mensagem("Não encontrado!");
        
        mostrarResultado(p);
    }
    
    private boolean campoCodigoVazio(){
        if (tfCodigo.getText().isBlank())
            return true;
        return false;
    }
    
    private boolean campoNomeVazio(){
        if (tfNomeProduto.getText().isBlank())
            return true;
        return false;
    }
    
    @Override
    public Produto buscarProdutoPorNome(String nome) { //todos precisam ser implementados
       for(Produto p: produtoDAO.getProdutos()){
            if(p.getNome().toLowerCase().contains(nome.toLowerCase())){
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

    @Override
    public Cliente buscarClientePorNome(String nome) {
        Set<Cliente> clientes = new HashSet<>();
        clientes.addAll((Collection<?extends Cliente>) clienteDAO);
        
        for (Cliente cliente : clientes) {
            if (cliente.getNome().contains(nome))
                return cliente;
        }
        return null;
    }

    @Override
    public Cliente buscarClientePorCPF(String CPF) {
        Map<String, Cliente> clientes = (Map<String, Cliente>) clienteDAO.getClientes();
        return clientes.get(CPF);
    }

    @Override
    public void mensagem(String mensagem) {
         JOptionPane.showMessageDialog(null, mensagem);
    }

    @Override
    public void limpaCampo(JTextField textField) {
        textField.setText("");
    }

    @Override
    public void limpaCampo(JTextArea textArea) {
        textArea.setText("");
    }
}
