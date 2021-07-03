package Aluno;

public class Vetor {
	Aluno[] alunos = new Aluno [3];
	int cont;
	
	public Vetor () {
		//int cont=0;
	}
	
	//Método para adicionar um aluno em uma lista.
	public boolean adiciona (Aluno novo) {
		if (cont < 3) {
			alunos[cont] = novo;
			cont++;
			return true;
		}
		return false;
	}
	
	//Método para buscar um aluno.
	public boolean buscar (int i) {
		if (i >= 0 && i < cont) {
			return true;
		}
		return false;
	}
	
	//Método para remover um aluno da lista.
	public boolean remove (int i) {
		return false;
	}
	
	//Método para exibir um aluno.
	public Aluno getAlunos(int i) {
		if (buscar (i)) {
			return alunos[i];
		}
		return null;
	}
	
	//Método para exibir a lista de alunos.
	public void getLista() {
		
	}
}
