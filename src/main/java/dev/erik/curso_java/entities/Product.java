package dev.erik.curso_java.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;
    public int add;
    public int remove;

    public double totalValueInStock(double price, int quantity){
        double totalValue = quantity * price;
        return totalValue;
    }

    public int addProducts(int quantity, int add){   
        quantity = quantity + add;
        return quantity;
    }

    public int removeProducts(int quantity, int remove){
        quantity = quantity - remove;
        return quantity;
    }

    public static String message(String name, double price, int quantity, double totalValue){
        return String.format("Product data: %s, %.2f, %d units, Total: %.2f", name, price, quantity, totalValue );
    }
}
