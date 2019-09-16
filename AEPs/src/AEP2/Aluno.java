package AEP2;
//Conceito(id:String, nota:Nota {entre 0.0 e 10.0}, avaliação: Avaliação {requerido}, aluno: Aluno {requerido})

public class Aluno {
	private final String id;
	private final String nome;
	private double nota;
	private boolean status;
	private Turma turma;
	
	public Aluno (String id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public void adicionarNota(double nota){
		this.setNota(nota);
	}
	
	
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
	public Turma getTurma () {
		return this.turma;
	}
	
	public void setTurma(Turma turma) {
		if(this.turma != null && this.turma != turma) {
			this.turma.removerAluno(this);
		}
		this.turma = turma;
		this.turma.adicionarAluno(this);
	}


	public double getNota() {
		return nota;
	}



	public void setNota(double nota) {
		this.nota = nota;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void aprovacaoDoAluno(double nota) {
		if(this.nota >= 6.0) {
			this.status = true;
		}
	}
	
}

