package entities;

public class Aluno {
	public String name;
	public Double nota1, nota2, nota3;
	
	public Double NotaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String Resultado() {
		if (NotaFinal()>= 60) {
			return "Aprovado";
		}else {
			return "Reprovado. Faltam " + (100 - NotaFinal()) + " pontos para a aprovação";
		}
	}
	
	public String toString() {
		return "Aluno: " + name + Resultado();
	}
}
