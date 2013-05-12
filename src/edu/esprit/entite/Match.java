/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entite;

/**
 *
 * @author Jaloul1
 */
public class Match {
    private int Id,Id_E1,R1,R2,Id_E2;

    public Match( int Id_E1, int R1, int R2, int Id_E2) {
        
        this.Id_E1 = Id_E1;
        this.R1 = R1;
        this.R2 = R2;
        this.Id_E2 = Id_E2;
    }

    public Match() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getId_E1() {
        return Id_E1;
    }

    public void setId_E1(int Id_E1) {
        this.Id_E1 = Id_E1;
    }

    public int getR1() {
        return R1;
    }

    public void setR1(int R1) {
        this.R1 = R1;
    }

    public int getR2() {
        return R2;
    }

    public void setR2(int R2) {
        this.R2 = R2;
    }

    public int getId_E2() {
        return Id_E2;
    }

    public void setId_E2(int Id_E2) {
        this.Id_E2 = Id_E2;
    }
    
    
}
