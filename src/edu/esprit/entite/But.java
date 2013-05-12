/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entite;

/**
 *
 * @author Jaloul1
 */
public class But {
    private int Id,Id_match,Id_Joueur;
    private String Temps;

    public But(int Id_match, int Id_Joueur, String Temps) {
        this.Id_match = Id_match;
        this.Id_Joueur = Id_Joueur;
        this.Temps = Temps;
    }

    public But() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getId_match() {
        return Id_match;
    }

    public void setId_match(int Id_match) {
        this.Id_match = Id_match;
    }

    public int getId_Joueur() {
        return Id_Joueur;
    }

    public void setId_Joueur(int Id_Joueur) {
        this.Id_Joueur = Id_Joueur;
    }

    public String getTemps() {
        return Temps;
    }

    public void setTemps(String Temps) {
        this.Temps = Temps;
    }
    
    
}
