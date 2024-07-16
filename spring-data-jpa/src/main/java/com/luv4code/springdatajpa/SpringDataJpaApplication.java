package com.luv4code.springdatajpa;

import com.luv4code.springdatajpa.orderentity.Order;
import com.luv4code.springdatajpa.productentity.Product;
import com.luv4code.springdatajpa.orderrepository.OrderRepository;
import com.luv4code.springdatajpa.productrepository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringDataJpaApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringDataJpaApplication.class);

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        log.info("------ started inserting the product data ------");

        Product hpProduct = Product.builder().id(1).name("HP-Laptop").price(200000.00).build();
        productRepository.save(hpProduct);

        log.info("------ started inserting the order data ------");
        Order order = Order.builder().orderId(101).orderFrom("Madhava P").orderDate(LocalDate.now()).build();
        orderRepository.save(order);

        log.info("------ Insertion Completed ------");
    }
}
