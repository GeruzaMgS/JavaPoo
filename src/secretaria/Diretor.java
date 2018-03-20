package secretaria;

import java.util.Date;

public class Diretor extends Funcionario {

	public Diretor(String nome, Date dtNasc, int matricula) {
		super(nome, dtNasc, matricula);

	}

	public boolean baterPonto(Date dtHora) {
		System.out.println("Bater ponto do Diretor \t\t Matricula: " + getMatricula() + "\t" + dtHora.toString());
		return true;
	}

}
