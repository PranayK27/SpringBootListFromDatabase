package com.demo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.demo.entities.Product;
import com.demo.JPAConfiguration;
import com.demo.services.ProductService;

public class Demo {

    public static void main(String[] args) {
        try {
            AbstractApplicationContext context = new AnnotationConfigApplicationContext(JPAConfiguration.class);
            ProductService productService = context.getBean(ProductService.class);

            for (Product product : productService.findAll()) {
                System.out.println("Id: " + product.getId());
                System.out.println("Name: " + product.getName());
                System.out.println("Price: " + product.getPrice());
                System.out.println("========================");
            }

            context.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
