package Aluno;

public class Aluno{
	String Nome;
	double nota;
	
	public Aluno(String Nome, double nota) {
		setNome(Nome);
		setNota(nota);
	}
	public String getNome () {   //M�todo para obter um nome.
		return Nome;
	}
	public void setNome (String nome) {  //M�todo para fixar um nome obtido.
		this.Nome = nome;
	}
	public double getNota () {    //M�todo para obter uma nota.
		return nota;
	}
	public void setNota(double nota) {   //M�todo para fixar uma nota obtida.
		this.nota = nota;
	}
	
	public String toString() {
		return "(Nome: "+getNome()+", "+getNota()+")";  //M�todo para retornar um nome e uma nota obtida.
	}
}