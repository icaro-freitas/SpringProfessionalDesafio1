package com.devsuperior.professional_desafio1;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.professional_desafio1.entities.Order;
import com.devsuperior.professional_desafio1.services.OrderService;

@SpringBootApplication
public class ProfessionalDesafio1Application implements CommandLineRunner {

	@Autowired
	public OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ProfessionalDesafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		final Order[] orders = { new Order(1034, 150.00, 20.0), new Order(2282, 800.00, 10.0),
				new Order(1309, 95.90, 0.0) };

		for (Order order : orders) {
			final double total = orderService.total(order);
			System.out.printf("Pedido código %d%n", order.getCode());
			System.out.printf("Valor total: R$ %.2f%n", total);
		}

	}

}
