package br.com.generation.lacodowhile;

import java.util.Scanner;

public class Dowhile03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		do {
			
			System.out.println("Digite o 1� n�mero: ");
			int numero1 = sc.nextInt();
					
			System.out.println("Digite o 2� n�mero: ");
			int numero2 = sc.nextInt();
			
			if(numero2 == 0 || numero1 == 0) {
				continue; // Vai continuar mesmo que o erro aconte�a
				//break;// bloqueia a instru��o do while
			}
			
			
			System.out.println((i+1) + "� resultado: " + numero1 + "/" + numero2 + " �: " + (numero1/numero2) + "\n");
					
			i++;
					
		}while(i <= 10);
		
		System.out.println("FIm do sistema. ");

		sc.close();
	}

}
