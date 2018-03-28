package secretaria;

import pessoa.Pessoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Funcionario extends Pessoa {
	private int matricula;
	private Date dtNasc;

	
	public Funcionario(String nome, Date dtNasc, int matricula) {
		super(nome, dtNasc);
		this.matricula = matricula;
	}

	public boolean baterPonto(Date dtHora) {
		System.out.println("Bater ponto do Funcionario \t Matricula: " + this.matricula + "\t" + dtHora.toString());
		return true;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	

}
