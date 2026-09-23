package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double calcularFrete(Order order) {
        double valorBase = order.getValorBase();
        if (valorBase < 100.0) {
            return 20.0;
        } else if (valorBase < 200.0) {
            return 12.0;
        } else {
            return 0.0;
        }
    }
}
