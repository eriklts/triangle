package dev.erik.curso_java.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(double price, int quantity){
        return price * quantity;  
    }

    public void addProducts(int quantity){   
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;  
    }

    public static String message(String name, double price, int quantity, double totalValue){
        return String.format("Product data: %s, %.2f, %d units, Total: %.2f", name, price, quantity, totalValue );
    }

}
