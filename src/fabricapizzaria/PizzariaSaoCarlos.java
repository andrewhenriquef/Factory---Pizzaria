package fabricapizzaria;

import pizza.Pizza;
import pizza.PizzaCalabresaEstiloSaoCarlos;
import pizza.PizzaMussarelaEstiloSaoCarlos;

public class PizzariaSaoCarlos extends Pizzaria{
	
	public Pizza realizaPedido(Pizza pizza) {
		// TODO Auto-generated method stub
		return pizza;
	}


	@Override
	public Pizza criaPizza(String tipo) {

		if (tipo.equals("mussarela")){ 
			Pizza pizza = new PizzaMussarelaEstiloSaoCarlos();
			return pizza;
				
		} else if(tipo.equals("calabresa")) {
			Pizza pizza = new PizzaCalabresaEstiloSaoCarlos();
			return pizza;
		}
		
		return null;

	}

	
}
