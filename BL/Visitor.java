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
public class Visitor {
    //visitor attributes
    
    int Visitorid;
      String Visitorname;
    String Visitorphone;
   String Visitortime;
    String VisitorEmail;
    String Visitorcnic;
    String Visitordate;

    public Visitor(int Visitorid, String Visitorname, String Visitorphone, String Visitortime, String VisitorEmail, String Visitorcnic, String Visitordate) {
        //constructor of visitor
        
        this.Visitorid = Visitorid;
        this.Visitorname = Visitorname;
        this.Visitorphone = Visitorphone;
        this.Visitortime = Visitortime;
        this.VisitorEmail = VisitorEmail;
        this.Visitorcnic = Visitorcnic;
        this.Visitordate = Visitordate;
    }
    
    
    
    
}
