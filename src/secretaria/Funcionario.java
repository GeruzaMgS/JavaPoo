package secretaria;

import pessoa.Pessoa;

public class Funcionario extends Pessoa{
	private int matricula;
	
	
	public Funcionario (String nome, String dtNasc, int matricula) {
		super(nome, dtNasc);
		this.matricula = matricula;
	}


	public int getMatricula() {
		return matricula;
	}


		
	
}
