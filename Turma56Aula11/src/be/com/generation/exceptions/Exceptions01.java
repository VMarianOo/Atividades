package be.com.generation.exceptions;

public class Exceptions01 {
	
	public static void main(String[] args) {
		
		int[] vetor = new int[4];
		System.out.println("Antes da exception");
		
		try {
		vetor[4] = 10;
		System.out.println("Ap�s a exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Existe um problema no c�digo por�m vai ficar assim mesmo");
		}
		
		//System.out.println(vetor[4]);
	}

}
