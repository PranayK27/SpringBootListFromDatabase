package com.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.demo.services.ProductService;
import com.demo.services.ProductServiceImpl;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = { "com.demo.repositories" })
@ComponentScan("com.demo")
@PropertySource("classpath:application.properties")
public class JPAConfiguration {

    @Bean
    public ProductService productService() {
        return new ProductServiceImpl();
    }

}
