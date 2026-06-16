package dev.erik.curso_java;

import java.util.Locale;
import java.util.Scanner;

import dev.erik.curso_java.entities.Product;

public class ProgramTwo {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        product.name = sc.nextLine();
        product.price = sc.nextDouble();
        product.quantity = sc.nextInt();

        double total = product.totalValueInStock(product.price, product.quantity);
        System.out.println(Product.message(product.name, product.price, product.quantity, total));

        System.out.println("Enter the number of products to be added in stoxk: ");
        product.add = sc.nextInt();
        product.quantity = product.addProducts(product.quantity, product.add);
        total = product.totalValueInStock(product.price, product.quantity);
        System.out.println(Product.message(product.name, product.price, product.quantity, total));

         System.out.println("Enter the number of product to be removed in stock: ");
         product.remove = sc.nextInt();
         product.quantity = product.removeProducts(product.quantity, product.remove);
         total = product.totalValueInStock(product.price, product.quantity);
         System.out.println(Product.message(product.name, product.price, product.quantity, total));

         sc.close();    
    }
}
