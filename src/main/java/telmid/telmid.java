/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telmid;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author admin
 */
public class telmid {
    private String telmidName;
    private String telmidDOB;
    private String telmidId;
    private String zipCode;
    private static int counter=3874001;

    private CartCatalogue cartCatalogue;
    private PreviousOrders prevOrders;
    
    public telmid()
    {
        counter++;
        this.telmidId=String.valueOf(counter);
        cartCatalogue= new CartCatalogue();
        prevOrders=new PreviousOrders();
        
    }
    
    public telmid(String DOB, String Name, String zipC)
    {
        this.telmidName=Name;
        this.telmidDOB=DOB;
        counter++;
        this.telmidId=String.valueOf(counter);
        cartCatalogue= new CartCatalogue();
        prevOrders=new PreviousOrders();
        this.zipCode= zipC;
    }
    
    
    public String getCustName() {
        return telmidName;
    }

    public void setCustName(String custName) {
        this.telmidName = custName;
    }

    public String getCustDOB() {
        return telmidDOB;
    }

    public void setCustDOB(String custDOB) {
        this.telmidDOB = custDOB;
    }

    public String getCustomerId() {
        return telmidId;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public CartCatalogue getCartCatalogue() {
        return cartCatalogue;
    }

    public PreviousOrders getPrevOrders() {
        return prevOrders;
    }

    public void setCartCatalogue(CartCatalogue cartCatalogue) {
        this.cartCatalogue = cartCatalogue;
    }
    
    @Override
    public String toString()
    {
        return this.telmidName;
    }
    
    public ArrayList<Object[]> getCart()
    {
        ArrayList<Object[]> res=new ArrayList<Object[]>();
        
        for(CartProduct cp: cartCatalogue.getCartCat())
        {
            Object[] ob= new Object[2];
            ob[0]=(Object)cp.getProduct();
            //ob[0]=(Object)cp;
            ob[1]=(Object)cp;
            
            res.add(ob);
        }

        return res;
   
    }
    
    public ArrayList<Object[]> getPrevCart()
    {
        ArrayList<Object[]> res = new ArrayList<Object[]>();
        
        for(CartProduct cp: prevOrders.getCartCat())
        {
            Object[] ob= new Object[2];
            ob[0]=(Object)cp.getProduct();
            ob[1]=cp;
            //ob[1]=cp.getItemNo();
            res.add(ob);
            
        }
        return res;
   
    }

   public static Comparator<telmid> ByProducts = new Comparator<telmid>() {

        @Override
        public int compare(telmid o1, telmid o2) {
            return (int) (o1.getPrevOrders().totalProducts() - o2.getPrevOrders().totalProducts());
        }
    };
   
   public static Comparator<telmid> ByTotalCost = new Comparator<telmid>() {

        @Override
        public int compare(telmid o1, telmid o2) {
            return (int) (o1.getPrevOrders().totalPrice() - o2.getPrevOrders().totalPrice());
        }
    };
}
