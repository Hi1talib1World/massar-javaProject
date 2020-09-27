/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info;

/**
 *
 * @author admin
 */
public class Admin {
    

    public static Admin masterClass;
    private teacherCatalogue retailerCatalogue;
    private CustomerCatalogue customerCatalogue;
    private UserInfoDirectory userAccountDirectory;
    private static double treasury = 0.0;
    
    private Admin()
    {
        this.retailerCatalogue=new teacherCatalogue();
        this.customerCatalogue=new CustomerCatalogue();
        this.userAccountDirectory = new UserInfoDirectory();
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
    public teacherCatalogue getRetailerCatalogue() {
        return retailerCatalogue;
    }

    /**
     *
     * @return
     */
    public telmidCatalogue getCustomerCatalogue() {
        return customerCatalogue;
    }

    /**
     *
     * @return
     */
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    /**
     *
     * @param userAccountDirectory
     */
    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    public static void pay(Double amount) {
        treasury += amount;
    }
    
    public static double getTreasury() {
        return treasury;
    }
    
    public static double payRetailer (RetailerInvoice ri) {
        System.out.println("Tresury $" + Admin.getTreasury());
        double toBePaid = ri.getTotalPriceToBePaid() - (ri.getTotalPriceToBePaid() * 0.1);
        treasury -= toBePaid;
        System.out.println("Tresury $" + Admin.getTreasury());
        return toBePaid;
    }
}
