package fabricapizzaria;

import pizza.Pizza;
import pizza.PizzaCalabresaEstiloIbate;
import pizza.PizzaMussarelaEstiloIbate;

public class PizzariaIbate extends Pizzaria {

	
	public Pizza realizaPedido(Pizza pizza) {
		// TODO Auto-generated method stub
		return pizza;
	}


	@Override
	public Pizza criaPizza(String tipo) {

		if (tipo.equals("mussarela")){ 
			Pizza pizza = new PizzaMussarelaEstiloIbate();
			return pizza;
				
		} else if(tipo.equals("calabresa")) {
			Pizza pizza = new PizzaCalabresaEstiloIbate();
			return pizza;
		}
		
		return null;

	}
}
