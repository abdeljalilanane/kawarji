/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

import edu.esprit.entite.Joueur;
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
public class JoueurDAO {
    Connection con = MyConnection.getInstance();

    public int addJoueur(Joueur joueur) {
        int cle = 0;
        try {
            PreparedStatement stm = con.prepareStatement("INSERT INTO Joueur (id_equipe, nom, prenom, saison, num) VALUES (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, joueur.getId_Equipe());
            stm.setString(2, joueur.getNom());
            stm.setString(3, joueur.getPrenom());
            stm.setString(4, joueur.getSaison());
            stm.setInt(5, joueur.getNum());
            stm.executeUpdate();
            ResultSet rs = stm.getGeneratedKeys();
            while (rs.next()) {
                cle = rs.getInt(1);
            }


        } catch (SQLException ex) {
            Logger.getLogger(JoueurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cle;
    }  

    public boolean updateJoueur(Joueur joueur) {
        boolean test = false;
        try {
            PreparedStatement stm = con.prepareStatement("UPDATE Joueur SET id_equipe=?, nom=?, prenom=?, saison=?, num=? WHERE id=?");
            stm.setInt(1, joueur.getId_Equipe());
            stm.setString(2, joueur.getNom());
            stm.setString(3, joueur.getPrenom());
            stm.setString(4, joueur.getSaison());
            stm.setInt(5, joueur.getNum());       
            stm.setInt(6, joueur.getId());
            if (stm.executeUpdate() != 0) {
                test = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(JoueurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return test;
    }

    public ArrayList<Joueur> readAllJoueurs() {
        ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM Joueur ");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Joueur joueur = new Joueur();
                joueur.setId(rs.getInt(1));
                joueur.setId_Equipe(rs.getInt(2));
                joueur.setNom(rs.getString(3));
                joueur.setPrenom(rs.getString(4));
                joueur.setSaison(rs.getString(5));
                joueur.setNum(rs.getInt(6));
                
                
                joueurs.add(joueur);
            }

        } catch (SQLException ex) {
            Logger.getLogger(JoueurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return joueurs;
    }
    
    public Joueur readJoueurID(int id) {
        Joueur joueur = new Joueur();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM Joueur WHERE id=?");
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                joueur.setId(rs.getInt(1));
                joueur.setId_Equipe(rs.getInt(2));
                joueur.setNom(rs.getString(3));
                joueur.setPrenom(rs.getString(4));
                joueur.setSaison(rs.getString(5));
                joueur.setNum(rs.getInt(6));
            }

        } catch (SQLException ex) {
            Logger.getLogger(JoueurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return joueur;
    }
    public Joueur readJoueurNom(String nom) {
        Joueur joueur = new Joueur();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM Joueur WHERE nom=?");
            stm.setString(1, nom);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                joueur.setId(rs.getInt(1));
                joueur.setId_Equipe(rs.getInt(2));
                joueur.setNom(rs.getString(3));
                joueur.setPrenom(rs.getString(4));
                joueur.setSaison(rs.getString(5));
                joueur.setNum(rs.getInt(6));
            }

        } catch (SQLException ex) {
            Logger.getLogger(JoueurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return joueur;
    }
    
    public boolean deleteJoueur(Joueur joueur) {
        boolean test = false;
        try {

            PreparedStatement stm = con.prepareStatement("DELETE FROM Joueur WHERE id = ?");
            stm.setInt(1, joueur.getId());
            if (stm.executeUpdate() != 0) {
                test = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(JoueurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return test;
    }
}
