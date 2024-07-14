package com.devsuperior.professional_desafio1.services;

import org.springframework.stereotype.Service;

import com.devsuperior.professional_desafio1.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		double basic = order.getBasic();
		if (basic < 100.00) {
			return 20.00;
		} else if (basic < 200.00) {
			return 12.00;
		} else {
			return 0.00;
		}
	}

}
