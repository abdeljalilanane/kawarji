/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.presentation;

import edu.esprit.dao.JoueurDAO;
import edu.esprit.entite.Joueur;
import java.util.ArrayList;

/**
 *
 * @author Jaloul1
 */
public class tachkila extends javax.swing.JFrame {

    /**
     * Creates new form tachkila
     */
    public tachkila() {
        initComponents();
        
    }

    tachkila(int id_equipe) {
        initComponents();
        ArrayList<Joueur> equipe;
    JoueurDAO eDAO = new JoueurDAO();
        System.out.println(id_equipe);
    equipe=eDAO.readAllJoueursParEquipe(id_equipe);
    if(id_equipe==2)
    {
        fond.setVisible(false);
    jLabel1.setText(equipe.get(0).getPrenom()); 
    jLabel2.setText(equipe.get(1).getPrenom());
    jLabel3.setText(equipe.get(2).getPrenom()); 
    jLabel4.setText(equipe.get(3).getPrenom());
    jLabel5.setText(equipe.get(4).getPrenom()); 
    jLabel6.setText(equipe.get(5).getPrenom());
    jLabel7.setText(equipe.get(6).getPrenom()); 
    jLabel8.setText(equipe.get(7).getPrenom());
    jLabel9.setText(equipe.get(8).getPrenom());
    jLabel12.setText(equipe.get(9).getPrenom()); 
    jLabel11.setText(equipe.get(10).getPrenom());
    jLabel10.setVisible(false);
    }
    else
        if(id_equipe==1)
        {
            fond1.setVisible(false);
    jLabel1.setText(equipe.get(0).getPrenom()); 
    jLabel2.setText(equipe.get(1).getPrenom());
    jLabel3.setText(equipe.get(2).getPrenom()); 
    jLabel4.setText(equipe.get(3).getPrenom());
    jLabel5.setText(equipe.get(4).getPrenom()); 
    jLabel6.setText(equipe.get(5).getPrenom());
    jLabel7.setText(equipe.get(6).getPrenom()); 
    jLabel8.setText(equipe.get(7).getPrenom());
    jLabel9.setText(equipe.get(8).getPrenom());
    jLabel10.setText(equipe.get(9).getPrenom()); 
    jLabel11.setText(equipe.get(10).getPrenom());
    jLabel12.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fond = new javax.swing.JLabel();
        fond1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 700));
        setMinimumSize(new java.awt.Dimension(1366, 700));
        getContentPane().setLayout(null);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Retour2.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(1240, 30, 40, 40);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 280, 70, 14);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 60, 80, 14);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 240, 90, 14);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(390, 420, 80, 14);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 550, 80, 14);

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(660, 120, 80, 14);

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(660, 270, 80, 14);

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(670, 490, 80, 14);

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(670, 560, 80, 14);

        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(900, 200, 80, 14);

        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(900, 380, 80, 14);

        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(1120, 390, 90, 14);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/442.png"))); // NOI18N
        fond.setText("jLabel1");
        fond.setMaximumSize(new java.awt.Dimension(1366, 700));
        fond.setMinimumSize(new java.awt.Dimension(1366, 700));
        fond.setPreferredSize(new java.awt.Dimension(1366, 700));
        getContentPane().add(fond);
        fond.setBounds(0, 0, 1350, 690);

        fond1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/4411.png"))); // NOI18N
        fond1.setText("jLabel1");
        getContentPane().add(fond1);
        fond1.setBounds(0, 0, 1350, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jLabel13MouseClicked

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
            java.util.logging.Logger.getLogger(tachkila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tachkila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tachkila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tachkila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tachkila().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fond;
    private javax.swing.JLabel fond1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
