/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.presentation;

import edu.esprit.dao.ButDAO;
import edu.esprit.dao.EquipeDAO;
import edu.esprit.dao.JoueurDAO;
import edu.esprit.dao.MatchDAO;
import edu.esprit.entite.But;
import edu.esprit.entite.Equipe;
import edu.esprit.entite.Joueur;
import edu.esprit.entite.Match;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;

/**
 *
 * @author Jaloul1
 */
public class AjouterResultat extends javax.swing.JFrame {

    /**
     * Creates new form AjouterResultat
     */
    EquipeDAO equipeDAO = new EquipeDAO();
    ArrayList<Equipe> equipes = equipeDAO.readAllEquipes();
    JoueurDAO joueurDAO = new JoueurDAO();
    ArrayList<Joueur> joueur = joueurDAO.readAllJoueurs();
    public AjouterResultat() {
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

        jSeparator1 = new javax.swing.JSeparator();
        Equipe1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        Equipe2 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        R1 = new javax.swing.JSpinner();
        R2 = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        Valider = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Tem_but = new javax.swing.JTextField();
        Jouer_id = new javax.swing.JComboBox();
        Tem_but1 = new javax.swing.JTextField();
        Jouer_id1 = new javax.swing.JComboBox();
        Tem_but2 = new javax.swing.JTextField();
        Jouer_id2 = new javax.swing.JComboBox();
        Tem_but3 = new javax.swing.JTextField();
        Jouer_id3 = new javax.swing.JComboBox();
        Tem_but4 = new javax.swing.JTextField();
        Jouer_id4 = new javax.swing.JComboBox();
        Tem_but5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Jouer_id5 = new javax.swing.JComboBox();
        Tem_but6 = new javax.swing.JTextField();
        Jouer_id6 = new javax.swing.JComboBox();
        Tem_but7 = new javax.swing.JTextField();
        Jouer_id7 = new javax.swing.JComboBox();
        Tem_but8 = new javax.swing.JTextField();
        Jouer_id8 = new javax.swing.JComboBox();
        Tem_but9 = new javax.swing.JTextField();
        Jouer_id9 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Equipe1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".:: Selectionner Equipe ::." }));

        jLabel1.setText("Equipe 1");

        Equipe2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".:: Selectionner Equipe ::." }));

        jLabel2.setText("Equipe 2");

        R1.setEditor(new javax.swing.JSpinner.NumberEditor(R1, ""));
        R1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                R1StateChanged(evt);
            }
        });
        R1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                R1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        R2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                R2StateChanged(evt);
            }
        });

        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });

        jLabel3.setText("Joueur");

        jLabel4.setText("Temp but");

        Tem_but.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tem_butMouseExited(evt);
            }
        });
        Tem_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tem_butActionPerformed(evt);
            }
        });

        Jouer_id.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".:: Selectionner Jouer ::." }));

        Tem_but1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tem_but1MouseExited(evt);
            }
        });

        Jouer_id1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".:: Selectionner Jouer ::." }));

        Tem_but2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Tem_but2MouseExited(evt);
            }
        });

        Jouer_id2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".:: Selectionner Jouer ::." }));

        Jouer_id3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".:: Selectionner Jouer ::." }));

        Jouer_id4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".:: Selectionner Jouer ::." }));

        jLabel5.setText("Joueur");

        Jouer_id5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".:: Selectionner Jouer ::." }));

        Jouer_id6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".:: Selectionner Jouer ::." }));

        Jouer_id7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".:: Selectionner Jouer ::." }));

        Tem_but8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tem_but8ActionPerformed(evt);
            }
        });

        Jouer_id8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".:: Selectionner Jouer ::." }));

        Jouer_id9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".:: Selectionner Jouer ::." }));

        jLabel6.setText("Temp but");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(130, 130, 130)
                        .add(jLabel3)
                        .add(144, 144, 144)
                        .add(jLabel4))
                    .add(layout.createSequentialGroup()
                        .add(50, 50, 50)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(Jouer_id1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(52, 52, 52)
                                .add(Tem_but1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(Jouer_id, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(52, 52, 52)
                                .add(Tem_but, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(Jouer_id2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(52, 52, 52)
                                .add(Tem_but2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(Jouer_id3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(52, 52, 52)
                                .add(Tem_but3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(Jouer_id4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(52, 52, 52)
                                .add(Tem_but4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jLabel5)
                        .add(144, 144, 144)
                        .add(jLabel6))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(Jouer_id8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Jouer_id6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Jouer_id7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Jouer_id9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Jouer_id5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(46, 46, 46)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(Tem_but7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(Tem_but5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(Tem_but6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(Tem_but9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(Tem_but8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .add(24, 24, 24))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .add(18, 18, 18)
                        .add(Equipe1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(R1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(R2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(Equipe2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel2))
                    .add(layout.createSequentialGroup()
                        .add(33, 33, 33)
                        .add(jSeparator2))
                    .add(layout.createSequentialGroup()
                        .add(340, 340, 340)
                        .add(Valider)
                        .add(0, 0, Short.MAX_VALUE)))
                .add(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(23, 23, 23)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Equipe1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1)
                    .add(Equipe2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2)
                    .add(R2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(R1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(Valider)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(19, 19, 19)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel3)
                            .add(jLabel4))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(Tem_but, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Jouer_id, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(Tem_but1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Jouer_id1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(Tem_but2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Jouer_id2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(Tem_but3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Jouer_id3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(Tem_but4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Jouer_id4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel5)
                            .add(jLabel6))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(Tem_but5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Jouer_id5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(Tem_but6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Jouer_id6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(Tem_but7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Jouer_id7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(Tem_but8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Jouer_id8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(Tem_but9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Jouer_id9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (int i = 0; i < equipes.size(); i++) {
            Equipe1.addItem(equipes.get(i).getNom());
            Equipe2.addItem(equipes.get(i).getNom());
           // Equipe1.set
            
            
        }
        for (int i = 0; i < joueur.size(); i++) {
            Jouer_id.addItem(joueur.get(i).getNom());
            Jouer_id1.addItem(joueur.get(i).getNom());
            Jouer_id2.addItem(joueur.get(i).getNom());
            Jouer_id3.addItem(joueur.get(i).getNom());
            Jouer_id4.addItem(joueur.get(i).getNom());
            Jouer_id5.addItem(joueur.get(i).getNom());
            Jouer_id6.addItem(joueur.get(i).getNom());
            Jouer_id7.addItem(joueur.get(i).getNom());
            Jouer_id8.addItem(joueur.get(i).getNom());
            Jouer_id9.addItem(joueur.get(i).getNom());
            
        }
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        
        Tem_but.setVisible(false);
        Jouer_id.setVisible(false);
        Tem_but1.setVisible(false);
        Jouer_id1.setVisible(false);
        Tem_but2.setVisible(false);
        Jouer_id2.setVisible(false);
        Tem_but3.setVisible(false);
        Jouer_id3.setVisible(false);
        Tem_but4.setVisible(false);
        Jouer_id4.setVisible(false);
        
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        Tem_but5.setVisible(false);
        Jouer_id5.setVisible(false); 
        Tem_but6.setVisible(false);
        Jouer_id6.setVisible(false);
        Tem_but7.setVisible(false);
        Jouer_id7.setVisible(false);
        Tem_but8.setVisible(false);
        Jouer_id8.setVisible(false);
        Tem_but9.setVisible(false);
        Jouer_id9.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void Tem_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tem_butActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tem_butActionPerformed

    private void R1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_R1AncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_R1AncestorAdded

    private void R1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_R1StateChanged
        // TODO add your handling code here:
        int nb=0;
        
        nb=(int) R1.getValue();
        if(nb==0)
        {
            jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        
        Tem_but.setVisible(false);
        Jouer_id.setVisible(false);
        Tem_but1.setVisible(false);
        Jouer_id1.setVisible(false);
        Tem_but2.setVisible(false);
        Jouer_id2.setVisible(false);
        Tem_but3.setVisible(false);
        Jouer_id3.setVisible(false);
        Tem_but4.setVisible(false);
        Jouer_id4.setVisible(false);
        }
        if(nb==1)
        {
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        Tem_but.setVisible(true);
        Jouer_id.setVisible(true); 
        Tem_but1.setVisible(false);
        Jouer_id1.setVisible(false);
        Tem_but2.setVisible(false);
        Jouer_id2.setVisible(false);
        Tem_but3.setVisible(false);
        Jouer_id3.setVisible(false);
        Tem_but4.setVisible(false);
        Jouer_id4.setVisible(false);
        }
        if(nb==2)
        {
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        Tem_but.setVisible(true);
        Jouer_id.setVisible(true);
        Tem_but1.setVisible(true);
        Jouer_id1.setVisible(true);
        Tem_but2.setVisible(false);
        Jouer_id2.setVisible(false);
        Tem_but3.setVisible(false);
        Jouer_id3.setVisible(false);
        Tem_but4.setVisible(false);
        Jouer_id4.setVisible(false);
        }
        if(nb==3)
        {
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        Tem_but.setVisible(true);
        Jouer_id.setVisible(true);
        Tem_but1.setVisible(true);
        Jouer_id1.setVisible(true);
        Tem_but2.setVisible(true);
        Jouer_id2.setVisible(true);
        Tem_but3.setVisible(false);
        Jouer_id3.setVisible(false);
        Tem_but4.setVisible(false);
        Jouer_id4.setVisible(false);
        }
        if(nb==4)
        {
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        Tem_but.setVisible(true);
        Jouer_id.setVisible(true);
        Tem_but1.setVisible(true);
        Jouer_id1.setVisible(true);
        Tem_but2.setVisible(true);
        Jouer_id2.setVisible(true);
        Tem_but3.setVisible(true);
        Jouer_id3.setVisible(true);
        Tem_but4.setVisible(false);
        Jouer_id4.setVisible(false);
        }
        if(nb==5)
        {
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        Tem_but.setVisible(true);
        Jouer_id.setVisible(true);
        Tem_but1.setVisible(true);
        Jouer_id1.setVisible(true);
        Tem_but2.setVisible(true);
        Jouer_id2.setVisible(true);
        Tem_but3.setVisible(true);
        Jouer_id3.setVisible(true);
        Tem_but4.setVisible(true);
        Jouer_id4.setVisible(true);
        }
    }//GEN-LAST:event_R1StateChanged

    private void R2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_R2StateChanged
        // TODO add your handling code here:
        int nb=0;
        
        nb=(int) (int) R2.getValue();
        if(nb==0)
        {
            jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        Tem_but5.setVisible(false);
        Jouer_id5.setVisible(false); 
        Tem_but6.setVisible(false);
        Jouer_id6.setVisible(false);
        Tem_but7.setVisible(false);
        Jouer_id7.setVisible(false);
        Tem_but8.setVisible(false);
        Jouer_id8.setVisible(false);
        Tem_but9.setVisible(false);
        Jouer_id9.setVisible(false);
        }
        if(nb==1)
        {
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        Tem_but5.setVisible(true);
        Jouer_id5.setVisible(true); 
        Tem_but6.setVisible(false);
        Jouer_id6.setVisible(false);
        Tem_but7.setVisible(false);
        Jouer_id7.setVisible(false);
        Tem_but8.setVisible(false);
        Jouer_id8.setVisible(false);
        Tem_but9.setVisible(false);
        Jouer_id9.setVisible(false);
        }
        if(nb==2)
        {
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        Tem_but5.setVisible(true);
        Jouer_id5.setVisible(true); 
        Tem_but6.setVisible(true);
        Jouer_id6.setVisible(true);
        Tem_but7.setVisible(false);
        Jouer_id7.setVisible(false);
        Tem_but8.setVisible(false);
        Jouer_id8.setVisible(false);
        Tem_but9.setVisible(false);
        Jouer_id9.setVisible(false);
        }
        if(nb==3)
        {
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        Tem_but5.setVisible(true);
        Jouer_id5.setVisible(true); 
        Tem_but6.setVisible(true);
        Jouer_id6.setVisible(true);
        Tem_but7.setVisible(true);
        Jouer_id7.setVisible(true);
        Tem_but8.setVisible(false);
        Jouer_id8.setVisible(false);
        Tem_but9.setVisible(false);
        Jouer_id9.setVisible(false);
        }
        if(nb==4)
        {
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        Tem_but5.setVisible(true);
        Jouer_id5.setVisible(true); 
        Tem_but6.setVisible(true);
        Jouer_id6.setVisible(true);
        Tem_but7.setVisible(true);
        Jouer_id7.setVisible(true);
        Tem_but8.setVisible(true);
        Jouer_id8.setVisible(true);
        Tem_but9.setVisible(false);
        Jouer_id9.setVisible(false);
        }
        if(nb==5)
        {
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        Tem_but5.setVisible(true);
        Jouer_id5.setVisible(true); 
        Tem_but6.setVisible(true);
        Jouer_id6.setVisible(true);
        Tem_but7.setVisible(true);
        Jouer_id7.setVisible(true);
        Tem_but8.setVisible(true);
        Jouer_id8.setVisible(true);
        Tem_but9.setVisible(true);
        Jouer_id9.setVisible(true);
        }
    }//GEN-LAST:event_R2StateChanged

    private void Tem_but8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tem_but8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tem_but8ActionPerformed

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        // TODO add your handling code here:
        
        Equipe equipe = equipeDAO.readEquipeNom(Equipe1.getSelectedItem().toString()); //Récuperer l'equipe séléctionnée à partir du ComboBox 
        Equipe equipe2 = equipeDAO.readEquipeNom(Equipe2.getSelectedItem().toString()); 
        Match match;
        match = new Match(equipe.getId(), Integer.parseInt(R1.getValue().toString()), Integer.parseInt(R2.getValue().toString()), equipe2.getId());
        
        MatchDAO employeDAO = new MatchDAO();
        if(employeDAO.addMatch(match) != 0){
            JOptionPane.showMessageDialog(this, "Ajout effectué avec succès !");
            R1.setEnabled(false);
        R2.setEnabled(false);
        }
        
        
        
        Joueur joueurs3=joueurDAO.readJoueurNom(Jouer_id2.getSelectedItem().toString());
        Joueur joueurs4=joueurDAO.readJoueurNom(Jouer_id3.getSelectedItem().toString());
        Joueur joueurs5=joueurDAO.readJoueurNom(Jouer_id4.getSelectedItem().toString());
        
        
        
    }//GEN-LAST:event_ValiderActionPerformed

    private void Tem_butMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tem_butMouseExited
        // TODO add your handling code here:
        if(Tem_but.getText().equals("")==false)
        {
            
        
        Joueur joueurs1=joueurDAO.readJoueurNom(Jouer_id.getSelectedItem().toString());
        But but=new But(1, joueurs1.getId(), Tem_but.getText());
        ButDAO butdao=new ButDAO();
        if(butdao.addBut(but) != 0){
            JOptionPane.showMessageDialog(this, "Ajout effectué avec succès !");
        }
        Tem_but.setVisible(false);
        Jouer_id.setVisible(false);
        }
    }//GEN-LAST:event_Tem_butMouseExited

    private void Tem_but1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tem_but1MouseExited
        // TODO add your handling code here:
        if(Tem_but1.getText().equals("")==false)
        {Joueur joueurs2=joueurDAO.readJoueurNom(Jouer_id1.getSelectedItem().toString());
        But but=new But(1, joueurs2.getId(), Tem_but1.getText());
        ButDAO butdao=new ButDAO();
        if(butdao.addBut(but) != 0){
            JOptionPane.showMessageDialog(this, "Ajout effectué avec succès joueur!");
        }
        Tem_but1.setVisible(false);
        Jouer_id1.setVisible(false);}
    }//GEN-LAST:event_Tem_but1MouseExited

    private void Tem_but2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tem_but2MouseExited
        // TODO add your handling code here:
        if(Tem_but2.getText().equals("")==false)
        {
        Joueur joueurs2=joueurDAO.readJoueurNom(Jouer_id2.getSelectedItem().toString());
        But but=new But(1, joueurs2.getId(), Tem_but2.getText());
        ButDAO butdao=new ButDAO();
        if(butdao.addBut(but) != 0){
            JOptionPane.showMessageDialog(this, "Ajout effectué avec succès joueur!");
        }
        Tem_but2.setVisible(false);
        Jouer_id2.setVisible(false);}
    }//GEN-LAST:event_Tem_but2MouseExited

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
            java.util.logging.Logger.getLogger(AjouterResultat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterResultat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterResultat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterResultat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterResultat().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Equipe1;
    private javax.swing.JComboBox Equipe2;
    private javax.swing.JComboBox Jouer_id;
    private javax.swing.JComboBox Jouer_id1;
    private javax.swing.JComboBox Jouer_id2;
    private javax.swing.JComboBox Jouer_id3;
    private javax.swing.JComboBox Jouer_id4;
    private javax.swing.JComboBox Jouer_id5;
    private javax.swing.JComboBox Jouer_id6;
    private javax.swing.JComboBox Jouer_id7;
    private javax.swing.JComboBox Jouer_id8;
    private javax.swing.JComboBox Jouer_id9;
    private javax.swing.JSpinner R1;
    private javax.swing.JSpinner R2;
    private javax.swing.JTextField Tem_but;
    private javax.swing.JTextField Tem_but1;
    private javax.swing.JTextField Tem_but2;
    private javax.swing.JTextField Tem_but3;
    private javax.swing.JTextField Tem_but4;
    private javax.swing.JTextField Tem_but5;
    private javax.swing.JTextField Tem_but6;
    private javax.swing.JTextField Tem_but7;
    private javax.swing.JTextField Tem_but8;
    private javax.swing.JTextField Tem_but9;
    private javax.swing.JButton Valider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}