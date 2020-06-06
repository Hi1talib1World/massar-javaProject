/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


/**
 *
 * @author mahajan
 */
public class Admin {
    

    public static Admin masterClass;
    private static double treasury = 0.0;
    
    private Admin()
    {
       
    }
    
    public static Admin getInstance() {
        if (masterClass == null) {
            masterClass = new Admin();
        }
        return masterClass;
    }

    /**
     *
     * @return
     */
    
    
    public static void pay(Double amount) {
        treasury += amount;
    }
    
    public static double getTreasury() {
        return treasury;
    }
    
    
    
}
