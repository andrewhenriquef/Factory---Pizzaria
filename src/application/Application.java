package application;

import fabricapizzaria.Pizzaria;
import fabricapizzaria.PizzariaIbate;
import fabricapizzaria.PizzariaSaoCarlos;
import pizza.Pizza;

public class Application {

	public static void main(String[] args) {

		Pizzaria pizzaria = new PizzariaSaoCarlos();
		Pizza pizza;
		pizza = pizzaria.criaPizza("calabresa");
		
		System.out.println(pizza.getNome());
		
		
		pizzaria = new PizzariaIbate();
		pizza = pizzaria.criaPizza("mussarela");
		
		
		
		System.out.println(pizza.getNome());
		
	}

}
