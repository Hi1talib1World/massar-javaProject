/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class teacher {
     private String teacherName;
    private String zipCode;
    private ProductCatalogue productCatalogue;
    private String teacherNumber;
    private static int counter = 345001;
    private double earnings;
    private ArrayList<CartProduct> productSoldList;
    private teacherInvoiceList retailerInvoiceList;
    
    
    public teacher()
    {
        counter++;
        this.productCatalogue = new ProductCatalogue();
        this.productSoldList = new ArrayList<>();
        this.teacherNumber = String.valueOf(counter);
        this.retailerInvoiceList = new teacherInvoiceList();
    }

    public String getRetailerNumber() {
        return teacherNumber;
    }

    public String getRetailerName() {
        return teacherName;
    }

    public void setRetailerName(String retailerName) {
        this.teacherName = retailerName;
    }

    public ProductCatalogue getProductCatalogue() {
        return productCatalogue;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public ArrayList<CartProduct> getProductSoldList() {
        return productSoldList;
    }

    public teacherInvoiceList getRetailerInvoiceList() {
        return retailerInvoiceList;
    }

    public void addToProductSoldList(CartProduct cp) {
        this.productSoldList.add(cp);
    }

    public double getEarnings() {
        return earnings;
    }
    
    public teacherInvoice genrateInvoice() {
        if (this.productSoldList.size() > 0) {
            teacherInvoice ri = retailerInvoiceList.addInvoice();
            ri.addCartProductSold(this.getProductSoldList());
            this.productSoldList.clear();
            ri.setTotalPriceToBePaid(ri.getCartProductsSold().getCartTotal());
            return ri;
        } else {
            return null;
        }
    }
    
    public boolean payteacher (String invoiceNumber, Double amount) {
        if (this.retailerInvoiceList.pay(invoiceNumber, amount)) {
            this.earnings += amount;
            return true;
        } else {
            return false;
        }
    } 
    
    @Override
    public String toString()
    {
        return this.teacherName;
    }
}
