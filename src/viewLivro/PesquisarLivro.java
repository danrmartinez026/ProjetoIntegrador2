/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewLivro;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mockLivro.MockLivro;
import modelLivro.Livro;
import viewCliente.CadastroCliente;
import viewLivro.DetalhesLivro;
import viewTelaPrincipal.TelaPrincipal;


/**
 *
 * @author danilo.martinez
 */
public class PesquisarLivro extends javax.swing.JInternalFrame {
    private TelaPrincipal parent;

    /**
     * Creates new form PesquisarLivro
     */
    public PesquisarLivro(TelaPrincipal parent) {
        this.parent = parent;
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

        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fEditora = new javax.swing.JTextField();
        fEditora.setText(" ");
        jLabel5 = new javax.swing.JLabel();
        fAutor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fEdicao = new javax.swing.JTextField();
        fIsbn = new javax.swing.JTextField();
        buttonPesquisar = new javax.swing.JButton();
        comboGenero = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePesquisa = new javax.swing.JTable();
        pesquisaDetalhada = new javax.swing.JButton();

        jLabel3.setText("ID");

        jLabel9.setText("jLabel9");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Pesquisar Livro");

        jLabel2.setText("Título");

        fTitulo.setText(" ");
        fTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTituloActionPerformed(evt);
            }
        });

        jLabel4.setText("Editora");

        fEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fEditoraActionPerformed(evt);
            }
        });

        jLabel5.setText("Autor");

        fAutor.setText(" ");
        fAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fAutorActionPerformed(evt);
            }
        });

        jLabel6.setText("Genero");

        jLabel7.setText("Edição");

        jLabel8.setText("ISBN");

        fEdicao.setText("0");

        fIsbn.setText("0");

        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.setName(""); // NOI18N
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Drama", "Romance", "Aventura", "Sci-fi" }));
        comboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(fEditora)
                    .addComponent(fTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(comboGenero, 0, 118, Short.MAX_VALUE)
                    .addComponent(fEdicao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fIsbn, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(buttonPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fTitulo)
                    .addComponent(jLabel2)
                    .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fEdicao)
                    .addComponent(fEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fIsbn)
                    .addComponent(fAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(21, 21, 21)
                .addComponent(buttonPesquisar))
        );

        tablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Editora", "Autor", "Genero", "Edição", "ISBN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePesquisa.setToolTipText("");
        jScrollPane1.setViewportView(tablePesquisa);

        pesquisaDetalhada.setText("Pesquisa Detalhada");
        pesquisaDetalhada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaDetalhadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pesquisaDetalhada)
                .addGap(150, 150, 150))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pesquisaDetalhada)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public List<Livro> pesquisaLivro = new ArrayList();
    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
        pesquisaLivro = null;
        
        DefaultTableModel model = (DefaultTableModel) tablePesquisa.getModel();
        model.setRowCount(0);
        
        try{
        pesquisaLivro = MockLivro.procurarLivro(fTitulo.getText(), fAutor.getText()
                , fEditora.getText(),comboGenero.getSelectedItem().toString()
                ,Integer.parseInt(fIsbn.getText()),Integer.parseInt(fEdicao.getText()));
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Digite apenas numeros nos campos Edicao e ISBN");
        }
        MockLivro.filtrarPesquisa(pesquisaLivro);
     
        for(int i = 0; i < pesquisaLivro.size(); i++){
            Livro liv = pesquisaLivro.get(i);
            if(liv != null){
                Object[] row = new Object[7];
                row[0] = liv.getTitulo();
                row[1] = liv.getEditora();
                row[2] = liv.getAutor();
                row[3] = liv.getGenero();
                row[4] = liv.getEdicao();
                row[5] = liv.getIsbn();
                row[6] = liv.getId();
                model.addRow(row);
            }
        }
    }//GEN-LAST:event_buttonPesquisarActionPerformed

    private void comboGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboGeneroActionPerformed

    private void fEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fEditoraActionPerformed
        
    }//GEN-LAST:event_fEditoraActionPerformed

    private void fTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTituloActionPerformed
       



        // TODO add your handling code here:
    }//GEN-LAST:event_fTituloActionPerformed

    private void fAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fAutorActionPerformed

    private void pesquisaDetalhadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaDetalhadaActionPerformed
        try{
            int id = pesquisaLivro.get(tablePesquisa.getSelectedRow()).getId();
            for(Livro livro : MockLivro.listaLivro){
                if(id == livro.getId()){
                    parent.abrirTelaDetalhesLivro(id);
                }
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Selecione 1 item para pesquisa detalhada");
        }
    }//GEN-LAST:event_pesquisaDetalhadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JTextField fAutor;
    private javax.swing.JTextField fEdicao;
    private javax.swing.JTextField fEditora;
    private javax.swing.JTextField fIsbn;
    private javax.swing.JTextField fTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton pesquisaDetalhada;
    private javax.swing.JTable tablePesquisa;
    // End of variables declaration//GEN-END:variables
}
