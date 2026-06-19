package dev.erik.curso_java.program;

import java.util.Locale;
import java.util.Scanner;

import dev.erik.curso_java.entities.Product;

public class ProgramProduct {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.printf("Name: ");
        product.name = sc.nextLine();
        System.out.printf("Price: ");
        product.price = sc.nextDouble();
        System.out.printf("Quantity: ");
        product.quantity = sc.nextInt();

        double total = product.totalValueInStock(product.price, product.quantity);
        System.out.println(Product.productData(product.name, product.price, product.quantity, total));

        System.out.println("Enter the number of products to be added in stoxk: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        total = product.totalValueInStock(product.price, product.quantity);
        System.out.println(Product.productData(product.name, product.price, product.quantity, total));

        System.out.println("Enter the number of product to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        total = product.totalValueInStock(product.price, product.quantity);
        System.out.println(Product.productData(product.name, product.price, product.quantity, total));
        
         sc.close();            
    }
}
