
package BL;

// Abis Ali 

public class Complains {
    
    // complains attributes
    int ComplainId;
    String ComplainDescription;
    String ComplainLaunch_date;

    public Complains(int complainId, String complainDescription, String complainLaunch_date) {
        //constructor of complain table
        
        this.ComplainId = complainId;
        this.ComplainDescription = complainDescription;
        this.ComplainLaunch_date = complainLaunch_date;
    }
    
    
}
