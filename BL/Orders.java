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
public class Orders {
    
    //order attributes
    
    int Orderid;
   int Orderqunatity;
   String Orderdate;
   String Ordertime;

    public Orders(int Orderid, int Orderqunatity, String Orderdate, String Ordertime) {
        //constructor of order
        
        this.Orderid = Orderid;
        this.Orderqunatity = Orderqunatity;
        this.Orderdate = Orderdate;
        this.Ordertime = Ordertime;
    }
   
   
   
    
    
}
