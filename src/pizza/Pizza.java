package pizza;

public abstract class Pizza {

	protected String nome;
	
	public abstract String getNome();

	public abstract void preparar();
	
	public abstract void cortar();
	
	public abstract void empacotar();



}