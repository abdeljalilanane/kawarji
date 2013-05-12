/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entite;

/**
 *
 * @author Jaloul1
 */
public class Joueur {
    private int Id,Id_Equipe,Num;
    private String Nom,Prenom,Saison;

    public Joueur(int Id, int Id_Equipe, int Num, String Nom, String Prenom, String Saison) {
        this.Id = Id;
        this.Id_Equipe = Id_Equipe;
        this.Num = Num;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Saison = Saison;
    }
    
    public Joueur(int Id_Equipe, int Num, String Nom, String Prenom, String Saison) {
        
        this.Id_Equipe = Id_Equipe;
        this.Num = Num;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Saison = Saison;
    }

    public Joueur() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getId_Equipe() {
        return Id_Equipe;
    }

    public void setId_Equipe(int Id_Equipe) {
        this.Id_Equipe = Id_Equipe;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getSaison() {
        return Saison;
    }

    public void setSaison(String Saison) {
        this.Saison = Saison;
    }
    
    
}
