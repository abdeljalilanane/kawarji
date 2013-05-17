/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.presentation;

import edu.esprit.dao.FavoritsDAO;
import edu.esprit.entite.Favorits;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Wael Mallek
 */
public class FavoritsTableModel extends AbstractTableModel{
    
    ArrayList<Favorits> equipe;
    FavoritsDAO eDAO = new FavoritsDAO();
    String[] entetes = {"Id ","Id Utilisateur", "Id equipe"};

    public FavoritsTableModel() {
        equipe = eDAO.readAllFavoritss();
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
                return equipe.get(rowIndex).getId_User();
            case 2:
                return equipe.get(rowIndex).getId_equipe();
            
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return entetes[column];
    }
    
}
