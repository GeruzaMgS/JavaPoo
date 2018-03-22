/**
 * 
 */
package exemplos.heranca;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Defini��o dos importes necess�rios
 */

/**
 * @author Prof. Joao Andrei
 * @since 22 de fev de 2016
 * @version 1.0.0
 * 
 */
public class Pessoa {
	/*
	 * Vari�veis de inst�ncia
	 */
	/**
	 * variavel idPessoa
	 */
	private Integer idPessoa;

	/**
	 * variavel nome
	 */
	private String nome;
	/**
	 * variavel sexo
	 */
	private String sexo;

	/**
	 * variavel data de nascimento
	 */
	private Date dob;

	/*
	 * Fun��es construtora
	 */

	/**
	 * Construtor padr�o da classe Pessoa, sem passagem de par�metros
	 */
	public Pessoa() {
	}
	
	
	/**
	 * 
	 * @param nome
	 * @param sexo
	 */
	public Pessoa(String nome, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}


	/**
	 * @param idPessoa
	 * @param nome
	 * @param sexo
	 * @param dob
	 */
	public Pessoa(Integer idPessoa, String nome, String sexo, Date dob) {
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.sexo = sexo;
		this.dob = dob;
	}

	/*
	 * M�todos de acesso
	 */

	/**
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * M�todo respons�vel por atribuir dados ao campo/atributo nome da pessoa.
	 * 
	 * @param nome
	 *            - String - atributo passado para setar o nome da pessoa.
	 * @author Prof. Joao Andrei
	 * @since 29-02-2016
	 * @return void
	 * 
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * 
	 * @return
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo
	 *            the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;

	}

	/**
	 * @return the idPessoa
	 */
	public Integer getIdPessoa() {
		return idPessoa;
	}

	/**
	 * @param idPessoa
	 *            the idPessoa to set
	 */
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob
	 *            the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/*
	 * Opera��es da classe
	 */

	/*
	 * metodos sobre escritos overrrides
	 */
	/**
	 * 
	 * @return String - descricao da classe
	 * @see java.lang.Object#toString()
	 * @override
	 */
	@Override
	public String toString() {
		String emFormaTexto = new String();
		emFormaTexto = "Pessoa.toString(): [\n";
		emFormaTexto = emFormaTexto + "\tidPessoa: [" + getIdPessoa() + "]\n";
		emFormaTexto = emFormaTexto + "\tnome: [" + getNome() + "]\n";
		emFormaTexto = emFormaTexto + "\tsexo: [" + getSexo() + "]\n";
		emFormaTexto = emFormaTexto + "\tdob: [" + new SimpleDateFormat().format(getDob()) + "]\n";
		emFormaTexto = emFormaTexto + "]";
		return emFormaTexto;
	}
}