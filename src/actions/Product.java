
package actions;
import dictonaries.Storilocations;

public class Product {
    private String name;
    private double price;
    private  Storelocation storeloc;


    public Storelocation getStoreloc() {
        return storeloc;
    }

    public Product(String name, double price, Storelocation storeloc) {
        this.name = name;
        this.price = price;
        this.storeloc = storeloc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
