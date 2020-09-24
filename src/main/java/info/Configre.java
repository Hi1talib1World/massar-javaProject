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
public class Configre {
 

    public static Admin intialize() {

        Admin msc = Admin.getInstance();
        //Adding Admin
        Person p = new Person();
        p.setFirstName("Admin");
        p.setLastName("Admin");
        UserInfo ua = new UserInfo("admin", "admin", UserAccount.ADMIN_ROLE, p);
        msc.getUserAccountDirectory().addUserAccount(ua);
        //Adding Retailer 1
        Retailer r = new Retailer();
        r.setRetailerName("Apple");
        r.setZipCode("02115");
        msc.getRetailerCatalogue().addRetailer(r);
        UserInfo uar = new UserInfo("apple", "apple", UserAccount.RETAILER_ROLE, r);
        msc.getUserAccountDirectory().addUserAccount(uar);
        //Adding Product to Retailer 1
        Product p1 = new Product("iPhoneX", 1000, 10);
        r.getProductCatalogue().addProduct(p1);
        
        Product p2 = new Product("iPhone8", 700, 10);
        r.getProductCatalogue().addProduct(p2);
        
        Product p3 = new Product("Mac Book Pro", 1500, 10);
        r.getProductCatalogue().addProduct(p3);
        
        //Adding Retailer 2
        Retailer r1 = new Retailer();
        r1.setRetailerName("Tesla");
        r1.setZipCode("02115");
        msc.getRetailerCatalogue().addRetailer(r1);
        UserInfo uar1 = new UserInfo("tesla", "tesla", UserAccount.RETAILER_ROLE, r1);
        msc.getUserAccountDirectory().addUserAccount(uar1);
        
        
        //Adding Retailer 3
        Retailer r3 = new Retailer();
        r3.setRetailerName("Macy's");
        r3.setZipCode("02116");
        msc.getRetailerCatalogue().addRetailer(r3);
        UserInfo uar2 = new UserInfo("macys", "macys", UserInfo.RETAILER_ROLE, r3);
        msc.getUserAccountDirectory().addUserAccount(uar2);
        
        //Adding Products to Retailer 3
        Product p7 = new Product("Pants", 5, 50);
        r3.getProductCatalogue().addProduct(p7);
        
        Product p8 = new Product("Shirts", 3, 75);
        r3.getProductCatalogue().addProduct(p8);
        
        
        Customer per = new Customer("08-21-1995", "Tom","02115");
        msc.getCustomerCatalogue().addCustomer(per);
        UserAccount uac = new UserAccount("cust", "cust", UserAccount.CUSTOMER_ROLE, per);
        msc.getUserAccountDirectory().addUserAccount(uac);
        
        Customer per1 = new Customer("11-20-1993", "Dick","02115");
        msc.getCustomerCatalogue().addCustomer(per1);
        UserAccount uac1 = new UserAccount("cust1", "cust1", UserAccount.CUSTOMER_ROLE, per1);
        msc.getUserAccountDirectory().addUserAccount(uac1);
        
        Customer per2 = new Customer("05-20-1998", "Harry","02116");
        msc.getCustomerCatalogue().addCustomer(per2);
        UserAccount uac2 = new UserAccount("cust2", "cust2", UserAccount.CUSTOMER_ROLE, per2);
        msc.getUserAccountDirectory().addUserAccount(uac2);
        
        return msc;
    }

   
}
