package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        double valorDesconto = order.getValorBase() * (order.getDesconto() / 100);
        double frete = shippingService.calcularFrete(order);
        return order.getValorBase() - valorDesconto + frete;
    }
}
