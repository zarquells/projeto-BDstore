package telas;

import javax.swing.*;
import java.text.*;

public class TelaPrincipal extends javax.swing.JFrame {

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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario1 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MenuCadUser = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuAjuda = new javax.swing.JMenu();
        MenuAjudaSobre = new javax.swing.JMenuItem();
        MenuOpcoes = new javax.swing.JMenu();
        MenuOpSair = new javax.swing.JMenuItem();

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("jMenu7");

        jMenu8.setText("jMenu8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );

        jLabel1.setText("Bem-Vindo");

        lblUsuario1.setText("jLabel2");

        MenuCadastro.setText("Cadastro");
        MenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroActionPerformed(evt);
            }
        });

        MenuCadUser.setText("Usuários");
        MenuCadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadUserActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadUser);

        jMenuItem1.setText("Clientes");
        MenuCadastro.add(jMenuItem1);

        menu.add(MenuCadastro);

        MenuAjuda.setText("Ajuda");

        MenuAjudaSobre.setText("Sobre");
        MenuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAjudaSobreActionPerformed(evt);
            }
        });
        MenuAjuda.add(MenuAjudaSobre);

        menu.add(MenuAjuda);

        MenuOpcoes.setText("Opções");

        MenuOpSair.setText("Sair");
        MenuOpSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuOpSairActionPerformed(evt);
            }
        });
        MenuOpcoes.add(MenuOpSair);

        menu.add(MenuOpcoes);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblUsuario1))
                .addGap(0, 67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblUsuario1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuOpSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuOpSairActionPerformed
        // TODO add your handling code here:
        int sair =JOptionPane.showConfirmDialog(null, "Tem certeza"
                + "de que deseja sair", "Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_MenuOpSairActionPerformed

    private void MenuCadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadUserActionPerformed
    TelaUsuarios usuario = new TelaUsuarios();
    usuario.setVisible(true);
    desktop.add(usuario);
    }//GEN-LAST:event_MenuCadUserActionPerformed

    private void MenuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAjudaSobreActionPerformed
        // TODO add your handling code here:
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
        
    }//GEN-LAST:event_MenuAjudaSobreActionPerformed

    private void MenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCadastroActionPerformed

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
    private javax.swing.JMenu MenuAjuda;
    private javax.swing.JMenuItem MenuAjudaSobre;
    private javax.swing.JMenuItem MenuCadUser;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuOpSair;
    private javax.swing.JMenu MenuOpcoes;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JLabel lblUsuario1;
    private javax.swing.JMenuBar menu;
    // End of variables declaration//GEN-END:variables
}
