package br.com.generation.collections2;

public class Aulas {

	private String titulo;
	private int tempo;

	public Aulas(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public String toString() {
		return"Aula: " + this.titulo + " | " + this.tempo + " minutos";
		
		
	}

}
