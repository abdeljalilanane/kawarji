/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

import edu.esprit.entite.Equipe;
import edu.esprit.metier.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jaloul1
 */
public class EquipeDAO {
           Connection con = MyConnection.getInstance();

    public int addEquipe(Equipe equipe) {
        int cle = 0;
        try {
            PreparedStatement stm = con.prepareStatement("INSERT INTO equipe (nom, entraineur) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, equipe.getNom());
            stm.setString(2, equipe.getEntraineur());
            
            stm.executeUpdate();
            ResultSet rs = stm.getGeneratedKeys();
            while (rs.next()) {
                cle = rs.getInt(1);
            }


        } catch (SQLException ex) {
            Logger.getLogger(EquipeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cle;
    }  

    public boolean updateEquipe(Equipe equipe) {
        boolean test = false;
        try {
            PreparedStatement stm = con.prepareStatement("UPDATE equipe SET nom=?, entraineur=? WHERE id=?");
            stm.setString(1, equipe.getNom());
            stm.setString(2, equipe.getEntraineur());     
            stm.setInt(3, equipe.getId());
            if (stm.executeUpdate() != 0) {
                test = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EquipeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return test;
    }

    public ArrayList<Equipe> readAllEquipes() {
        ArrayList<Equipe> equipes = new ArrayList<Equipe>();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM equipe ");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Equipe equipe = new Equipe();
                equipe.setId(rs.getInt(1));
                equipe.setNom(rs.getString(2));
                equipe.setEntraineur(rs.getString(3));
                
                
                
                equipes.add(equipe);
            }

        } catch (SQLException ex) {
            Logger.getLogger(EquipeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return equipes;
    }
    
    public Equipe readEquipeID(int id) {
        Equipe equipe = new Equipe();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM equipe WHERE id=?");
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                equipe.setId(rs.getInt(1));
                equipe.setNom(rs.getString(2));
                equipe.setEntraineur(rs.getString(3));
            }

        } catch (SQLException ex) {
            Logger.getLogger(EquipeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return equipe;
    }
    public Equipe readEquipeNom(String nom) {
        Equipe equipe = new Equipe();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM equipe WHERE nom=?");
            stm.setString(1, nom);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                equipe.setId(rs.getInt(1));
                equipe.setNom(rs.getString(2));
                equipe.setEntraineur(rs.getString(3));
            }

        } catch (SQLException ex) {
            Logger.getLogger(EquipeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return equipe;
    }
    
    public boolean deleteEquipe(Equipe equipe) {
        boolean test = false;
        try {

            PreparedStatement stm = con.prepareStatement("DELETE FROM equipe WHERE id = ?");
            stm.setInt(1, equipe.getId());
            if (stm.executeUpdate() != 0) {
                test = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EquipeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return test;
    } 
}
