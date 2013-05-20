/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.presentation;

import edu.esprit.dao.JoueurDAO;
import edu.esprit.dao.EquipeDAO;
import edu.esprit.entite.Joueur;
import edu.esprit.entite.Equipe;
import static edu.esprit.presentation.AjouterEquipe.e;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Wael Mallek
 */
public class AjouterJoueur extends javax.swing.JFrame {
static Joueur j=null;
    EquipeDAO equipeDAO = new EquipeDAO();
    ArrayList<Equipe> equipes = equipeDAO.readAllEquipes();
    JFileChooser fc;
    static private final String newline = "\n";

    /**
     * Creates new form AjouterJoueur
     */
    public AjouterJoueur() {
        initComponents();
    }
    public AjouterJoueur(Joueur j) {
        initComponents();
        this.j=j;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nom_Field = new javax.swing.JTextField();
        prenom_Field = new javax.swing.JTextField();
        Equipe_box = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        Num_box = new javax.swing.JComboBox();
        Saison_filed = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        validericon = new javax.swing.JLabel();
        Modifiericon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 700));
        setPreferredSize(new java.awt.Dimension(1366, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nom:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 70, 60, 14);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Prénom:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(510, 110, 60, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Equipe :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(510, 190, 40, 14);
        getContentPane().add(nom_Field);
        nom_Field.setBounds(586, 60, 170, 30);
        getContentPane().add(prenom_Field);
        prenom_Field.setBounds(586, 100, 170, 30);

        Equipe_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Equipe_boxActionPerformed(evt);
            }
        });
        getContentPane().add(Equipe_box);
        Equipe_box.setBounds(590, 190, 160, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(510, 150, 70, 14);

        Num_box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" }));
        getContentPane().add(Num_box);
        Num_box.setBounds(586, 140, 170, 30);
        getContentPane().add(Saison_filed);
        Saison_filed.setBounds(586, 230, 170, 30);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Saison :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(500, 240, 50, 14);

        validericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nav/valider.png"))); // NOI18N
        validericon.setText("jLabel11");
        validericon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validericonMouseClicked(evt);
            }
        });
        getContentPane().add(validericon);
        validericon.setBounds(560, 410, 160, 50);

        Modifiericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nav/modifier.png"))); // NOI18N
        Modifiericon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModifiericonMouseClicked(evt);
            }
        });
        getContentPane().add(Modifiericon);
        Modifiericon.setBounds(560, 410, 160, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ajouterJOUEUR1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if (j!=null) {
            
            nom_Field.setText(j.getNom());
            prenom_Field.setText(j.getPrenom());
            Saison_filed.setText(j.getSaison());
            
            validericon.setVisible(false);
            Modifiericon.setVisible(true);
        }else
        {
            validericon.setVisible(true);
            Modifiericon.setVisible(false);
        }
        for (int i = 0; i < equipes.size(); i++) {
            Equipe_box.addItem(equipes.get(i).getNom());
        }
    }//GEN-LAST:event_formWindowOpened

    private void Equipe_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Equipe_boxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Equipe_boxActionPerformed

    private void validericonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validericonMouseClicked
        // TODO add your handling code here:
        Equipe equipe = equipes.get(Equipe_box.getSelectedIndex()); //Récuperer l'equipe séléctionnée à partir du ComboBox 
        Joueur joueur = new Joueur(equipe.getId(), Num_box.getSelectedIndex(), nom_Field.getText(), prenom_Field.getText(), Saison_filed.getText());
        JoueurDAO employeDAO = new JoueurDAO();
        if(employeDAO.addJoueur(joueur) != 0){
            JOptionPane.showMessageDialog(this, "Ajout effectué avec succès !");
            this.setVisible(false);
        }
    }//GEN-LAST:event_validericonMouseClicked

    private void ModifiericonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifiericonMouseClicked
        // TODO add your handling code here:
         Equipe equipe = equipes.get(Equipe_box.getSelectedIndex()); //Récuperer l'equipe séléctionnée à partir du ComboBox 
        Joueur joueur = new Joueur(j.getId(),equipe.getId(), Num_box.getSelectedIndex(), nom_Field.getText(), prenom_Field.getText(), Saison_filed.getText());
        JoueurDAO employeDAO = new JoueurDAO();
        if(employeDAO.updateJoueur(joueur)){
            JOptionPane.showMessageDialog(this, "Modifier effectué avec succès !");
        }
    }//GEN-LAST:event_ModifiericonMouseClicked

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
            java.util.logging.Logger.getLogger(AjouterJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterJoueur().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Equipe_box;
    private javax.swing.JLabel Modifiericon;
    private javax.swing.JComboBox Num_box;
    private javax.swing.JTextField Saison_filed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nom_Field;
    private javax.swing.JTextField prenom_Field;
    private javax.swing.JLabel validericon;
    // End of variables declaration//GEN-END:variables
}
