/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.presentation;

import edu.esprit.dao.UtilisateurDAO;
import edu.esprit.entite.Utilisateur;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Wael Mallek
 */
public class UtilisateurTableModel extends AbstractTableModel{
    
    ArrayList<Utilisateur> utilisateur;
    UtilisateurDAO eDAO = new UtilisateurDAO();
    String[] entetes = {"Id Utilisateur", "Nom","Prenom", "Role","mail","Tel","Login","Password"};

    public UtilisateurTableModel() {
        utilisateur = eDAO.readAllUtilisateurs();
    }

    @Override
    public int getRowCount() {
        return utilisateur.size();
    }

    @Override
    public int getColumnCount() {
        return entetes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return utilisateur.get(rowIndex).getId();
            case 1:
                return utilisateur.get(rowIndex).getNom();
            case 2:
                return utilisateur.get(rowIndex).getPrenom();
            case 3:
                return utilisateur.get(rowIndex).getRole();
            case 4:
                return utilisateur.get(rowIndex).getMail();
            case 5:
                return utilisateur.get(rowIndex).getTel();
            case 6:
                return utilisateur.get(rowIndex).getUserName();
                
            case 7:
                return utilisateur.get(rowIndex).getPassword();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return entetes[column];
    }
    
}
