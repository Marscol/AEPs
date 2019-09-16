package AEP2;
//Conceito(id:String, nota:Nota {entre 0.0 e 10.0}, avaliação: Avaliação {requerido}, aluno: Aluno {requerido})

public class App {

	
	public static void main(String[] args) {
		Turma esoft2019 = new Turma("Esoft2019");
		
		Aluno roberto = new Aluno("1","Roberto");
		Aluno ana = new Aluno("2", "Ana");
		
		esoft2019.adicionarAluno(roberto);
		esoft2019.adicionarAluno(ana);
		
		ana.adicionarNota(6.0);
		roberto.adicionarNota(4.5);
		imprimirTurmas(esoft2019);		

	}

	private static void imprimirTurmas(Turma esoft2019) {
		System.out.println("Turma: " + esoft2019.getNome());
///		System.out.println(" ");
		for (Aluno a : esoft2019.getAluno()) {
			System.out.println("ID: " +  a.getId());
			System.out.println("Nome: " + a.getNome());
			a.aprovacaoDoAluno(a.getNota());
			if(a.getStatus() == true) {
				System.out.println("Aluno Aprovado!");
			}
			else {
				System.out.println("Aluno Reporvado!");
			}
			System.out.println(" ");
		}
	}
}