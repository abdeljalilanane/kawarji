/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.presentation;

import edu.esprit.dao.EquipeDAO;
import edu.esprit.entite.Equipe;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Wael Mallek
 */
public class EquipeTableModel extends AbstractTableModel{
    
    ArrayList<Equipe> equipe;
    EquipeDAO eDAO = new EquipeDAO();
    String[] entetes = {"Id", "Nom", "Entraineur"};

    public EquipeTableModel() {
        equipe = eDAO.readAllEquipes();
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
                return equipe.get(rowIndex).getNom();
            case 2:
                return equipe.get(rowIndex).getEntraineur();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return entetes[column];
    }
    
}
