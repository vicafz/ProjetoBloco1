package Projeto_I;

public class Deposito {
	
	private String nome;
	private String marca;
	private String fabricante;
	private double preco;
	private double codigoDeBarras;
	private double temperatura;
	
	public Deposito(String nome, String marca,String fabricante,double preco,double codigoDeBarras, double temperatura)
	{
		this.nome=nome;
		this.marca=marca;
		this.fabricante=fabricante;
		this.preco=preco;
		this.codigoDeBarras=codigoDeBarras;
		this.temperatura=temperatura;

	}
	
	public void imprimirInfo() {
		System.out.println("\nPedido da bebiba "+nome+", da marca "+marca+" e fabricante "+fabricante+
				", tem o preco R$ "+preco+", e codigo de barras "+codigoDeBarras+".");
	}
	
	public void taGelada() {
		if(this.temperatura>=2 && this.temperatura<=6 ){
			System.out.println("A bebida esta gelada, temperatura"+temperatura);
		}else{
			System.out.println("A bebida esta quente, temperatura"+temperatura);
			}
	}
	

}
