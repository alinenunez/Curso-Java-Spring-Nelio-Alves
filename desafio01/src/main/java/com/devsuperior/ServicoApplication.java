package com.devsuperior;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class ServicoApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(ServicoApplication.class);

    private OrderService orderService;

    public ServicoApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServicoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Digite o codigo do pedido:");
        int codigo = sc.nextInt();

        System.out.println("Digite o valor basico do pedido:");
        double valorBase = sc.nextDouble();

        System.out.println("Digite o percentual de desconto:");
        double desconto = sc.nextDouble();

        Order order = new Order(codigo, valorBase, desconto);
        double valorTotal = orderService.total(order);

        logger.info("Pedido codigo {}", order.getCodigo());
        logger.info("Valor total: R$ {}", String.format("%.2f", valorTotal));

        sc.close();
    }
}