package com.cdsb.project;

import com.cdsb.project.entities.Product;
import com.cdsb.project.repositories.ProductsInMemoryRepo;

public class ProductsApp {

    public static void main(String[] args) {

        try {
            ProductsInMemoryRepo repo = new ProductsInMemoryRepo();
            System.out.println(
                    repo.readAll());
            repo.create(new Product(repo.generateId(),"Mouse", 30, 10));
            repo.create(new Product(repo.generateId(), "Keyboard", 130, 10));
            System.out.println(
                    repo.readAll());

            System.out.println("=".repeat(50));
            System.out.println(
                    repo.readById(2));

            repo.deleteById(1);
            System.out.println(
                    repo.readAll());
            repo.updateById(new Product(2, "Keyboard", 150, 6));
            System.out.println(
                    repo.readAll());
            // Errores
            //repo.create(new Product(2, "IPad", 1300, 10));
            // repo.deleteById(1);
            // System.out.println(
            //         repo.readById(1));

        } catch (Exception e) {
            System.err.println(e.getMessage());

        }
    }

}
