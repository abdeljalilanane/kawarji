/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.presentation;

import edu.esprit.dao.JoueurDAO;
import edu.esprit.entite.Joueur;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Wael Mallek
 */
public class JoueurTableModel extends AbstractTableModel{
    
    ArrayList<Joueur> equipe;
    JoueurDAO eDAO = new JoueurDAO();
    String[] entetes = {"Id Joueur","Id Equipe", "Nom","Prenom", "Saison","Numero"};

    public JoueurTableModel() {
        equipe = eDAO.readAllJoueurs();
    }

    @Override
    public int getRowCount() {
        return equipe.size();
    }

    @Override
    public int getColumnCount() {
        return entetes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return equipe.get(rowIndex).getId();
            case 1:
                return equipe.get(rowIndex).getId_Equipe();
            case 2:
                return equipe.get(rowIndex).getNom();
            case 3:
                return equipe.get(rowIndex).getPrenom();
            case 4:
                return equipe.get(rowIndex).getSaison();
            case 5:
                return equipe.get(rowIndex).getNum();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return entetes[column];
    }
    
}
