package br.com.generation.lacoscondicionais;

import java.util.Scanner;

public class SwitchCase01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 1� n�mero: ");
		int numero01 = sc.nextInt();
		
		System.out.println("DIgite a opera��o");
		char operacao = sc.next().charAt(0);
		
		System.out.println("Entre com 2� n�mero: ");
		int numero02 = sc.nextInt();
		
		int resultado;
		
		switch(operacao) {
			case'+':
				resultado = numero01 + numero02;
				System.out.println("A soma �: " + resultado);
			case'-':	
				resultado = numero01 - numero02;
				System.out.println("A soma �: " + resultado);
			break;
			default:
				System.out.println("Op��o invalida!");
				break;
		}
	
	}

}
