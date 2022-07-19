package Projeto_I;

public class Vinho extends Deposito {
	private String seco;
	private String tinto;
	private String suave;
	private String branco;
	
	
	public Vinho(String nome, String marca, String fabricante, double preco, double codigoDeBarras, double temperatura, String seco,
			String tinto, String suave, String branco) 
	
	{
		super(nome, marca, fabricante, preco, codigoDeBarras, temperatura);
		this.seco = seco;
		this.tinto = tinto;
		this.suave = suave;
		this.branco = branco;
	}


	public String getSeco() {
		return seco;
	}


	public void setSeco(String seco) {
		this.seco = seco;
	}


	public String getTinto() {
		return tinto;
	}


	public String setTinto(String tinto) {
		return this.tinto = tinto;
	}


	public String getSuave() {
		return suave;
	}


	public void setSuave(String suave) {
		this.suave = suave;
	}


	public String getBranco() {
		return branco;
	}


	public void setBranco(String branco) {
		this.branco = branco;
	}
	
	
	
	
}
