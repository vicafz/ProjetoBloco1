package Projeto_I;

public class Refrigerante extends Deposito{
	
	private String laranjada;
	private String guarana;
	private String limonada;
	private String uva;
	private String cola;
	
	
	
	public Refrigerante(String nome, String marca, String fabricante, double preco, double codigoDeBarras, double temperatura,
	String laranjada, String guarana, String limonada, String uva, String cola) {
		super(nome, marca, fabricante, preco, codigoDeBarras, temperatura);
		this.laranjada = laranjada;
		this.guarana = guarana;
		this.limonada = limonada;
		this.uva = uva;
		this.cola = cola;
		
		
		
	}
	public String getLaranjada() {
		return laranjada;
	}
	public void setLaranjada(String laranjada) {
		this.laranjada = laranjada;
	}
	public String getGuarana() {
		return guarana;
	}
	public String setGuarana(String guarana) {
		return this.guarana = guarana;
	}
	public String getLimonada() {
		return limonada;
	}
	public void setLimonada(String limonada) {
		this.limonada = limonada;
	}
	public String getUva() {
		return uva;
	}
	public void setUva(String uva) {
		this.uva = uva;
	}
	public String getCola() {
		return cola;
	}
	public void setCola(String cola) {
		this.cola = cola;
	}
	
	
	
	

}
