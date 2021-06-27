package Program;

public class Aluno {
	public String Nome;
	public double N[] = new double[1];

	public String toString() {
		String out = "";
		out += "Nome(" + Nome + ") ";
		out += "Nota(" + N + ") ";
		return out;
	}
}

public class Vetor{
	
	Aluno aluno[] = new Aluno[3];
	
	aluno[0] = new Aluno("Eugeo", 8.5);
	aluno[1] = new Aluno("Ishtar", 4);
	aluno[2] = new Aluno("Sariel", 7);
	 	
	for (int i = 0; i < aluno.length; i++) {
		System.out.println(aluno[i]);
	}
	
	public Aluno(String Nome, double N1) {
		this.Nome = Nome;
		this.N[0] = N1;
	}
	
	public void setNota(int id, double N) {
		if ((id < 1) || (id > this.N.length)) return;
		this.N[id] = N;
	}
	
	public double getNota(int id) {
		if ((id < 1) || (id > N.length)) return 0;
		return N[id];
	}
}