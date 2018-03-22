package exemplos.heranca;
/*
 * Definição dos importes necessários
 */

/**
 * Classe que representa um diretor. Herda da classe Funcionario()
 * 
 * @author Prof. Joao Andrei
 * @since 29 de fev de 2016
 * @version 1.0.0
 * @see Funcionario
 */
public class Diretor extends Funcionario {
	/*
	 * Variáveis de instância
	 */

	/*
	 * String senha
	 */
	private String senha = null;

	/*
	 * Funções construtora
	 */
	/**
	 * Classe contrutora padrão da classe Diretor()
	 */
	public Diretor() {
		System.out.println("Diretor::Construtor");
	}
	
	/**
	 * Classe contrutora padrão da classe Diretor()
	 */
	public Diretor(String nome, String sexo, Double salario, String senha) {
		super(nome, sexo, salario);
		this.senha = senha;
		
		System.out.println("Diretor::Construtor(String nome, String sexo, Double salario, String senha)");
		
		
	}
	/*
	 * Métodos de acesso
	 */

	/**
	 * @return the senha
	 */
	public String getSenha() {
		System.out.println("Diretor::getSenha()");
		return senha;
	}

	/**
	 * @param senha
	 *            the senha to set
	 */
	public void setSenha(String senha) {
		System.out.println("Diretor::setSenha(String senha) senha = [" + senha + "]");
		this.senha = senha;
	}

	/*
	 * Operações da classe
	 */

	// nao tem operacoes

	/*
	 * metodos sobre escritos overrrides
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see opet.aula03.heranca.Funcionario#toString()
	 */
	@Override
	public String toString() {
		String emFormaTexto = new String();

		emFormaTexto = "Diretor.toString(): [\n";
		emFormaTexto = emFormaTexto + "\tnome: " + super.getNome() + "\n";
		emFormaTexto = emFormaTexto + "\tsexo: " + super.getSexo() + "\n";
		emFormaTexto = emFormaTexto + "\tponto: " + super.getPonto() + "\n";
		emFormaTexto = emFormaTexto + "\tsalario: " + super.getSalario() + "\n";
		emFormaTexto = emFormaTexto + "\tsenha: " + getSenha() + "\n";
		emFormaTexto = emFormaTexto + "]\n";
		return emFormaTexto;
	}

}
