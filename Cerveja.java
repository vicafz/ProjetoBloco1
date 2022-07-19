package Projeto_I;

public class Cerveja extends Deposito {
	
	private String semAlcool;
	private String pilsen;
	private String weiss;
	private String paleAle;
	private String ale;
	
	
	
	
	public Cerveja(String nome, String marca, String fabricante, double preco, double codigoDeBarras, double temperatura, String semAlcool,
	String pilsen, String weiss, String paleAle, String ale) 
	{
		super(nome, marca, fabricante, preco, codigoDeBarras, temperatura);
		this.semAlcool = semAlcool;
		this.pilsen = pilsen;
		this.weiss = weiss;
		this.paleAle = paleAle;
		this.ale = ale;
		
	}
	
	public String getSemAlcool() {
		return semAlcool;
	}
	public void setSemAlcool(String semAlcool) {
		this.semAlcool = semAlcool;
	}
	public String getPilsen() {
		return pilsen;
	}
	public String setPilsen(String pilsen) {
		return this.pilsen = pilsen;
	}
	public String getWeiss() {	
		return weiss;
	}
	public void setWeiss(String weiss) {
		this.weiss = weiss;
	}
	public String getPaleAle() {
		return paleAle;
	}
	public void setPaleAle(String paleAle) {
		this.paleAle = paleAle;
	}
	public String getAle() {
		return ale;
	}
	public void setAle(String ale) {
		this.ale = ale;
	}
	



}
