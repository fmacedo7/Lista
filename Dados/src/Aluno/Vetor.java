package Aluno;

public class Vetor{
	
	Aluno [] alunos = new Aluno [3];
	int cont;
	
	public Vetor () {
		int cont=0;
	}
	public boolean adiciona (Aluno novo) {
		if (cont < 3) {
			Aluno[cont] = novo;
			cont++;
			return true;
		}
		return false;
	}
	public boolean remove (int i) {
		return false;
	}
	public Aluno getAlunos(int i) {
		
	}
	public void getLista() {
		
	}
}