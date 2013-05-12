/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

import edu.esprit.entite.Favorits;
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
public class FavoritsDAO {
       Connection con = MyConnection.getInstance();

    public int addFavorits(Favorits favorits) {
        int cle = 0;
        try {
            PreparedStatement stm = con.prepareStatement("INSERT INTO favorits (id_user, id_equipe) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, favorits.getId_User());
            stm.setInt(2, favorits.getId_equipe());
            
            stm.executeUpdate();
            ResultSet rs = stm.getGeneratedKeys();
            while (rs.next()) {
                cle = rs.getInt(1);
            }


        } catch (SQLException ex) {
            Logger.getLogger(FavoritsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cle;
    }  

    public boolean updateFavorits(Favorits favorits) {
        boolean test = false;
        try {
            PreparedStatement stm = con.prepareStatement("UPDATE favorits SET id_user=?, id_equipe=? WHERE id=?");
            stm.setInt(1, favorits.getId_User());
            stm.setInt(2, favorits.getId_equipe());      
            stm.setInt(3, favorits.getId());
            if (stm.executeUpdate() != 0) {
                test = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FavoritsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return test;
    }

    public ArrayList<Favorits> readAllFavoritss() {
        ArrayList<Favorits> favoritss = new ArrayList<Favorits>();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM favorits ");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Favorits favorits = new Favorits();
                favorits.setId(rs.getInt(1));
                favorits.setId_User(rs.getInt(2));
                favorits.setId_equipe(rs.getInt(3));
                
                
                
                favoritss.add(favorits);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FavoritsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return favoritss;
    }
    
    public Favorits readFavoritsID(int id) {
        Favorits favorits = new Favorits();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM favorits WHERE id=?");
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                favorits.setId(rs.getInt(1));
                favorits.setId_User(rs.getInt(2));
                favorits.setId_equipe(rs.getInt(3));
            }

        } catch (SQLException ex) {
            Logger.getLogger(FavoritsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return favorits;
    }
    
    public boolean deleteFavorits(Favorits favorits) {
        boolean test = false;
        try {

            PreparedStatement stm = con.prepareStatement("DELETE FROM favorits WHERE id = ?");
            stm.setInt(1, favorits.getId());
            if (stm.executeUpdate() != 0) {
                test = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FavoritsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return test;
    } 
}
