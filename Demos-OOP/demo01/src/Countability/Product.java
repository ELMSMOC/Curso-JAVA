package Countability;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private String name;
    private String description;
    private double prize;
    private int stock;

    private static List<Product> productList = new ArrayList<Product>();


    private void printName(){
        for (Product product : productList) {
            System.out.println("Nombre: " + product.name +
                               ", Descripción: " + product.description +
                               ", Precio: " + product.prize +
                               ", Stock: " + product.stock);
        }
    }
  
    public Product (String name, String description, double prize, int stock){
        this.name = name;
        this.description = description;
        this.prize = prize;
        this.stock = stock;
        productList.add(this);
        this.printName();
    }

}
