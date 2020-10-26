/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author admin
 */
public class teacherCatalogue {
    private ArrayList<Notes> productCatalogue;

    public teacherCatalogue() {
        productCatalogue = new ArrayList<Notes>();
    }

    public ArrayList<Notes> getProductCatalogue() {
        return productCatalogue;
    }

    public void addProduct(Notes note) {
        this.productCatalogue.add(prod);
    }

    public void removeProduct(Notes prod) {
        this.productCatalogue.remove(prod);
    }

    public ArrayList<Notes> searchByName(String Name) {
        ArrayList<Notes> temp = new ArrayList<Notes>();

        for (Notes res : productCatalogue) {
            if (res.getProductName().equals(Name)) {
                temp.add(res);
            }
        }

        if (temp != null) {
            return temp;
        } else {
            return null;
        }
    }

    public Notes searchByNumber(String no) {
        for (Notes prod : productCatalogue) {
            if (prod.getProductNumber().equals(no)) {
                return prod;
            }
        }
        return null;
    }
    
    public ArrayList<Notes> getProductsSold () {
        if (this.getTotalSoldCount() > 0) {
            ArrayList<Notes> productsSold = new ArrayList<>();
            for (Notes p : productCatalogue) {
                if (p.getSoldNumber() > 0) {
                    productsSold.add(p);
                }
            }
            return productsSold;
        } else {
            return null;
        }
    }

    public Notes getMostProductSold() {
        if (productCatalogue.size() > 0) {
            Notes max = productCatalogue.get(0);
            for (Notes p : productCatalogue) {
                if (p.getSoldNumber() > max.getSoldNumber()) {
                    max = p;
                }
            }
            return max.getSoldNumber() == 0 ? null : max;
        } else {
            return null;
        }
    }

    public Notes getLeastProductSold() {
        if (productCatalogue.size() > 0) {
            Notes min = productCatalogue.get(0);
            for (Notes p : productCatalogue) {
                if (p.getSoldNumber() < min.getSoldNumber()) {
                    min = p;
                }
            }
            return min.getSoldNumber() == 0 ? null : min;
        } else {
            return null;
        }
    }

    public int getTotalSoldCount() {
        int total = 0;
        for (Notes p : productCatalogue) {
            total += p.getSoldNumber();
        }
        return total;
    }
    
     public int getTotalSoldPrice() {
        int total = 0;
        for (Notes p : productCatalogue) {
            total += (p.getSoldNumber()*p.getPrice());
        }
        return total;
    }

    public static Comparator<Notes> ByProductsSold = new Comparator<Notes>() {
        @Override
        public int compare(Notes n1, Notes n2) {
            return (int) (p1.getSoldNumber() - p2.getSoldNumber());
        }

    };

    public static Comparator<Notes> BySalePrice = new Comparator<Notes>() {
        @Override
        public int compare(Notes p1, Notes p2) {
            return (int) ((p1.getSoldNumber() * p1.getPrice()) - (p2.getSoldNumber() * p2.getPrice()));
        }
    };
}
