package br.com.generation.lacodowhile;

import java.util.Scanner;

public class Dowhile02 {

	public static void main(String[] args) {
		
		double a, soma = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um n�mero para a soma e zero pra sair: ");
			a = sc.nextDouble();
			soma += a;
			
		}while(a != 0.0);{
			
			System.out.println("A soma dos n�mero �: " + soma);
			
			
		}
		
		sc.close();
		
	}

}
