/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

import edu.esprit.entite.But;
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
public class ButDAO {
            Connection con = MyConnection.getInstance();

    public int addBut(But but) {
        int cle = 0;
        try {
            PreparedStatement stm = con.prepareStatement("INSERT INTO but (id_match, id_joueur,Temps) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, but.getId_match());
            stm.setInt(2, but.getId_Joueur());
            stm.setString(2, but.getTemps());
            stm.executeUpdate();
            ResultSet rs = stm.getGeneratedKeys();
            while (rs.next()) {
                cle = rs.getInt(1);
            }


        } catch (SQLException ex) {
            Logger.getLogger(ButDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cle;
    }  

    public boolean updateBut(But but) {
        boolean test = false;
        try {
            PreparedStatement stm = con.prepareStatement("UPDATE but SET id_match=?, id_joueur=?,Temps=? WHERE id=?");
            stm.setInt(1, but.getId_match());
            stm.setInt(2, but.getId_Joueur());
            stm.setString(2, but.getTemps());     
            stm.setInt(3, but.getId());
            if (stm.executeUpdate() != 0) {
                test = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ButDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return test;
    }

    public ArrayList<But> readAllButs() {
        ArrayList<But> buts = new ArrayList<But>();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM but ");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                But but = new But();
                but.setId(rs.getInt(1));
                but.setId_match(rs.getInt(2));
                but.setId_Joueur(rs.getInt(3));
                but.setTemps(rs.getString(4));
                
                
                
                buts.add(but);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ButDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return buts;
    }
    
    public But readButID(int id) {
        But but = new But();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM but WHERE id=?");
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                but.setId(rs.getInt(1));
                but.setId_match(rs.getInt(2));
                but.setId_Joueur(rs.getInt(3));
                but.setTemps(rs.getString(4));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ButDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return but;
    }
    
    public boolean deleteBut(But but) {
        boolean test = false;
        try {

            PreparedStatement stm = con.prepareStatement("DELETE FROM but WHERE id = ?");
            stm.setInt(1, but.getId());
            if (stm.executeUpdate() != 0) {
                test = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ButDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return test;
    }   
}
