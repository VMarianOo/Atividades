package br.com.generation.collections2;

import java.util.ArrayList;

public class TestaAula {

	public static void main(String[] args) {
		
		Aulas a1 = new Aulas("Postugu�s", 60);
		Aulas a2 = new Aulas("Matem�tica", 90);
		Aulas a3 = new Aulas("Hist�ria", 120);
		
		ArrayList<Aulas> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		for(Aulas i: aulas) {
			System.out.println(i);

		}
	}

}
