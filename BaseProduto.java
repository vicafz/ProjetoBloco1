package ProjetoBloco1;

public abstract class BaseProduto {
	
	private String nome;
	private String marca;
	private String fabricante;
	private double preco;
	private double codigoDeBarras;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getCodigoDeBarras() {
		return codigoDeBarras;
	}
	
	public void setCodigoDeBarras(double codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}
	
	public abstract void imprimirInfo(); 
	public abstract void taGelada();
}
	
	
