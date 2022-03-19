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
public class Manager {
    //manager attributes
    
    int Managerid;
      String Managername;
    String Managerphone;
   String Manageraddress;
    String ManagerEmail;
    String Managercnic;

    public Manager(int Managerid, String Managername, String Managerphone, String Manageraddress, String ManagerEmail, String Managercnic) {
        //constructor of manager
        
        this.Managerid = Managerid;
        this.Managername = Managername;
        this.Managerphone = Managerphone;
        this.Manageraddress = Manageraddress;
        this.ManagerEmail = ManagerEmail;
        this.Managercnic = Managercnic;
    }
    
}
