/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entite;

/**
 *
 * @author Wael Mallek
 */
public class Utilisateur {
    
    private int id;
    private String Nom,Prenom,Role,UserName,Password,mail,tel;

    public Utilisateur(int id, String Nom, String Prenom, String Role, String mail, String tel ,String UserName, String Password) {
        this.id = id;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Role = Role;
        this.UserName = UserName;
        this.Password = Password;
        this.mail = mail;
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Utilisateur(String Nom, String Prenom, String Role, String UserName, String Password, String mail, String tel) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Role = Role;
        this.UserName = UserName;
        this.Password = Password;
        this.mail = mail;
        this.tel = tel;
    }

    

    public Utilisateur(int id) {
        this.id = id;
    }

    public Utilisateur() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "id=" + id + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Role=" + Role + ", UserName=" + UserName + ", Password=" + Password + '}';
    }

   
    
   
}
