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
public class Distributor {
    //distributor attributes
    
     int Distributorid;
      String Distributorname;
    String Distributorphone;
   
    String DistributorEmail;
    String Distributorcnic;
   

    public Distributor(int Distributorid, String Distributorname, String Distributorphone,  String DistributorEmail, String Distributorcnic) {
        // constructor of distributor
        
        this.Distributorid = Distributorid;
        this.Distributorname = Distributorname;
        this.Distributorphone = Distributorphone;
      
        this.DistributorEmail = DistributorEmail;
        this.Distributorcnic = Distributorcnic;
       ;
    }
    
}
