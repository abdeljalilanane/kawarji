/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entite;

/**
 *
 * @author Jaloul1
 */
public class Favorits {
    private int Id,Id_User,Id_equipe;

    public Favorits(int Id, int Id_User, int Id_equipe) {
        this.Id = Id;
        this.Id_User = Id_User;
        this.Id_equipe = Id_equipe;
    }

    public Favorits(int Id_User, int Id_equipe) {
        this.Id_User = Id_User;
        this.Id_equipe = Id_equipe;
    }

    public Favorits() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getId_User() {
        return Id_User;
    }

    public void setId_User(int Id_User) {
        this.Id_User = Id_User;
    }

    public int getId_equipe() {
        return Id_equipe;
    }

    public void setId_equipe(int Id_equipe) {
        this.Id_equipe = Id_equipe;
    }
    
    
}
