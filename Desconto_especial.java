package Projeto_I;

public class Desconto_especial extends Desconto_A{

	public Desconto_especial(double tipo) {
		super(tipo);
		
	}
	
	@Override
	public void desconto(double numero) {
			int totalValue=0;
			if(totalValue>=100 && totalValue<=150) {
				System.out.println("Cliente recebe 20% de desconto");
			}
			if(totalValue>=200) {
				System.out.println("Cliente recebe 20% de desconto + um brinde");
			}	
	}


}
