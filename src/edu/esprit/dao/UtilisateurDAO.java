/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

import edu.esprit.entite.Utilisateur;
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
public class UtilisateurDAO {
    Connection con = MyConnection.getInstance();

    public int addUtilisateur(Utilisateur utilisateur) {
        int cle = 0;
        try {
            PreparedStatement stm = con.prepareStatement("INSERT INTO user (nom,prenom,role,mail,tel,username,password) VALUES (?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, utilisateur.getNom());
            stm.setString(2, utilisateur.getPrenom());
            stm.setString(3, utilisateur.getRole());
            stm.setString(4, utilisateur.getMail());
            stm.setString(5, utilisateur.getTel());
            stm.setString(6, utilisateur.getUserName());
            stm.setString(7, utilisateur.getPassword());
            stm.executeUpdate();
            ResultSet rs = stm.getGeneratedKeys();
            while (rs.next()) {
                cle = rs.getInt(1);
            }


        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cle;
    }  

    public boolean updateUtilisateur(Utilisateur utilisateur) {
        boolean test = false;
        try {
            PreparedStatement stm = con.prepareStatement("UPDATE user SET nom=?,prenom=?,role=?,mail=?,tel=?,username=?,password=? WHERE id=?");
            stm.setString(1, utilisateur.getNom());
            stm.setString(2, utilisateur.getPrenom());
            stm.setString(3, utilisateur.getRole());
            stm.setString(4, utilisateur.getMail());
            stm.setString(5, utilisateur.getTel());
            stm.setString(6, utilisateur.getUserName());
            stm.setString(7, utilisateur.getPassword());         
            stm.setInt(8, utilisateur.getId());
            if (stm.executeUpdate() != 0) {
                test = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return test;
    }

    public ArrayList<Utilisateur> readAllUtilisateurs() {
        ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM user ");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Utilisateur utilisateur = new Utilisateur();
                utilisateur.setId(rs.getInt(1));
                utilisateur.setNom(rs.getString(2));
                utilisateur.setPrenom(rs.getString(3));
                utilisateur.setRole(rs.getString(4));
                utilisateur.setMail(rs.getString(5));
                utilisateur.setTel(rs.getString(6));
                utilisateur.setUserName(rs.getString(7));
                utilisateur.setPassword(rs.getString(8));
                utilisateurs.add(utilisateur);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return utilisateurs;
    }
    
    public Utilisateur readUtilisateurID(int id) {
        Utilisateur utilisateur = new Utilisateur();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM user WHERE id=?");
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                utilisateur.setId(rs.getInt(1));
                utilisateur.setNom(rs.getString(2));
                utilisateur.setPrenom(rs.getString(3));
                utilisateur.setRole(rs.getString(4));
                utilisateur.setMail(rs.getString(5));
                utilisateur.setTel(rs.getString(6));
                utilisateur.setUserName(rs.getString(7));
                utilisateur.setPassword(rs.getString(8));
            }

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return utilisateur;
    }
    
    public boolean deleteUtilisateur(Utilisateur utilisateur) {
        boolean test = false;
        try {

            PreparedStatement stm = con.prepareStatement("DELETE FROM user WHERE id = ?");
            stm.setInt(1, utilisateur.getId());
            if (stm.executeUpdate() != 0) {
                test = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return test;
    }
    
    
    
    //Login
    public Utilisateur checklogin(String login) {
        Utilisateur utilisateur = new Utilisateur();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM user WHERE `username`=? ");
            stm.setString(1,login);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                utilisateur.setId(rs.getInt(1));
                utilisateur.setNom(rs.getString(2));
                utilisateur.setPrenom(rs.getString(3));
                utilisateur.setRole(rs.getString(4));
                utilisateur.setMail(rs.getString(5));
                utilisateur.setTel(rs.getString(6));
                utilisateur.setUserName(rs.getString(7));
                utilisateur.setPassword(rs.getString(8));
            }

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return utilisateur;
        
    }

    public boolean checklogin2(String login) {
        
        String user = null;
        
        try {
            
            PreparedStatement stm = con.prepareStatement("SELECT * FROM user WHERE `username`=? ");
            stm.setString(1,login);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                user = rs.getString(7);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (user != null) {
            return true;
        }
        return false;
    }
}
