package br.com.generatio.lacowhile;

import java.util.Scanner;

public class while03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		
		while(numero != 10) {
			
			System.out.println("Digite um n�mero: ");
			numero = sc.nextInt();
			
			if(numero == 10) {
				System.out.println("Voc� acertou!!! ");
			}
			else {
				System.out.println("Voc� errou! Tente novamente.");
			}
			
			numero++;
			
		}
		
		sc.close();

	}

}
