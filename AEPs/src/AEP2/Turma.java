package AEP2;

import java.util.ArrayList;
import java.util.List;
public class Turma {
	private final String nome;
	private List<Aluno> alunos = new ArrayList<Aluno>(); 
	
	public Turma (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adicionarAluno(Aluno aluno) {
		if(!this.alunos.contains(aluno)) {
			this.alunos.add(aluno);
			aluno.setTurma(this);
		}
	}
	
	public void removerAluno(Aluno aluno) {
		this.alunos.remove(aluno);
	}
	
	public List<Aluno> getAluno(){
		return alunos;
	}
}

