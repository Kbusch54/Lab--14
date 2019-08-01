package co.grandcircus;

public abstract class Player  {

	private String name;
	protected Roshambo rosham;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract Roshambo generateRoshambo();

	public Player(String name) {
		super();
		this.name = name;
	}



	
	
	
		
	
	
	
}
