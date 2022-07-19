package Projeto_I;

public abstract class Desconto_A {
private double tipo;
	
	public Desconto_A(double tipo) {
		this.tipo = tipo;
	}
	
	abstract public void desconto(double numero);

	public double getTipo() {
		return tipo;
	}

	public void setTipo(double tipo) {
		this.tipo = tipo;
	}
}
