package Program;

public class Aluno {
	public String Nome;
	double N;
	
	public Aluno(String Nome, double N) {
		this.Nome = Nome;
		this.N = N;
	}
	public double getNota() {
		return N;
	}
	public void setNota(int id, double N) {
		this.N = N;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(int id) {
		this.Nome = Nome;
	}
	
	public String toString() {
		String out = "";
		out = "(Nome: "+ Nome +", N: "+ N +")";
		return out;
	}

public class Vetor {
	public void getNota(int id, double N) {
		if ((id < 1) || (id > this.N.length)) return;
		this.N = N;
	}
	public double getNota(int id) {
		if ((id < 1) || (id > N.length)) return 0;
		return N;
	}
}
