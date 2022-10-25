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
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.Cliente;
import controller.Controller;
import dao.VendaDAO;
import java.awt.Color;
import java.awt.Cursor;
import java.util.stream.Collectors;
import model.Venda;
import model.Vendedor;

/**
 *
 * @author Nicolas Debacher
 */
public class VendaView extends javax.swing.JFrame implements Controller {

    private ProdutoDAO produtoDAO = new ProdutoDAO();
    private ClienteDAO clienteDAO = new ClienteDAO();
    private VendaDAO vendaDAO = new VendaDAO();

    private Vendedor vendedor;
    List<ItemProduto> pedido = new ArrayList<>();

    public VendaView(Funcionario vendedor) {
        initComponents();
        decoracao();
        this.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        lbClienteNovo.setText("<HTML><U>Clique aqui</U></HTML>");
        lbClienteNovo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.vendedor = (Vendedor) vendedor;
        this.setTitle("Realizar Venda");
        lbVendedorAtual.setText("Vendedor(a): " + vendedor.getNome());
        
        atualizarTotal();
    }

    private void decoracao() {
        getContentPane().setBackground(Color.decode("#3f3f46"));
        rbBoletoBancario.setBackground(Color.decode("#3f3f46"));
        rbCredito.setBackground(Color.decode("#3f3f46"));
        rbDebito.setBackground(Color.decode("#3f3f46"));
        rbDinheiro.setBackground(Color.decode("#3f3f46"));
        rbBoletoBancario.setForeground(Color.decode("#fafaf9"));
        rbCredito.setForeground(Color.decode("#fafaf9"));
        rbDebito.setForeground(Color.decode("#fafaf9"));
        rbDinheiro.setForeground(Color.decode("#fafaf9"));
        btAdicionar.setBackground(Color.decode("#38bdf8"));
        btAdicionar.setForeground(Color.decode("#fafaf9"));
        btCancelar.setBackground(Color.decode("#38bdf8"));
        btCancelar.setForeground(Color.decode("#fafaf9"));
        btConcluir.setBackground(Color.decode("#38bdf8"));
        btConcluir.setForeground(Color.decode("#fafaf9"));
        btFecharPedido.setBackground(Color.decode("#38bdf8"));
        btFecharPedido.setForeground(Color.decode("#fafaf9"));
        btPesquisarCliente.setBackground(Color.decode("#38bdf8"));
        btPesquisarCliente.setForeground(Color.decode("#fafaf9"));
        btPesquisarProduto.setBackground(Color.decode("#38bdf8"));
        btPesquisarProduto.setForeground(Color.decode("#fafaf9"));
        btRemover.setBackground(Color.decode("#38bdf8"));
        btRemover.setForeground(Color.decode("#fafaf9"));
        lbClienteNovo.setForeground(Color.decode("#2563eb"));
        lbVendedorAtual.setForeground(Color.decode("#fafaf9"));
        jLabel1.setForeground(Color.decode("#fafaf9"));
        jLabel10.setForeground(Color.decode("#fafaf9"));
        jLabel11.setForeground(Color.decode("#fafaf9"));
        jLabel12.setForeground(Color.decode("#fafaf9"));
        jLabel2.setForeground(Color.decode("#fafaf9"));
        jLabel3.setForeground(Color.decode("#fafaf9"));
        jLabel4.setForeground(Color.decode("#fafaf9"));
        jLabel5.setForeground(Color.decode("#fafaf9"));
        jLabel6.setForeground(Color.decode("#fafaf9"));
        jLabel7.setForeground(Color.decode("#fafaf9"));
        jLabel8.setForeground(Color.decode("#fafaf9"));
        jLabel9.setForeground(Color.decode("#fafaf9"));

        tfCPF.setBackground(Color.decode("#f3f4f6"));
        tfNomeProduto.setBackground(Color.decode("#f3f4f6"));
        tfNomeCliente.setBackground(Color.decode("#f3f4f6"));
        tfNomeProduto.setBackground(Color.decode("#f3f4f6"));
        tfCodigo.setBackground(Color.decode("#f3f4f6"));
        tfTotal.setBackground(Color.decode("#f3f4f6"));
        tfTotal.setForeground(Color.decode("#18181b"));
        tfNomeProduto.setForeground(Color.decode("#18181b"));
        tfCodigo.setForeground(Color.decode("#18181b"));
        tfCPF.setForeground(Color.decode("#18181b"));
        tfNomeCliente.setForeground(Color.decode("#18181b"));
        lbClienteNovo.setForeground(Color.decode("#fafaf9"));
        lbVendedorAtual.setForeground(Color.decode("#fafaf9"));
        tbProdutos.setBackground(Color.decode("#f3f4f6"));
        tbProdutos.setForeground(Color.decode("#18181b"));
        spQuantidade.setBackground(Color.decode("#f3f4f6"));
        spQuantidade.setForeground(Color.decode("#18181b"));
        cbParcelas.setBackground(Color.decode("#f3f4f6"));
        cbParcelas.setForeground(Color.decode("#18181b"));
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
        btPesquisarProduto = new javax.swing.JButton();
        tfTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btAdicionar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ltClientes = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        ltProdutos = new javax.swing.JList<>();
        btRemover = new javax.swing.JButton();
        lbClienteNovo = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        rbDinheiro = new javax.swing.JRadioButton();
        btFecharPedido = new javax.swing.JButton();
        rbCredito = new javax.swing.JRadioButton();
        rbDebito = new javax.swing.JRadioButton();
        spQuantidade = new javax.swing.JSpinner();
        rbBoletoBancario = new javax.swing.JRadioButton();
        btConcluir = new javax.swing.JButton();
        cbParcelas = new javax.swing.JComboBox<>();
        btPesquisarCliente = new javax.swing.JButton();
        lbVendedorAtual = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        tfCPF = new javax.swing.JTextField();
        tfNomeCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hermozostovisky\n");
        setLocation(new java.awt.Point(0, 0));
        setState(1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Cod. Produto:");

        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setText("AL Informática");


        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Pesquisar produtos");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nome:");

        btPesquisarProduto.setText("Pesquisar");
        btPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarProdutoActionPerformed(evt);
            }
        });

        tfTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Total :");

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Carrinho");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Inserir dados do cliente");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("CPF");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Nome");

        jScrollPane3.setViewportView(ltClientes);

        jScrollPane4.setViewportView(ltProdutos);

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        lbClienteNovo.setText("Clique aqui");
        lbClienteNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbClienteNovoMouseClicked(evt);
            }
        });

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
        rbDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDinheiroActionPerformed(evt);
            }
        });

        btFecharPedido.setText("Fechar pedido");
        btFecharPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharPedidoActionPerformed(evt);
            }
        });

        bgFormasDePagamento.add(rbCredito);
        rbCredito.setText("Cartão de Crédito");
        rbCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCreditoActionPerformed(evt);
            }
        });

        bgFormasDePagamento.add(rbDebito);
        rbDebito.setText("Cartão Débito");
        rbDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDebitoActionPerformed(evt);
            }
        });

        spQuantidade.setValue(1);

        bgFormasDePagamento.add(rbBoletoBancario);
        rbBoletoBancario.setText("Boleto Bancário");
        rbBoletoBancario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBoletoBancarioActionPerformed(evt);
            }
        });

        btConcluir.setText("FINALIZAR VENDA");
        btConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConcluirActionPerformed(evt);
            }
        });

        cbParcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1x (à vista)", "2x", "3x", "4x", "5x", "6x", "7x", "8x", "9x", "10x", "11x", "12x" }));

        btPesquisarCliente.setText("Pesquisar");
        btPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarClienteActionPerformed(evt);
            }
        });

        lbVendedorAtual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbVendedorAtual.setText("Vendedor(a): null");

        btCancelar.setText("CANCELAR VENDA");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        tfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCPFActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Finalizar Compra");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Cliente novo?");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Método de Pagamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbVendedorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(174, 174, 174)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                                .addComponent(btPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btRemover, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(btAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(spQuantidade))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(274, 274, 274)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(lbClienteNovo))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(458, 458, 458)
                                            .addComponent(jLabel10)))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(rbCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rbDebito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rbBoletoBancario)
                                            .addComponent(rbDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel11)
                                        .addComponent(cbParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(btFecharPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(491, 491, 491)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(64, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btConcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVendedorAtual))
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()

                        .addComponent(spQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(8, 8, 8)
                        .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btFecharPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel12)
                .addGap(8, 8, 8)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(lbClienteNovo))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbDinheiro)
                                .addGap(10, 10, 10)
                                .addComponent(rbCredito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbDebito)
                                .addGap(6, 6, 6)
                                .addComponent(rbBoletoBancario)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(btConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(906, 982));

        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        try {
            Produto item = ltProdutos.getSelectedValue();
            int quantidade = (int) spQuantidade.getValue();
            if (quantidade <= 0 || quantidade > item.getQuantidade()) {
                mensagem("Quantidade invalida ou excedente");
                System.out.println("Quantidade invalida ou excedente");
            } else {
                inserirItemTabela(item, quantidade);
                atualizarTotal();

                limpaCampo(tfNomeProduto);
                limpaCampo(tfCodigo);
            }
        } catch (NullPointerException ex) {
            mensagem("Selecione um Produto");
        }
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarProdutoActionPerformed

        Produto resultadoPorNome = buscarProdutoPorNome(tfNomeProduto.getText());

        if (campoCodigoVazio() && !campoNomeProdutoVazio()) {
            verificarEMostrar(resultadoPorNome);
            limpaCampo(tfNomeProduto);
        } else {
            try {
                int codigoProduto = Integer.parseInt(tfCodigo.getText());
                Produto resultadoPorCodigo = buscarProdutoPorCodigo(codigoProduto);
                if (campoNomeProdutoVazio() && !campoCodigoVazio()) {
                    verificarEMostrar(resultadoPorCodigo);
                    limpaCampo(tfCodigo);
                } else if (!campoNomeProdutoVazio() && !campoCodigoVazio()) {
                    if (resultadoPorNome.equals(resultadoPorCodigo)) {
                        verificarEMostrar(resultadoPorNome);
                        limpaCampo(tfNomeProduto);
                        limpaCampo(tfCodigo);
                    } else {
                        mensagem("Não encotrado");
                        limpaCampo(tfNomeProduto);
                        limpaCampo(tfCodigo);
                    }
                }
            } catch (NumberFormatException err) {
                limpaCampo(tfCodigo);
                mensagem("Por favor, informe apenas números na busca por código");
            }
        }

    }//GEN-LAST:event_btPesquisarProdutoActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed

        removerItemTabela();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btFecharPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharPedidoActionPerformed

        try{
        devolverProdutos();
        }
        catch(NullPointerException e){}
        
        finally{
            pedido = gerarPedido();
            
            try{
            if (pedido.isEmpty()) {
                mensagem("Nenhum produto Selecionado!");
    
            } else {
                mensagem("Pedido gerado com sucesso");
            }
            }catch(NullPointerException e){
                mensagem("Algum produto excede a capacidade disponível, verifique a disponibilidade e refaça o pedido.");
            }
            try {
                verificarEMostrar(buscarProdutoPorNome(ltProdutos.getSelectedValue().getNome()));
            } catch (NullPointerException e) {
            }
        }

    }//GEN-LAST:event_btFecharPedidoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        if (pedido.isEmpty()) {
            mensagem("nenhum pedido feito");
        } else {
            int cancelar = JOptionPane.showConfirmDialog(null, "Deseja cancelar a compra atual?", "Cancelar Compra", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (cancelar == JOptionPane.YES_OPTION) {
                devolverProdutos();
                pedido = new ArrayList<>();
                limparTodosOsCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Operação Cancelada", "Action: Operação Cancelada", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarClienteActionPerformed

        Cliente resultadoPorNome = buscarClientePorNome(tfNomeCliente.getText());
        Cliente resultadoPorCPF = buscarClientePorCPF(tfCPF.getText());

        if (campoCPFVazio() && !campoNomeClienteVazio()) {
            verificarEMostrar(resultadoPorNome);
        } else if (campoNomeClienteVazio() && !campoCPFVazio()) {
            verificarEMostrar(resultadoPorCPF);
        } else if (!campoNomeClienteVazio() && !campoCPFVazio()) {
            if (resultadoPorNome.equals(resultadoPorCPF)) {
                verificarEMostrar(resultadoPorNome);
            } else {
                mensagem("Não encotrado");
                limpaCampo(tfNomeProduto);
                limpaCampo(tfCodigo);
            }
        }

    }//GEN-LAST:event_btPesquisarClienteActionPerformed

    private void btConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConcluirActionPerformed

        if (ltClientes.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(null, "Compra inválida!"
                    + "\nPreencha corretamente todos os campos!", "Compra inválida", JOptionPane.ERROR_MESSAGE);
        } else if (bgFormasDePagamento.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Compra inválida!"
                    + "\nPreencha corretamente todos os campos!", "Compra inválida", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Venda venda = gerarVenda(pedido);
                vendaDAO.getVendas().add(venda);
                JOptionPane.showMessageDialog(null, "Compra Realizada com Sucesso!", "Compra Concluida", JOptionPane.WARNING_MESSAGE);
                System.out.println("Foi");
            } catch (NullPointerException ex) {
                mensagem("Operacao falhou");
                System.out.println("falhou");
            }
        }
    }//GEN-LAST:event_btConcluirActionPerformed

    private void rbDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDinheiroActionPerformed
        if (rbDinheiro.isSelected()) {
            cbParcelas.setSelectedIndex(0);
        }
        cbParcelas.setEnabled(false);

    }//GEN-LAST:event_rbDinheiroActionPerformed

    private void rbCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCreditoActionPerformed
        cbParcelas.setEnabled(true);
    }//GEN-LAST:event_rbCreditoActionPerformed

    private void rbDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDebitoActionPerformed
        cbParcelas.setEnabled(true);
    }//GEN-LAST:event_rbDebitoActionPerformed

    private void rbBoletoBancarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBoletoBancarioActionPerformed
        cbParcelas.setEnabled(true);
    }//GEN-LAST:event_rbBoletoBancarioActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void tfTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTotalActionPerformed

    private void tfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCPFActionPerformed

    private void lbClienteNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbClienteNovoMouseClicked
        // TODO add your handling code here:
        CadClienteView cadastroClienteView = new CadClienteView();
        cadastroClienteView.setVisible(true);
    }//GEN-LAST:event_lbClienteNovoMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgFormasDePagamento;
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConcluir;
    private javax.swing.JButton btFecharPedido;
    private javax.swing.JButton btPesquisarCliente;
    private javax.swing.JButton btPesquisarProduto;
    private javax.swing.JButton btRemover;
    private javax.swing.JComboBox<String> cbParcelas;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;

    private javax.swing.JLabel lbClienteNovo;

    private javax.swing.JLabel lbVendedorAtual;
    private javax.swing.JList<Cliente> ltClientes;
    private javax.swing.JList<Produto> ltProdutos;
    private javax.swing.JRadioButton rbBoletoBancario;
    private javax.swing.JRadioButton rbCredito;
    private javax.swing.JRadioButton rbDebito;
    private javax.swing.JRadioButton rbDinheiro;
    private javax.swing.JSpinner spQuantidade;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNomeCliente;
    private javax.swing.JTextField tfNomeProduto;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables

    //----------------- Metodos de manipulaçao da venda -----------------//
    private String getFormaDePagemento() {
        if (rbDinheiro.isSelected()) {
            return "Dinheiro (à vista)";
        } else if (rbCredito.isSelected()) {
            return "Cartão de Crédito";
        } else if (rbDebito.isSelected()) {
            return "Cartão de Débito";
        }
        return "Boleto Bancário";

    }

    private Venda gerarVenda(List<ItemProduto> pedido) {

        if (pedido == null) {
            JOptionPane.showMessageDialog(null, "Compra inválida!"
                    + "\nPreencha corretamente todos os campos!", "Compra inválida", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        Cliente cliente = ltClientes.getSelectedValue();
        String formaDePagamento = getFormaDePagemento() + cbParcelas.getSelectedItem();
        Venda venda = new Venda(vendedor, cliente, pedido, formaDePagamento);
        return venda;

    }

    private List<ItemProduto> gerarPedido() {
        List<ItemProduto> pedidoGerado = new ArrayList<>();

        byte colunaNome = 0;
        byte colunaCodigo = 1;
        byte colunaQuantidade = 2;
        byte colunaPreco = 3;

        for (int linhaAtual = 0; linhaAtual < tbProdutos.getRowCount(); linhaAtual++) {

            String nome = (String) tbProdutos.getValueAt(linhaAtual, colunaNome);
            Integer codigo = (int) tbProdutos.getValueAt(linhaAtual, colunaCodigo);
            Double preco = (Double) tbProdutos.getValueAt(linhaAtual, colunaPreco);
            int quantidade = (int) tbProdutos.getValueAt(linhaAtual, colunaQuantidade);

            ItemProduto item = new ItemProduto(nome, codigo, preco, quantidade);

            Produto prod = buscarProdutoPorNome(nome);
            if (prod.getQuantidade() < item.getQuantidade()) {
                return null;
            }

            pedidoGerado.add(item);
            prod.setQuantidade(prod.getQuantidade() - quantidade);
        }

        return pedidoGerado;
    }

    private void devolverProdutos() {
        
        for (ItemProduto item : pedido) {
            Produto prod = buscarProdutoPorNome(item.getNome());
            prod.setQuantidade(prod.quantidade + item.getQuantidade());
        }
    }

    //----------------- Metodos de manipulaçao da tabela -----------------//
    private void atualizarTotal() {
        Double valorTotalDaCompra = 0.0;
        for (int i = 0; i < tbProdutos.getRowCount(); i++) {
            valorTotalDaCompra += Double.parseDouble(tbProdutos.getValueAt(i, 3).toString());
        }
        tfTotal.setText("R$" + valorTotalDaCompra);
    }

    private void mostrarResultado(Produto resultado) {
        DefaultListModel<Produto> listaProdutos = new DefaultListModel();
        listaProdutos.addElement(resultado);
        ltProdutos.setModel(listaProdutos);
    }

    private void mostrarResultado(Cliente resultado) {
        DefaultListModel<Cliente> listaClientes = new DefaultListModel();
        listaClientes.addElement(resultado);
        ltClientes.setModel(listaClientes);
    }

    private boolean inserirItemTabela(Produto item, Integer quantidade) {
        DefaultTableModel model = (DefaultTableModel) tbProdutos.getModel();
        for (int i = 0; i < tbProdutos.getRowCount(); i++) {
            if (item.getNome().equals(tbProdutos.getValueAt(i, 0))) {
                Integer quantidadeAnterior = Integer.parseInt(tbProdutos.getValueAt(i, 2).toString());
                if (quantidadeAnterior + Integer.parseInt(spQuantidade.getValue().toString()) > item.getQuantidade()) {
                    mensagem("Produto excedente da quantidade em estoque");
                    return false;
                } else {
                    tbProdutos.setValueAt(quantidadeAnterior + quantidade, i, 2);
                    Double novoPreco = item.getPreco() * Integer.parseInt(tbProdutos.getValueAt(i, 2).toString());
                    tbProdutos.setValueAt(novoPreco, i, 3);
                    return false;
                }
            }
        }
        model.addRow(new Object[]{item.getNome(), item.getCodigo(), quantidade, item.getPreco() * quantidade});
        return true;
    }

    private void removerItemTabela() {
        try {
            ((DefaultTableModel) tbProdutos.getModel()).removeRow(tbProdutos.getSelectedRow());
        } catch (ArrayIndexOutOfBoundsException ex) {
            mensagem("Selecione o produto a ser removido");
        }
        atualizarTotal();
    }

    //----------------- Metodos de orientação pesquisa e busca -----------------//
    private void verificarEMostrar(Produto p) {
        if (p == null) {
            mensagem("Não encontrado!");
        }

        mostrarResultado(p);
    }

    private void verificarEMostrar(Cliente c) {
        if (c == null) {
            mensagem("Não encontrado!");
        }

        mostrarResultado(c);
    }

    private boolean campoCodigoVazio() {
        if (tfCodigo.getText().isBlank()) {
            return true;
        }
        return false;
    }

    private boolean campoNomeProdutoVazio() {
        if (tfNomeProduto.getText().isBlank()) {
            return true;
        }
        return false;
    }

    private boolean campoCPFVazio() {
        if (tfCPF.getText().isBlank()) {
            return true;
        }
        return false;
    }

    private boolean campoNomeClienteVazio() {
        if (tfNomeCliente.getText().isBlank()) {
            return true;
        }
        return false;
    }

    @Override //Funciona em plenitude (List)
    public Produto buscarProdutoPorNome(String nome) { //todos precisam ser implementados
        for (Produto p : produtoDAO.getProdutos()) {
            if (p.getNome().toLowerCase().contains(nome.toLowerCase())) {
                return p;
            }
        }
        return null;
    }

    @Override //Funciona em plenitude (Map)
    public Produto buscarProdutoPorCodigo(int codigo) {
        Map<Integer, Produto> produtos = produtoDAO.getProdutos().stream()
                .collect(Collectors.toMap(Produto::getCodigo, produto -> produto));

        return produtos.get(codigo);
    }

    @Override //Funciona em plenitude
    public Cliente buscarClientePorNome(String nome) {

        for (Cliente c : clienteDAO.getClientes()) {
            if (c.getNome().toLowerCase().contains(nome.toLowerCase())) {
                return c;
            }
        }
        return null;

    }

    @Override //Funciona em plenitude (Set)
    public Cliente buscarClientePorCPF(String CPF) {
        Set<Cliente> clientes = new HashSet<>();
        clientes.addAll(clienteDAO.getClientes());

        for (Cliente cliente : clientes) {
            if (cliente.getCPF().contains(CPF)) {
                return cliente;
            }
        }
        return null;

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

    public void limparTodosOsCampos() {
        limpaCampo(tfNomeProduto);
        limpaCampo(tfNomeCliente);
        limpaCampo(tfCPF);
        limpaCampo(tfCodigo);
        bgFormasDePagamento.clearSelection();

        DefaultListModel<Produto> listaProdutos = new DefaultListModel();
        ltProdutos.setModel(listaProdutos);
    }
}
