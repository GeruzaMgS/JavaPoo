package pessoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {

	private String nome;
	private Date dtNasc;

	public Pessoa(String nome, Date dtNasc) {
		this.nome = nome;
		this.dtNasc = dtNasc;

	}

	public String getNome() {
		return nome;
	}

	public Date getDtNasc() {
		return dtNasc;
	}
	

}
