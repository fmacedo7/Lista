package Aluno;

public class Aluno{
	String Nome;
	double nota;
	
	public Aluno(String Nome, double nota) {
		setNome(Nome);
		setNota(nota);
	}
	public String getNome () {   //Método para obter um nome.
		return Nome;
	}
	public void setNome (String nome) {  //Método para fixar um nome obtido.
		this.Nome = nome;
	}
	public double getNota () {    //Método para obter uma nota.
		return nota;
	}
	public void setNota(double nota) {   //Método para fixar uma nota obtida.
		this.nota = nota;
	}
	
	public String toString() {
		return "(Nome: "+getNome()+", "+getNota()+")";  //Método para retornar um nome e uma nota obtida.
	}
}