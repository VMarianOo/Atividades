package br.com.generation.operadoreslogicos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		
		//and --> e --> && ----------> duas compara��es, ambas compara��es devem ser verdadeiras
		int idade = 20;
		boolean precisaVotar = idade >= 18 && idade <70;
		System.out.println(precisaVotar);
		/*or  --> ou--> || ----------> 
		xor --> ou exclusivo - > ^
		not --> nega��o -------> !*/

	}

}
