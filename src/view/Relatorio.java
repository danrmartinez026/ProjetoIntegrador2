/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.DaoItemVenda;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import dao.DaoVenda;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.ItemVenda;
import models.Venda;

/**
 *
 * @author Dan
 */
public class Relatorio extends javax.swing.JInternalFrame {
    private TelaPrincipal parent;
    /**
     * Creates new form Relatorio
     */
    public Relatorio(TelaPrincipal parent) {
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

        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        buttonPesquisar = new javax.swing.JButton();
        fInicio = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        fFim = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRelatorio = new javax.swing.JTable();

        jLabel4.setText("jLabel4");

        jLabel7.setText("Até Mês");

        setClosable(true);
        setIconifiable(true);

        jLabel1.setText("RELATÓRIO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        jLabel6.setText("Data inicio");

        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });

        fInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        fInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fInicioKeyTyped(evt);
            }
        });

        jLabel8.setText("Data Fim");

        fFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        fFim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fFimKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(178, 178, 178))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(fInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(fFim, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(buttonPesquisar)
                .addContainerGap())
        );

        fInicio.setTransferHandler(null);
        fFim.setTransferHandler(null);

        tableRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Cliente", "Titulo do livro", "Edicao", "ISBN", "Quantidade", "Valor Unitario", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableRelatorio.setToolTipText("");
        tableRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRelatorioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableRelatorio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
       // faz um previa analise das datas informadas
       // afim de evitar erros com datas invalidas
       if(fInicio.getText().equals("") || fFim.getText().equals("")){
           return;
       }
        Calendar c = Calendar.getInstance();
        DefaultTableModel model = (DefaultTableModel) tableRelatorio.getModel();
        model.setRowCount(0);
        
        List<Venda> listaVenda = null;
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicio = null;
        Date dataFim = null;
        try {
            dataInicio = data.parse(fInicio.getText());
            dataFim = data.parse(fFim.getText());
        } catch (ParseException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        listaVenda = new ArrayList();
        
        long dt = ((dataFim.getTime() - dataInicio.getTime()) + 3600000) /86400000L ;
        
        try {
            if(!dataInicio.after(dataFim) && dt <= 31 ){
                listaVenda = DaoVenda.listar(dataInicio, dataFim);
            } else {
                JOptionPane.showMessageDialog(parent, "Valores de data invalidos");
                return;
            }
        } catch (Exception ex) {
             Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        if(listaVenda != null){
            double valorTotal = 0;
            for(Venda venda:listaVenda){
                double valorParcial = 0;
                Format year = new SimpleDateFormat("dd/MM/YYYY");
                    Object[] rowVenda = new Object[8];
                    StringBuilder s = new StringBuilder();
                    rowVenda[0] = year.format(venda.getData());
                    s.append(venda.getCliente().getNome());
                    s.append(" ");
                    s.append(venda.getCliente().getSobrenome());
                    rowVenda[1] = s.toString();
                try {
                    for(ItemVenda item: DaoItemVenda.itensVenda(venda.getIdVenda())){
                        rowVenda[2] = item.getLivro().getTitulo();
                        rowVenda[3] = item.getLivro().getEdicao();
                        rowVenda[4] = item.getLivro().getIsbn();
                        rowVenda[5] = item.getQuantidade();
                        rowVenda[6] = item.getValorUnitario();
                        valorTotal += item.getValorUnitario() * Float.parseFloat(item.getQuantidade().toString());
                        valorParcial += item.getValorUnitario() * Float.parseFloat(item.getQuantidade().toString());
                        model.addRow(rowVenda);
                        rowVenda[0] = "";
                        rowVenda[1] = "";
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
                }
                Object[] valorCompra = new Object[8];
                valorCompra[0] = "Valor da Compra";
                valorCompra[7] = valorParcial;
                model.addRow(valorCompra);
                
                Object[] linhaBranca = new Object[8];
                linhaBranca[0] = "";
                model.addRow(linhaBranca);
            }
            Object[] valorTotalVenda = new Object[8];
                valorTotalVenda[0] = "Valor Total";
                valorTotalVenda[7] = valorTotal;
                model.addRow(valorTotalVenda);
        } else {
            JOptionPane.showMessageDialog(parent, "Nenhum resultado obtido");
        }
    }//GEN-LAST:event_buttonPesquisarActionPerformed

    private void tableRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRelatorioMouseClicked
        //buttonDetalhes.setEnabled(true);
    }//GEN-LAST:event_tableRelatorioMouseClicked

    private void fInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fInicioKeyTyped
        Character ch = evt.getKeyChar();
        String permitidos = "0123456789/";
        if(!permitidos.contains(ch.toString())){
            evt.consume();
        }
        
        if(fInicio.getText().length() == 10){
            evt.consume();
        }
    }//GEN-LAST:event_fInicioKeyTyped

    private void fFimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fFimKeyTyped
        Character ch = evt.getKeyChar();
        String permitidos = "0123456789/";
        if(!permitidos.contains(ch.toString())){
            evt.consume();
        }
        
        if(fFim.getText().length() == 10){
            evt.consume();
        }
    }//GEN-LAST:event_fFimKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JFormattedTextField fFim;
    private javax.swing.JFormattedTextField fInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tableRelatorio;
    // End of variables declaration//GEN-END:variables
}
