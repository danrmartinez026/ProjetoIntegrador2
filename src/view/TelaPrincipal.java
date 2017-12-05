/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Graphics;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;
import dao.DaoVenda;
import models.Cliente;
import models.ItemVenda;
import models.Livro;

/**
 *
 * @author Dan
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    CadastroCliente cadCliente = null;
    PesquisaCliente pesquisarCliente = null;
    CadastroLivro cadLivro = null;
    DetalhesCliente detalhesCliente = null;
    DetalhesLivro detalhesLivro = null;
    PesquisaLivro pesquisarLivro = null;
    Relatorio relatorio = null;
    ViewVenda venda = null;
    DetalhesRelatorio detalhesRelatorio = null;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/livraria_lello.jpg"));
        Image image = icon.getImage();
        deskPane = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCadastroCliente = new javax.swing.JMenuItem();
        menuPesquisarCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuCadastrarProduto = new javax.swing.JMenuItem();
        menuPesquisarProduto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuVenda = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1000, 826));
        setMinimumSize(new java.awt.Dimension(1000, 826));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 800));

        deskPane.setBackground(new java.awt.Color(255, 255, 204));
        deskPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deskPane.setRequestFocusEnabled(false);

        javax.swing.GroupLayout deskPaneLayout = new javax.swing.GroupLayout(deskPane);
        deskPane.setLayout(deskPaneLayout);
        deskPaneLayout.setHorizontalGroup(
            deskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        deskPaneLayout.setVerticalGroup(
            deskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/group.png"))); // NOI18N
        jMenu1.setText("Cliente");

        menuCadastroCliente.setText("Cadastrar");
        menuCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroClienteActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadastroCliente);

        menuPesquisarCliente.setText("Pesquisar");
        menuPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesquisarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(menuPesquisarCliente);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/livro.png"))); // NOI18N
        jMenu2.setText("Produto");

        menuCadastrarProduto.setText("Cadastrar");
        menuCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(menuCadastrarProduto);

        menuPesquisarProduto.setText("Pesquisar");
        menuPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesquisarProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(menuPesquisarProduto);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/venda1.png"))); // NOI18N
        jMenu3.setText("Vendas");

        menuVenda.setText("Efetuar Venda");
        menuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVendaActionPerformed(evt);
            }
        });
        jMenu3.add(menuVenda);

        menuRelatorio.setText("Relatório");
        menuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioActionPerformed(evt);
            }
        });
        jMenu3.add(menuRelatorio);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    
    public void abrirTelaCadastroCliente(){
        if(cadCliente == null || !cadCliente.isDisplayable()&& !cadCliente.isVisible()){
            cadCliente = new CadastroCliente();
            deskPane.add(cadCliente);
            this.openFrameInCenter(cadCliente);
        }
        cadCliente.getDesktopPane().getDesktopManager().deiconifyFrame(cadCliente);
        cadCliente.toFront();
    }
    
    public void abrirTelaDetalhesCliente(Cliente cliente){
        if(detalhesCliente == null || !detalhesCliente.isDisplayable() && 
                !detalhesCliente.isVisible()){
            detalhesCliente = new DetalhesCliente();
            deskPane.add(detalhesCliente);
            
            this.openFrameInCenter(detalhesCliente);
            detalhesCliente.fNome.setText(cliente.getNome());
            detalhesCliente.fSobrenome.setText(cliente.getSobrenome());
            detalhesCliente.fCpf.setText(cliente.getCpf());
            detalhesCliente.fCpf.setEditable(false);
            detalhesCliente.fRg.setText(cliente.getRg());
            detalhesCliente.fRg.setEditable(false);
            detalhesCliente.comboSexo.setSelectedItem(cliente.getSexo());
            detalhesCliente.fRua.setText(cliente.getRua());
            detalhesCliente.fBairro.setText(cliente.getBairro());
            detalhesCliente.fNumero.setText(cliente.getNumeroCasa());
            detalhesCliente.fComplemento.setText(cliente.getComplemento());
            detalhesCliente.fCidade.setText(cliente.getCidade());
            detalhesCliente.comboEstado.setSelectedItem(cliente.getEstado());
            detalhesCliente.fEmail.setText(cliente.getEmail());
            detalhesCliente.fCelular.setText(cliente.getCelular());
            detalhesCliente.fTelefone.setText(cliente.getTelefone());
            detalhesCliente.fCep.setText(cliente.getCep());
            detalhesCliente.setCliente(cliente);
        }
    }
    
    public void abrirTelaDetalhesLivro(Livro livro){
        if(detalhesLivro == null || !detalhesLivro.isDisplayable()&& !detalhesLivro.isVisible()){
            detalhesLivro = new DetalhesLivro();
            deskPane.add(detalhesLivro);
            this.openFrameInCenter(detalhesLivro);
            detalhesLivro.fEstoque.setText(livro.getEstoque().toString());
            detalhesLivro.fValor.setText(livro.getValor().toString());
            detalhesLivro.fTitulo.setText(livro.getTitulo());
            detalhesLivro.fAutor.setText(livro.getAutor());
            detalhesLivro.fEditora.setText(livro.getEditora());
            detalhesLivro.fEdicao.setText(livro.getEdicao());
            detalhesLivro.fIsbn.setText(livro.getIsbn());
            detalhesLivro.fAltura.setText(livro.getAltura());
            detalhesLivro.fPeso.setText(livro.getPeso());
            detalhesLivro.fLargura.setText(livro.getLargura());
            detalhesLivro.fNumeroPaginas.setText(livro.getNumeroPaginas().toString());
            detalhesLivro.comboIdioma.setSelectedItem(livro.getIdioma());
            detalhesLivro.comboGenero.setSelectedItem(livro.getGenero());
            detalhesLivro.fNumeroPaginas.setText(livro.getNumeroPaginas().toString() + (""));
            detalhesLivro.setLivro(livro);
        }
        detalhesLivro.getDesktopPane().getDesktopManager().deiconifyFrame(detalhesLivro);
        detalhesLivro.toFront();
    }
    
    public void attachWindow(JInternalFrame jif){
         if(jif == null || !jif.isDisplayable()&& !jif.isVisible()){
            //cadCliente = new CadastroCliente();
            this.deskPane.add(jif);
            this.openFrameInCenter(jif);
        }
        jif.getDesktopPane().getDesktopManager().deiconifyFrame(jif);
        jif.toFront();
    }
    
            
            
    private void menuCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroClienteActionPerformed
        abrirTelaCadastroCliente();
    }//GEN-LAST:event_menuCadastroClienteActionPerformed

    private void menuPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesquisarClienteActionPerformed
        if(pesquisarCliente == null || !pesquisarCliente.isDisplayable() && !pesquisarCliente.isVisible()){
            pesquisarCliente = new PesquisaCliente(this);
            deskPane.add(pesquisarCliente);
            this.openFrameInCenter(pesquisarCliente);
        }
        pesquisarCliente.getDesktopPane().getDesktopManager().deiconifyFrame(pesquisarCliente);
        pesquisarCliente.toFront();
    }//GEN-LAST:event_menuPesquisarClienteActionPerformed

    private void menuCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarProdutoActionPerformed
        if(cadLivro == null || !cadLivro.isDisplayable() && !cadLivro.isVisible()){
            cadLivro = new CadastroLivro();
            deskPane.add(cadLivro);
            this.openFrameInCenter(cadLivro);
        }
        cadLivro.getDesktopPane().getDesktopManager().deiconifyFrame(cadLivro);
        cadLivro.toFront();
    }//GEN-LAST:event_menuCadastrarProdutoActionPerformed

    private void menuPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesquisarProdutoActionPerformed
        if(pesquisarLivro == null || !pesquisarLivro.isDisplayable() && !pesquisarLivro.isVisible()){
            pesquisarLivro = new PesquisaLivro(this);
            deskPane.add(pesquisarLivro);
            this.openFrameInCenter(pesquisarLivro);
        }
        pesquisarLivro.getDesktopPane().getDesktopManager().deiconifyFrame(pesquisarLivro);
        pesquisarLivro.toFront();
    }//GEN-LAST:event_menuPesquisarProdutoActionPerformed

    private void menuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVendaActionPerformed
        if(venda == null || !venda.isDisplayable() && !venda.isVisible()){
            venda = new ViewVenda(this);
            deskPane.add(venda);
            this.openFrameInCenter(venda);
           
        }
        venda.getDesktopPane().getDesktopManager().deiconifyFrame(venda);
        venda.toFront();
    }//GEN-LAST:event_menuVendaActionPerformed

    private void menuRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioActionPerformed
        if(relatorio == null || !relatorio.isDisplayable() && !relatorio.isVisible()){
            relatorio = new Relatorio(this);
            deskPane.add(relatorio);
            this.openFrameInCenter(relatorio);
           
        }
        relatorio.getDesktopPane().getDesktopManager().deiconifyFrame(relatorio);
        relatorio.toFront();
    }//GEN-LAST:event_menuRelatorioActionPerformed

    
    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = deskPane.getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane deskPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuCadastrarProduto;
    private javax.swing.JMenuItem menuCadastroCliente;
    private javax.swing.JMenuItem menuPesquisarCliente;
    private javax.swing.JMenuItem menuPesquisarProduto;
    private javax.swing.JMenuItem menuRelatorio;
    private javax.swing.JMenuItem menuVenda;
    // End of variables declaration//GEN-END:variables
}
