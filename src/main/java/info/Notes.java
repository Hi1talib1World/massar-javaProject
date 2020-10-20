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
public class Notes {
    private String notesName;
    private String notesNumber;
    private static int counter = 100001;
    private int price;
    private int availableUnits;
    private int sold = 0;
    

    public Notes(String prodName, int price, int availableUnits) {
        counter++;
        this.notesNumber = String.valueOf(counter);
        this.notesName = prodName;
        this.price = price;
        this.availableUnits = availableUnits;
    }

    public Notes() {
        counter++;
        this.notesNumber = String.valueOf(counter);

    }

    public int getSoldNumber() {
        return sold;
    }

    public void sold(int qty) {
        this.sold += qty;
    }

    public String getProductName() {
        return notesName;
    }

    public void setProductName(String productName) {
        this.notesName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductNumber() {
        return notesNumber;
    }

    public int getAvailableUnits() {
        return availableUnits;
    }

    public void setAvailableUnits(int availableUnits) {
        this.availableUnits = availableUnits;
    }

    @Override
    public String toString() {
        return this.notesName;
    }
}
