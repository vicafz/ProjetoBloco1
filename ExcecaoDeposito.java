package Projeto_I;

public class ExceçãoDeposito {

	/*	A exceção foi feita para criar um padrão nos códigos das bebidas.
	Evitando, assim, erros e divergências.
	
	O padrão definido é: usar no cadastro todas as letras minúsculas.	*/
	
	public static void main(String[] args) {
		
		String produtoUpperCase = null;
		String produtoPadrao = null;
		
		try {
			produtoPadrao = produtoUpperCase.toLowerCase();
		}
		
		catch (NullPointerException e) {
			System.out.println("O produto não foi cadastrado de acordo com o padrão. O sistema converteu o arquivo no formato adequado.");
		}
		
		System.out.println("Nome errado: "+produtoUpperCase+" foi alterado para: "+produtoPadrao);
		
		
		
	}

}
