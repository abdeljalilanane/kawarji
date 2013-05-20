/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.presentation;

import edu.esprit.dao.FavoritsDAO;
import edu.esprit.entite.Favorits;

import javax.swing.JOptionPane;

/**
 *
 * @author Wael Mallek
 */
public class AfficherFavorits extends javax.swing.JFrame {

    static Favorits e;
    /**
     * Creates new form AfficherEmployeFavorits
     */
    public AfficherFavorits() {
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ListeFavorits = new javax.swing.JTable();
        Retouricon = new javax.swing.JLabel();
        Modifiericon = new javax.swing.JLabel();
        supprimericon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        ListeFavorits.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ListeFavorits.setModel(new edu.esprit.presentation.FavoritsTableModel());
        ListeFavorits.setSelectionBackground(new java.awt.Color(51, 255, 51));
        jScrollPane1.setViewportView(ListeFavorits);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 171, 1300, 360);

        Retouricon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nav/precident.png"))); // NOI18N
        Retouricon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetouriconMouseClicked(evt);
            }
        });
        getContentPane().add(Retouricon);
        Retouricon.setBounds(10, 580, 160, 45);

        Modifiericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nav/modifier.png"))); // NOI18N
        Modifiericon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModifiericonMouseClicked(evt);
            }
        });
        getContentPane().add(Modifiericon);
        Modifiericon.setBounds(1010, 580, 160, 50);

        supprimericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nav/supprimer.png"))); // NOI18N
        supprimericon.setText("jLabel11");
        supprimericon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supprimericonMouseClicked(evt);
            }
        });
        getContentPane().add(supprimericon);
        supprimericon.setBounds(1180, 580, 160, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/listefavorit.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1350, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       // entreprise_name.setText(e.getLibelle_entreprise());
    }//GEN-LAST:event_formWindowOpened

    private void RetouriconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetouriconMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_RetouriconMouseClicked

    private void ModifiericonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifiericonMouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(ListeFavorits.getValueAt(ListeFavorits.getSelectedRow(),0).toString());
        int idUtilisateur = Integer.parseInt(ListeFavorits.getValueAt(ListeFavorits.getSelectedRow(),1).toString());
        int idequipe = Integer.parseInt(ListeFavorits.getValueAt(ListeFavorits.getSelectedRow(),2).toString());
        Favorits fav=new Favorits(id,idUtilisateur,idequipe);
        this.setVisible(false);
        new AjouterFavorits(fav).setVisible(true);
    }//GEN-LAST:event_ModifiericonMouseClicked

    private void supprimericonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimericonMouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(ListeFavorits.getValueAt(ListeFavorits.getSelectedRow(),0).toString());
        int idUtilisateur = Integer.parseInt(ListeFavorits.getValueAt(ListeFavorits.getSelectedRow(),1).toString());
        int idequipe = Integer.parseInt(ListeFavorits.getValueAt(ListeFavorits.getSelectedRow(),2).toString());
        Favorits equipe=new Favorits(id, idUtilisateur,idequipe);
        FavoritsDAO employeDAO = new FavoritsDAO();
        
        if(employeDAO.deleteFavorits(equipe)){
            JOptionPane.showMessageDialog(this, "Supprission effectué avec succès !");
            ListeFavorits.setModel(new edu.esprit.presentation.FavoritsTableModel());

        }
    }//GEN-LAST:event_supprimericonMouseClicked

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
            java.util.logging.Logger.getLogger(AfficherFavorits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AfficherFavorits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AfficherFavorits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AfficherFavorits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfficherFavorits().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListeFavorits;
    private javax.swing.JLabel Modifiericon;
    private javax.swing.JLabel Retouricon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel supprimericon;
    // End of variables declaration//GEN-END:variables
}
