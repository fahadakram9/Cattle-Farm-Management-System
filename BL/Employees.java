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
public class Employees {
    //emplyee attributes
    
    int Employeeid;
    String Employeename;
    String Employeecnic;
    String Employeephone;
    String Employeeaddress;
    String Employeeemail;
    String Employeecategory;

    public Employees(int Employeeid, String Employeename, String Employeecnic, String Employeephone, String Employeeaddress, String Employeeemail, String Employeecategory) {
       //constructor of emloyee
        
        this.Employeeid = Employeeid;
        this.Employeename = Employeename;
        this.Employeecnic = Employeecnic;
        this.Employeephone = Employeephone;
        this.Employeeaddress = Employeeaddress;
        this.Employeeemail = Employeeemail;
        this.Employeecategory = Employeecategory;
    }
    
}
