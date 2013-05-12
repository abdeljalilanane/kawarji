/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

import edu.esprit.entite.Match;
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
public class MatchDAO {
    Connection con = MyConnection.getInstance();

    public int addMatch(Match match) {
        int cle = 0;
        try {
            PreparedStatement stm = con.prepareStatement("INSERT INTO match (`id_E1`, `R1`, `R2`, `id_E2`) VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, match.getId_E1());
            stm.setInt(2, match.getR1());
            stm.setInt(3, match.getR2());
            stm.setInt(4, match.getId_E2());
            stm.executeUpdate();
            ResultSet rs = stm.getGeneratedKeys();
            while (rs.next()) {
                cle = rs.getInt(1);
            }


        } catch (SQLException ex) {
            Logger.getLogger(MatchDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cle;
    }  

    public boolean updateMatch(Match match) {
        boolean test = false;
        try {
            PreparedStatement stm = con.prepareStatement("UPDATE match SET id_E1=?,R1=?,R2=?,id_E2=? WHERE id=?");
            stm.setInt(1, match.getId_E1());
            stm.setInt(2, match.getR1());
            stm.setInt(3, match.getR2());
            stm.setInt(4, match.getId_E2());         
            stm.setInt(5, match.getId());
            if (stm.executeUpdate() != 0) {
                test = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MatchDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return test;
    }

    public ArrayList<Match> readAllMatchs() {
        ArrayList<Match> matchs = new ArrayList<Match>();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM match ");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Match match = new Match();
                match.setId(rs.getInt(1));
                match.setId_E1(rs.getInt(2));
                match.setR1(rs.getInt(3));
                match.setR2(rs.getInt(4));
                match.setId_E2(rs.getInt(5));
                
                
                
                matchs.add(match);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MatchDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return matchs;
    }
    
    public Match readMatchID(int id) {
        Match match = new Match();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM match WHERE id=?");
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                match.setId(rs.getInt(1));
                match.setId_E1(rs.getInt(2));
                match.setR1(rs.getInt(3));
                match.setR2(rs.getInt(4));
                match.setId_E2(rs.getInt(5));
            }

        } catch (SQLException ex) {
            Logger.getLogger(MatchDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return match;
    }
    
    public boolean deleteMatch(Match match) {
        boolean test = false;
        try {

            PreparedStatement stm = con.prepareStatement("DELETE FROM match WHERE id = ?");
            stm.setInt(1, match.getId());
            if (stm.executeUpdate() != 0) {
                test = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MatchDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return test;
    }
}
