package Projeto_I;

public class Agua extends Deposito{
	private boolean gas;
	private boolean sabor;
	public Agua(boolean gas, boolean sabor)
	
	{
		super();
		this.gas = gas;
		this.sabor = sabor;
	}
	
	
	public boolean isGas() {
		return gas;
	}
	public void setGas(boolean gas) {
		this.gas = gas;
	}
	public boolean isSabor() {
		return sabor;
	}
	public void setSabor(boolean sabor) {
		this.sabor = sabor;
	}
	
	
	
	
}
