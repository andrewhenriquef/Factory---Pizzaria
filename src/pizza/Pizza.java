package pizza;

public abstract class Pizza {

	protected String nome;
	
	public abstract String getNome();

	public String preparar(){
		
		return "Preparando";
		
	}
	
	public String cortar(){
		
		return "Cortando";
	}
	
	public String empacotar(){
		
		return "Empacotando";
		
	}



}