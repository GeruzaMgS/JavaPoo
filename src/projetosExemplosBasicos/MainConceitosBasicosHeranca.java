import exemplos.heranca.Diretor;
import exemplos.heranca.Pessoa;
import exemplos.utilitario.Utilitario;

/**
 * 
 */

/**
 * Classe para testar conceitos de heranca
 * 
 * @author Prof. Joao Andrei
 * @since 7 de mar de 2016
 * @version 1.0.0
 * 
 */
public class MainConceitosBasicosHeranca {

	/*
	 * atributos da classe
	 */

	/*
	 * metodo construtor
	 */
	/**
	 * construtor padrao da classe
	 */
	public MainConceitosBasicosHeranca() {
	}

	/*
	 * acoes da classe
	 */
	/**
	 * metodo main para chamar a classe
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * declaracao das variaveis do metodo
		 */

		/*
		 * variaveis de escopo dentro do metodo
		 */
		String entradaNome = null;
		String entradaSexo = null;
		Double entradaSalario = null;
		String entradaSenha = null;

		
		
		Pessoa objPessoa = null;
		Pessoa objPessoaOutra = null;

		Diretor objDiretor = null;
		Diretor objDiretorOutra = null;

		/*
		 * corpo do metodo
		 */

		System.out.println("-------------------------------");
		System.out.println("EXEMPLO PESSOA");
		
		System.out.println("Digite o nome da pessoa: ");
		entradaNome = Utilitario.receberTextoDoTeclado();

		System.out.println("Digite o sexo da pessoa: ");
		entradaSexo = Utilitario.receberTextoDoTeclado();

		System.out.println("Texto digitado nome da pessoa: " + entradaNome);
		System.out.println("Texto digitado Sexo da pessoa: " + entradaSexo);

		objPessoa = new Pessoa();

		objPessoa.setNome(entradaNome);
		objPessoa.setSexo(entradaSexo);

		System.out.println(objPessoa.toString());

		objPessoaOutra = new Pessoa(entradaNome, entradaSexo);
		System.out.println(objPessoaOutra.toString());

		
		
		System.out.println("-------------------------------");
		System.out.println("EXEMPLO DIRETOR");

		System.out.println("Digite o nome do diretor: ");
		entradaNome = Utilitario.receberTextoDoTeclado();

		System.out.println("Digite o sexo do diretor: ");
		entradaSexo = Utilitario.receberTextoDoTeclado();
		
		
		System.out.println("Digite o salario do diretor: ");
		entradaSalario = Utilitario.receberDoubleDoTeclado();
		
		System.out.println("Digite a senha do diretor: ");
		entradaSenha = Utilitario.receberTextoDoTeclado();

		System.out.println("Texto digitado nome do diretor: " + entradaNome);
		System.out.println("Texto digitado Sexo do diretor: " + entradaSexo);
		System.out.println("Texto digitado Salario do diretor: " + entradaSalario.toString());
		System.out.println("Texto digitado Senha do diretor: " + entradaSenha);

		objDiretor = new Diretor();

		objDiretor.setNome(entradaNome);
		objDiretor.setSexo(entradaSexo);
		objDiretor.setSalario(entradaSalario);
		objDiretor.setSenha(entradaSenha);
		
		System.out.println(objDiretor.toString());

		objDiretorOutra = new Diretor(entradaNome, entradaSexo, entradaSalario, entradaSenha);
		System.out.println(objDiretorOutra.toString());

	}

}
