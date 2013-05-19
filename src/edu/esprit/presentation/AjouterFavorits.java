/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.presentation;

import edu.esprit.dao.FavoritsDAO;
import edu.esprit.dao.FavoritsDAO;
import edu.esprit.entite.Favorits;
import edu.esprit.entite.Favorits;
import static edu.esprit.presentation.AjouterFavorits.e;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Wael Mallek
 */
public class AjouterFavorits extends javax.swing.JFrame {
    static Favorits e=null;
    FavoritsDAO equipeDAO = new FavoritsDAO();
    ArrayList<Favorits> equipes = equipeDAO.readAllFavoritss();
    /**
     * Creates new form AjouterFavorits
     */
    public AjouterFavorits() {
        initComponents();
    }
    public AjouterFavorits(Favorits e) {
        initComponents();
        this.e=e;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id_Utilisateur_Field = new javax.swing.JTextField();
        id_equipe = new javax.swing.JComboBox();
        valider_button = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Ajouter Favorite :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 86, 14);

        jLabel2.setText("Id uilisateur:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(36, 64, 60, 14);

        jLabel4.setText("Equipe :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(57, 102, 39, 14);
        getContentPane().add(id_Utilisateur_Field);
        id_Utilisateur_Field.setBounds(106, 61, 206, 20);

        id_equipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_equipeActionPerformed(evt);
            }
        });
        getContentPane().add(id_equipe);
        id_equipe.setBounds(106, 99, 206, 20);

        valider_button.setText("Valider");
        valider_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valider_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(valider_button);
        valider_button.setBounds(247, 227, 65, 23);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Retour.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 268, 121, 37);

        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });
        getContentPane().add(btnModifier);
        btnModifier.setBounds(166, 227, 71, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       this.setVisible(false);
       
        new DashboardAdmin().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if(e.getId()==0)
            {
                id_Utilisateur_Field.setText(Integer.toString(e.getId_User()));
            
            valider_button.setVisible(true);
            btnModifier.setVisible(false);
            }else
        if (e!=null) {
            id_Utilisateur_Field.setText(Integer.toString(e.getId_User()));
            
            valider_button.setVisible(false);
            btnModifier.setVisible(true);
        }else
            
        {
            valider_button.setVisible(true);
            btnModifier.setVisible(false);
            
        }
        for (int i = 0; i < equipes.size(); i++) {
            id_equipe.addItem(equipes.get(i).getId());
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void id_equipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_equipeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_id_equipeActionPerformed

    private void valider_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valider_buttonActionPerformed
        // TODO add your handling code here:
        Favorits equipe = equipes.get(id_equipe.getSelectedIndex()); //Récuperer l'equipe séléctionnée à partir du ComboBox 
        Favorits favorits = new Favorits(Integer.parseInt(id_Utilisateur_Field.getText()), equipe.getId());
        FavoritsDAO favoritsDAO = new FavoritsDAO();
        if(favoritsDAO.addFavorits(favorits) != 0){
            JOptionPane.showMessageDialog(this, "Ajout effectué avec succès !");
        }
    }//GEN-LAST:event_valider_buttonActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        // TODO add your handling code here:
        Favorits equipe = new Favorits(e.getId(), e.getId_User(), e.getId_equipe());
        FavoritsDAO employeDAO = new FavoritsDAO();
        if(employeDAO.updateFavorits(equipe)){
            JOptionPane.showMessageDialog(this, "Modification effectué avec succès !");
            this.setVisible(false);
            new AfficherFavorits().setVisible(true);
        }
    }//GEN-LAST:event_btnModifierActionPerformed

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
            java.util.logging.Logger.getLogger(AjouterFavorits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterFavorits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterFavorits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterFavorits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterFavorits().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModifier;
    private javax.swing.JTextField id_Utilisateur_Field;
    private javax.swing.JComboBox id_equipe;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton valider_button;
    // End of variables declaration//GEN-END:variables
}
