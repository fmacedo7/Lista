package Aluno;

public class Aluno {
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
		
	public static void main(String[] args) {
		Aluno novo = new Aluno ("Adão", 10.0);
		Aluno novo1 = new Aluno ("Eva", 9.0);
		Aluno novo2 = new Aluno ("Abel", 8.9);
		
		Vetor alunos = new Vetor();
		alunos.adiciona(novo);
		alunos.adiciona(novo1);
		alunos.adiciona(novo2);
	}
}
