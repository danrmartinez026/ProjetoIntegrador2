/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import models.Cliente;
import javax.swing.table.DefaultTableModel;
import mocks.MockCliente;
import static mocks.MockCliente.listaCliente;
import mocks.MockLivro;
import models.Venda;
import static mocks.MockLivro.listaLivro;
import models.Livro;
import models.ItemVenda;
import service.ServiceItemVenda;
import service.ServiceVenda;

/**
 *
 * @author Dan
 */
public class ViewVenda extends javax.swing.JInternalFrame {
    DetalhesLivro detalhesLivro = null;
    private TelaPrincipal parent;
    Venda venda = new Venda();
    
    
        
    

    /**
     * Creates new form Venda
     */
    public ViewVenda(TelaPrincipal parent) {
        initComponents();
        this.parent = parent;
    
        

        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        buttonPesquisar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lCliente = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePesquisaCliente = new javax.swing.JTable();
        fCpf = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonAdd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        fQuantidade = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablePesquisa = new javax.swing.JTable();
        fTitulo = new javax.swing.JTextField();
        fEditora = new javax.swing.JTextField();
        comboGenero = new javax.swing.JComboBox<>();
        fAutor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        buttonPesquisarLivro = new javax.swing.JButton();
        pesquisaDetalhada = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        fValorTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        buttonConcluirVenda = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCarrinho = new javax.swing.JTable();
        buttonCancelarVenda = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jButton2.setText("Cadastrar Cliente");

        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });

        jLabel9.setText("Cliente Selecionado");

        lCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        tablePesquisaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Sobrenome", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePesquisaCliente.getColumnModel().getColumn(0).setMinWidth(0);         tablePesquisaCliente.getColumnModel().getColumn(0).setMaxWidth(0);         tablePesquisaCliente.getColumnModel().getColumn(0).setWidth(0);
        tablePesquisaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePesquisaClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablePesquisaCliente);

        try {
            fCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fCpfKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(fNome, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(fCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addGap(37, 37, 37))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonPesquisar)
                                .addGap(23, 23, 23))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(fCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        fNome.setTransferHandler(null);
        fCpf.setTransferHandler(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));

        jLabel4.setText("Titulo");

        jLabel5.setText("Editora");

        buttonAdd.setText("Adicionar Item");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        jLabel8.setText("  Quantidade");

        fQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fQuantidadeKeyTyped(evt);
            }
        });

        tablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Titulo", "Editora", "Autor", "Genero", "Edição", "Estoque", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePesquisa.setToolTipText("");
        tablePesquisa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePesquisa.getColumnModel().getColumn(0).setMinWidth(0);         tablePesquisa.getColumnModel().getColumn(0).setMaxWidth(0);         tablePesquisa.getColumnModel().getColumn(0).setWidth(0);
        tablePesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePesquisaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablePesquisaMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tablePesquisa);

        fTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTituloActionPerformed(evt);
            }
        });

        fEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fEditoraActionPerformed(evt);
            }
        });

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Drama", "Romance", "Aventura", "Sci-fi" }));
        comboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGeneroActionPerformed(evt);
            }
        });

        fAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fAutorActionPerformed(evt);
            }
        });

        jLabel10.setText("Autor");

        jLabel11.setText("Genero");

        buttonPesquisarLivro.setText("Pesquisar");
        buttonPesquisarLivro.setEnabled(false);
        buttonPesquisarLivro.setName(""); // NOI18N
        buttonPesquisarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarLivroActionPerformed(evt);
            }
        });

        pesquisaDetalhada.setText("Mais Detalhes");
        pesquisaDetalhada.setEnabled(false);
        pesquisaDetalhada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaDetalhadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(fAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(fTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(61, 61, 61))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pesquisaDetalhada)
                            .addComponent(buttonAdd))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(294, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(fEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonPesquisarLivro)))
                .addGap(166, 166, 166))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(fEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(fAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pesquisaDetalhada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(buttonAdd))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(buttonPesquisarLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        fQuantidade.setTransferHandler(null);
        fTitulo.setTransferHandler(null);
        fEditora.setTransferHandler(null);
        fAutor.setTransferHandler(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrinho"));

        fValorTotal.setEditable(false);
        fValorTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Valor Total");

        buttonConcluirVenda.setText("Concluir Venda");
        buttonConcluirVenda.setEnabled(false);
        buttonConcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConcluirVendaActionPerformed(evt);
            }
        });

        tableCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Título", "Autor", "Editora", "ISBN", "Quantidade", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCarrinho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableCarrinho.getColumnModel().getColumn(0).setMinWidth(0);         tableCarrinho.getColumnModel().getColumn(0).setMaxWidth(0);         tableCarrinho.getColumnModel().getColumn(0).setWidth(0);
        jScrollPane3.setViewportView(tableCarrinho);

        buttonCancelarVenda.setText("Cancelar Venda");
        buttonCancelarVenda.setEnabled(false);
        buttonCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(buttonCancelarVenda)
                .addGap(88, 88, 88)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(fValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonConcluirVenda)
                .addGap(24, 24, 24))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(buttonConcluirVenda)
                    .addComponent(buttonCancelarVenda)))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("         Vendas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public List<Cliente> pesquisaCliente;
    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
        pesquisaCliente = null;

        DefaultTableModel model = (DefaultTableModel) tablePesquisaCliente.getModel();
        model.setRowCount(0);

        pesquisaCliente = MockCliente.procurarCliente(fNome.getText(), ""
            , fCpf.getText());

        if(pesquisaCliente == null){
            JOptionPane.showMessageDialog(this, "Preencha ao menos um campo de pesquisa");
        } else {
            for(int i = 0; i < pesquisaCliente.size(); i++){
                Cliente cliente = pesquisaCliente.get(i);
                if(cliente != null){
                    Object[] row = new Object[4];
                    row[0] = cliente.getId();
                    row[1] = cliente.getNome();
                    row[2] = cliente.getSobrenome();
                    row[3] = cliente.getCpf();
                    
                    model.addRow(row);
                }
            }
        }
    }//GEN-LAST:event_buttonPesquisarActionPerformed

    private void tablePesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePesquisaMouseClicked
        pesquisaDetalhada.setEnabled(true);
        
    }//GEN-LAST:event_tablePesquisaMouseClicked

    private void tablePesquisaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePesquisaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablePesquisaMouseReleased

    private void fTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTituloActionPerformed

    private void fEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fEditoraActionPerformed

    }//GEN-LAST:event_fEditoraActionPerformed

    private void comboGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboGeneroActionPerformed

    private void fAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fAutorActionPerformed

    
    public List<Livro> pesquisaLivro = new ArrayList();
    
    private void buttonPesquisarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarLivroActionPerformed
        pesquisaLivro = null;

        DefaultTableModel model = (DefaultTableModel) tablePesquisa.getModel();
        model.setRowCount(0);

        pesquisaLivro = MockLivro.procurarLivro(fTitulo.getText(), fAutor.getText()
            , fEditora.getText(),comboGenero.getSelectedItem().toString());

        if(pesquisaLivro == null){
            JOptionPane.showMessageDialog(this, "Preencha ao menos um campo de pesquisa");
        } else {
            for(int i = 0; i < pesquisaLivro.size(); i++){
                Livro liv = pesquisaLivro.get(i);
                if(liv != null){
                    Object[] row = new Object[8];
                    row[0] = liv.getId();
                    row[1] = liv.getTitulo();
                    row[2] = liv.getEditora();
                    row[3] = liv.getAutor();
                    row[4] = liv.getGenero();
                    row[5] = liv.getEdicao();
                    row[6] = liv.getEstoque();
                    row[7] = liv.getValor() + 0.00;
                    model.addRow(row);
                }
            }
        }
        pesquisaDetalhada.setEnabled(false);
    }//GEN-LAST:event_buttonPesquisarLivroActionPerformed

    private void tablePesquisaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePesquisaClienteMouseClicked
        venda.setCliente(listaCliente.get(Integer.parseInt(tablePesquisaCliente.getValueAt
        (tablePesquisaCliente.getSelectedRow(), 0).toString())));
        
        lCliente.setText(venda.getCliente().getNome()
        + (" ") + venda.getCliente().getSobrenome());
        DefaultTableModel model = (DefaultTableModel) tablePesquisaCliente.getModel();
        for(int i = 0; i < model.getRowCount(); i++){
            if(i != tablePesquisaCliente.getSelectedRow()){
                model.removeRow(i);
            }
        }
        buttonPesquisarLivro.setEnabled(true);
        
    }//GEN-LAST:event_tablePesquisaClienteMouseClicked

    private void pesquisaDetalhadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaDetalhadaActionPerformed
        try{
            int id = pesquisaLivro.get(tablePesquisa.getSelectedRow()).getId();
            if(id >= 0){
                for(Livro livro : MockLivro.listaLivro){
                    if(id == livro.getId()){
                        parent.abrirTelaDetalhesLivro(id);
                        DefaultTableModel model = (DefaultTableModel) tablePesquisa.getModel();
                        model.setRowCount(0);
                        pesquisaDetalhada.setEnabled(false);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione 1 item para exibir detalhes");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),"Erro", 
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_pesquisaDetalhadaActionPerformed

    private void fCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fCpfKeyTyped
        Character ch = evt.getKeyChar();
        String permitidos = "0123456789";
        if(!permitidos.contains(ch.toString())){
            evt.consume();
        }

        if(fCpf.getText().length() == 11){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Maximo 11 Numeros");
        }
    }//GEN-LAST:event_fCpfKeyTyped

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        if(tablePesquisa.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(rootPane, "Selecione Um livro");
            
        } else if(fQuantidade.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Selecione uma quantidade");
            
        } else if(Integer.parseInt(tablePesquisa.getValueAt(tablePesquisa.getSelectedRow(), 6).toString()) < Integer.parseInt(fQuantidade.getText())){
            JOptionPane.showMessageDialog(rootPane, "Quantidade solicitada acima do estoque atual");
            
        } else {
            ItemVenda item = new ItemVenda();
            
            for(Livro livro : listaLivro){
                if(Integer.parseInt(tablePesquisa.getValueAt(tablePesquisa.getSelectedRow(),0).toString()) == livro.getId()){
                    item.setLivro(livro);
                    item.setQuantidade(Integer.parseInt(fQuantidade.getText()));
                    item.setValorUnitario(Float.parseFloat(tablePesquisa.getValueAt(tablePesquisa.getSelectedRow(),7).toString()));
                    break;
                }
            }
            
            
            try{
                ServiceItemVenda.inserirItemVenda(item , venda);
            } catch (Exception e){
                JOptionPane.showMessageDialog(rootPane, e.getMessage(),"Erro", 
                JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if(item.getLivro() != null){
                DefaultTableModel model = (DefaultTableModel) tableCarrinho.getModel();
                model.setRowCount(0);
                for(int i = 0; i < venda.getListaItemVenda().size(); i++){
                    Livro liv = venda.getListaItemVenda().get(i).getLivro();
                    if(liv != null){
                        Object[] row = new Object[7];
                        row[0] = liv.getId();
                        row[1] = liv.getTitulo();
                        row[2] = liv.getEditora();
                        row[3] = liv.getAutor();
                        row[4] = liv.getIsbn();
                        row[5] = venda.getListaItemVenda().get(i).getQuantidade();
                        row[6] = liv.getValor() * venda.getListaItemVenda().get(i).getQuantidade()+ 0.00;
                        model.addRow(row);
                    }
                }
            }
            
            Double valorTotal = 0.00;
            for(ItemVenda itemVenda : venda.getListaItemVenda()){
                valorTotal = valorTotal + itemVenda.getLivro().getValor() * itemVenda.getQuantidade() + 0.00;
            }
            fValorTotal.setText(valorTotal.toString());
            buttonConcluirVenda.setEnabled(true);
            buttonCancelarVenda.setEnabled(true);
        }
    }//GEN-LAST:event_buttonAddActionPerformed

    private void fQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fQuantidadeKeyTyped
        Character ch = evt.getKeyChar();
        String permitidos = "0123456789";
        if(!permitidos.contains(ch.toString())){
            evt.consume();
        }

        if(fQuantidade.getText().length() == 3){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Maximo 3 Digitos");
        }
    }//GEN-LAST:event_fQuantidadeKeyTyped

    private void buttonConcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConcluirVendaActionPerformed
        venda.setValor(Double.parseDouble(fValorTotal.getText()));
        venda.setData(new Date());
        
        try{
            if(JOptionPane.showConfirmDialog(parent, "Dedeja concluir a venda") == 0);
                ServiceVenda.inserirVenda(venda);
                this.dispose();
        } catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),"Erro", 
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonConcluirVendaActionPerformed

    private void buttonCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarVendaActionPerformed
        if(JOptionPane.showConfirmDialog(parent, "Deseja cancelar a venda") == 0){
            this.dispose();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelarVendaActionPerformed
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancelarVenda;
    private javax.swing.JButton buttonConcluirVenda;
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JButton buttonPesquisarLivro;
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JTextField fAutor;
    private javax.swing.JFormattedTextField fCpf;
    private javax.swing.JTextField fEditora;
    private javax.swing.JTextField fNome;
    private javax.swing.JTextField fQuantidade;
    private javax.swing.JTextField fTitulo;
    private javax.swing.JTextField fValorTotal;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lCliente;
    private javax.swing.JButton pesquisaDetalhada;
    private javax.swing.JTable tableCarrinho;
    private javax.swing.JTable tablePesquisa;
    private javax.swing.JTable tablePesquisaCliente;
    // End of variables declaration//GEN-END:variables
}
