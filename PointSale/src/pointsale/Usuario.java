/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pointsale;

import java.util.Date;

/**
 *
 * @author fran
 */
public class Usuario {
    private int idUsr;
    private String nameUsr;
    private String pwUsr;
    private String emailUsr;

    public int getIdUsr() {
        return idUsr;
    }

    public void setIdUsr(int idUsr) {
        this.idUsr = idUsr;
    }

    public String getNameUsr() {
        return nameUsr;
    }

    public void setNameUsr(String nameUsr) {
        this.nameUsr = nameUsr;
    }

    public String getPwUsr() {
        return pwUsr;
    }

    public void setPwUsr(String pwUsr) {
        this.pwUsr = pwUsr;
    }

    public String getEmailUsr() {
        return emailUsr;
    }

    public void setEmailUsr(String emailUsr) {
        this.emailUsr = emailUsr;
    }
    


    @Override
    public String toString() {
        return "Usuario{" + "idUsr=" + idUsr + ", nameUsr=" + nameUsr + ", pwUsr=" + pwUsr + ", emailUsr=" + emailUsr + '}';
    }   
    
    
}
