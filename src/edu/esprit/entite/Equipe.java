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
    private String Nom,Entraineur,Flux;

    public Equipe(String Nom, String Entraineur,String Flux) {
        this.Nom = Nom;
        this.Entraineur = Entraineur;
        this.Flux=Flux;
    }

    public String getFlux() {
        return Flux;
    }

    public void setFlux(String Flux) {
        this.Flux = Flux;
    }

    public Equipe(int Id, String Nom, String Entraineur,String Flux) {
        this.Id = Id;
        this.Nom = Nom;
        this.Entraineur = Entraineur;
        this.Flux=Flux;
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
