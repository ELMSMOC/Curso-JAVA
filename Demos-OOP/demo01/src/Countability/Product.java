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

    
    public static void prepareProductList(){
        Product shocks = new Product("Calcetines", "Xl, Lana", 9.3, 4);
        Product coat = new Product("Abrigo", "L, Algodon", 3.3, 3);
        Product skirt = new Product("Falda", "S, Sintetico", 5.8, 12);
        Product shirt = new Product("Camiseta", "XXS, Algodon", 13.99, 13);
        Product scarf = new Product("Bufanda", "S, Sintetico", 8.2, 4);
        Product trousers = new Product("Pantalon", "XXS, Lana", 3.3, 3);
    }


    public static void printProductNameList(){
        int i = 1;
        for (Product product : productList) {
            String message ="(%s) %s %s";
                System.out.println(message.formatted(i++,product.name, product.description));
        }
    }

    public static int getDataProduct(){
        String productInput = getScanProduct();
        int i = 0;
        for (Product product : productList) {
            String name = product.name.toLowerCase();

            if (name.contains(productInput.toLowerCase())){
                getCountProduct(product.name, product.prize);
                break;
            }
            i++;
        }
        return i;
    }

    // Son parte de la funcion de arriba
            public static String getScanProduct(){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Que producto necesita?");
                String stringInput = scanner.nextLine();
                return stringInput;
            }

            public static double getCountProduct(String name, double prize){
                System.out.println("Que cantidad quieres de " + name);
                Scanner scanner = new Scanner(System.in);
                int count = scanner.nextInt();
                double result = count * prize;
                System.out.println(result);
                return result;
            }
  
    public Product (String name, String description, double prize, int stock){
        this.name = name;
        this.description = description;
        this.prize = prize;
        this.stock = stock;
        productList.add(this);
    }

}
