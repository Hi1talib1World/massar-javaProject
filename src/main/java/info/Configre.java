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
        UserInfo ua = new UserInfo("admin", "admin", UserInfo.ADMIN_ROLE, p);
        msc.getUserInfoDirectory().addUserAccount(ua);
        //Adding Retailer 1
        Retailer r = new Retailer();
        r.setRetailerName("Apple");
        r.setZipCode("02115");
        msc.getRetailerCatalogue().addRetailer(r);
        UserInfo uar = new UserInfo("apple", "apple", UserInfo.RETAILER_ROLE, r);
        msc.getUserInfoDirectory().addUserAccount(uar);    
        
        //Adding Retailer 2
        Retailer r1 = new Retailer();
        r1.setRetailerName("Tesla");
        r1.setZipCode("02115");
        msc.getRetailerCatalogue().addRetailer(r1);
        UserInfo uar1 = new UserInfo("tesla", "tesla", UserInfo.RETAILER_ROLE, r1);
        msc.getUserInfoDirectory().addUserInfo(uar1);
        
        
        //Adding Retailer 3
        Retailer r3 = new Retailer();
        r3.setRetailerName("Macy's");
        r3.setZipCode("02116");
        msc.getRetailerCatalogue().addRetailer(r3);
        UserInfo uar2 = new UserInfo("macys", "macys", UserInfo.RETAILER_ROLE, r3);
        msc.getUserInfoDirectory().addUserInfo(uar2);
        
        
        Customer per = new Customer("08-21-1995", "Tom","02115");
        msc.getCustomerCatalogue().addCustomer(per);
        UserInfo uac = new UserInfo("cust", "cust", UserInfo.CUSTOMER_ROLE, per);
        msc.getUserInfoDirectory().addUserInfo(uac);
        
        
        return msc;
    }

   
}
