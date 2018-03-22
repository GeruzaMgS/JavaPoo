/**
 * 
 */
package exemplos.heranca;

/*
 * Definição dos importes necessários
 */

/**
 * Clase Funcionario que representa uma pessoa funcionária. Herda de Pessoa
 * 
 * @author Prof. Joao Andrei
 * @since 22 de fev de 2016
 * @version 1.0.0
 * @see Pessoa
 */
public class Funcionario extends Pessoa {
	/*
	 * Variáveis de instância
	 */
	/**
	 * Variável salário
	 */
	private Double salario;
	/*
	 * Variável ponto, representa se o funcionário bateu ou ponto ou nao
	 */
	private Boolean ponto = new Boolean(false);

	/*
	 * Funções construtora
	 */
	/**
	 * Construtor padrão da classe Funcionario()
	 */
	public Funcionario() {
		System.out.println("Funcionario::Construtor");
	}

	/**
	 * Construtor da classe Funcionario()
	 */
	public Funcionario(String nome, String sexo, Double salario) {
		super(nome, sexo);
		this.salario = salario;
		System.out.println("Funcionario::Construtor(String nome, String sexo, Double salario)");
	}

	/*
	 * Métodos de acesso
	 */

	/**
	 * @return the ponto
	 */
	public Boolean getPonto() {
		System.out.println("Funcionario::getPonto()");
		return ponto;
	}

	/**
	 * @param ponto
	 *            the ponto to set
	 */
	public void setPonto(Boolean ponto) {
		System.out.println("Funcionario::setPonto(Boolean ponto): ["+ponto+"]");
		this.ponto = ponto;
	}

	/**
	 * @return the salario
	 */
	public Double getSalario() {
		System.out.println("Funcionario::getSalario()");
		return salario;
	}

	/**
	 * @param salario
	 *            the salario to set
	 */
	public void setSalario(Double salario) {
		System.out.println("Funcionario::setSalario(Double salario) salario = [" + salario + "]");
		this.salario = salario;
	}

	/*
	 * Operações da classe
	 */
	/**
	 * metodo para registrar o ponto do funcionario
	 * 
	 * @return
	 */
	public Boolean baterPonto() {
		System.out.println("Funcionario::baterPonto()");
		// ponto recebera a negacao de ponto, ou seja, se o ponto estiver batido
		// entrada (true)
		// deverá mudar para false saida e vice-versa;
		ponto = !ponto;
		return ponto;
	}

	/*
	 * metodos sobre escritos overrrides
	 */
	/**
	 * @return String - descricao da classe
	 * @override
	 */
	@Override
	public String toString() {
		String emFormaTexto = new String();

		emFormaTexto = "Funcionario.toString(): [\n";
		emFormaTexto = emFormaTexto + "\tnome: " + super.getNome() + "\n";
		emFormaTexto = emFormaTexto + "\tsexo: " + super.getSexo() + "\n";
		emFormaTexto = emFormaTexto + "\tponto: " + getPonto() + "\n";
		emFormaTexto = emFormaTexto + "\tsalario: " + getSalario() + "\n";
		emFormaTexto = emFormaTexto + "]\n";
		return emFormaTexto;
	}
}
