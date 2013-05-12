/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entite;

/**
 *
 * @author Jaloul1
 */
public class Equipe {
    private int Id;
    private String Nom,Entraineur;

    public Equipe(String Nom, String Entraineur) {
        this.Nom = Nom;
        this.Entraineur = Entraineur;
    }

    public Equipe() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getEntraineur() {
        return Entraineur;
    }

    public void setEntraineur(String Entraineur) {
        this.Entraineur = Entraineur;
    }
    
    
}
