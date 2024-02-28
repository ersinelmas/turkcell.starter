package org.example;

// Access Modifiers
public class Product {
    // Attributes
    private String name;
    private double unitPrice;
    private boolean isDiscounted;
    private double discountRate;

    // NoArgs Constructor
    public Product() {
        System.out.println("NoArgs Constructor is called!");
    }
    // AllArgs Constructor
    public Product(String name, double unitPrice, boolean isDiscounted, double discountRate) {
        // this refers to the object that is created
        this.name = name;
        this.unitPrice = unitPrice;
        this.isDiscounted = isDiscounted;
        this.discountRate = discountRate;
        System.out.println("AllArgs Constructor is called!");
    }

    // Encapsulation
    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 2) {
            System.out.println("Name must be at least 2 characters!");
        } else {
            this.name = name;
        }
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public boolean isDiscounted() {
        return isDiscounted;
    }

    public void setDiscounted(boolean discounted) {
        isDiscounted = discounted;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public void buy() {
        System.out.println(name+ " is bought!");
    }
}
