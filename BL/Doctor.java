/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

/**
 *
 * @author rimsh
 */
public class Doctor {
    //Doctor Attributes
    
    int Doctorid;
      String Doctorname;
    String Doctorphone;
   String Doctoraddress;
    String DoctorEmail;
    String Doctorcnic;
    String Doctorspecialization;

    public Doctor(int Doctorid, String Doctorname, String Doctorphone, String Doctoraddress, String DoctorEmail, String Doctorcnic, String Doctorspecialization) {
        //construcor of Doctor
        
        this.Doctorid = Doctorid;
        this.Doctorname = Doctorname;
        this.Doctorphone = Doctorphone;
        this.Doctoraddress = Doctoraddress;
        this.DoctorEmail = DoctorEmail;
        this.Doctorcnic = Doctorcnic;
        this.Doctorspecialization = Doctorspecialization;
    }
    
    
    
    
}
