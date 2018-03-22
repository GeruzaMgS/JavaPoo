
/*
 * Definição dos importes necessários
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Classe main para exemplificar exemplos basicos da linhagem
 * 
 * @author Prof. Joao Andrei
 * @since 7 de mar de 2016
 * @version 1.0.0
 * 
 */
public class MainConceitosBasicos {
	// exemplo de comentário de uma linha só

	/*
	 * exemplo de comentrário em bloco
	 */

	/**
	 * exemplo de comentário javadoc
	 * 
	 * @author Prof. Joao
	 */

	/*
	 * Variáveis de instância
	 */
	/**
	 * atributo contador do tipo primitivo int
	 */
	private int atributoCotador;
	/**
	 * atributo nome do tipo (classe) String
	 */
	private String atributoNome;
	/**
	 * atributo idade do tipo (classe) Integer
	 */
	private Integer atributoIdade;

	/*
	 * Funções construtora
	 */
	/**
	 * Função construtora padrao Inicializa os atributos da classe com valores
	 * padrão
	 */
	public MainConceitosBasicos() {
		/*
		 * inicializa os atributos da classe durante a construcao do objeto com
		 * valores default
		 */
		this.atributoNome = new String();
		this.atributoIdade = 10;
		this.atributoCotador = new Integer(1);

	}

	/**
	 * Função construtora passando todos os atributos da classe como parametro
	 * Inicializa os atributos da classe com os valores passados no construtor
	 */
	public MainConceitosBasicos(String parametroNome, int parametroIdade, Integer parametroContador) {
		/*
		 * inicializa os atributos da classe durante a construção do objeto com
		 * valores passado como parametro
		 */
		this.atributoNome = parametroNome;
		this.atributoIdade = parametroIdade;
		this.atributoCotador = parametroContador;
	}

	/*
	 * Métodos de acesso
	 */
	/**
	 * recupera o atributoContador
	 * 
	 * @return the atributoCotador
	 */
	public int getAtributoCotador() {
		return atributoCotador;
	}

	/**
	 * seta o atributoContador
	 * 
	 * @param atributoCotador
	 *            the atributoCotador to set
	 */
	public void setAtributoCotador(int atributoCotador) {
		this.atributoCotador = atributoCotador;
	}

	/**
	 * recupera o atributoNome
	 * 
	 * @return the atributoNome
	 */
	public String getAtributoNome() {
		return atributoNome;
	}

	/**
	 * seta o atributoNome
	 * 
	 * @param atributoNome
	 *            the atributoNome to set
	 */
	public void setAtributoNome(String atributoNome) {
		this.atributoNome = atributoNome;
	}

	/**
	 * recupera do atributoIdade
	 * 
	 * @return the atributoIdade
	 */
	public Integer getAtributoIdade() {
		return atributoIdade;
	}

	/**
	 * seta o atrbitutoIdade
	 * 
	 * @param atributoIdade
	 *            the atributoIdade to set
	 */
	public void setAtributoIdade(Integer atributoIdade) {
		this.atributoIdade = atributoIdade;
	}

	/*
	 * Operações da classe
	 */

	/**
	 * metodo main para rodar o application java
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		

		/*
		 * exemplo de instanciar variáveis do tipos primitivos com escopo do
		 * método
		 */
		System.out.println("Exemplo de instanciar variáveis do tipos primitivos");
		int i = 0;
		long l = 0;
		boolean b = true;

		/*
		 * exemplo de utilizacao de tipos primitivos
		 */
		System.out.println("Exemplo de utilizar variáveis do tipos primitivos");

		i = i + 1;
		i += 1;
		i++;
		++i;

		l = 120;

		b = false;

		/*
		 * exemplo de instanciar variáveis do tipos/Classes wrappers com escopo
		 * do método
		 */
		System.out.println("Exemplo de instanciar variáveis do tipos wrappers");

		Integer variavelInteger = new Integer(0);
		Long variavelLong = new Long(0);
		Boolean variavelBoolean = new Boolean(true);

		/*
		 * exemplo de utilizacao de tipos wrappers
		 */
		System.out.println("Exemplo de utilizar variáveis do tipos /classes wrappers");


		variavelInteger = new Integer(100);
		variavelInteger = new Integer("200");
		int variavelPrimitivoInt = variavelInteger.intValue();

		variavelLong = new Long(10);
		variavelLong = new Long("10");
		long variavelPrimitivoLong = variavelLong.longValue();

		/*
		 * exemplo de instanciar variáveis do tipos/Classes comuns com escopo do
		 * método
		 */
		
		System.out.println("Exemplo de instanciar variáveis do tipos/classes comuns");

		String variavelString = new String();
		Scanner variavelScanner = new Scanner(System.in);

		/*
		 * exemplo de utilizacao de tipos/Classes comuns
		 */

		System.out.println("Exemplo de utilizar variáveis do tipos/classes comuns");

		variavelString = new String("Joao Andrei");
		Integer tamanhoDaString = variavelString.length();

		Boolean stringIgual = new Boolean(false);
		if (variavelString.equals("Joao Andrei"))
			stringIgual = new Boolean(true);
		else
			stringIgual = new Boolean(false);

		stringIgual = new Boolean(variavelString.equals("Joao Andrei"));

		/*
		 * exemplo de utilizacao de if
		 */

		System.out.println("Exemplo de utilizar if else ");
		
		if (variavelString.equals("Joao Andrei"))
			stringIgual = new Boolean(true);
		else
			stringIgual = new Boolean(false);

		if (variavelString.equals("Joao Andrei"))
			stringIgual = new Boolean(true);
		else if (variavelString.equals("Joao Andre"))
			stringIgual = new Boolean(false);
		else
			stringIgual = new Boolean(false);

		
		
		System.out.println("Exemplo de utilizar switch case ");
		/*
		 * exemplo de utilizacao de switch case
		 */
		Integer condicionalCase = new Integer(1);
		switch (condicionalCase) {
		case 1:
			System.out.println("switch case entrou na opcao 1");
			break;

		default:
			break;
		}
		
		
		/*
		 * exemplo de utilizacao de while
		 */
		System.out.println("Exemplo de utilizar while");

		boolean condicionalWhile = true;
		int contadorWhile = 0;
		while (condicionalWhile) {
			if (contadorWhile == 10) {
				System.out.println("While encerra while");
				condicionalWhile = false;
				break;
			} else {
				System.out.println("While incrementa 1 while" + contadorWhile);
				contadorWhile++;
			}
		}

		/*
		 * exemplo de utilizacao de do/while
		 */
		System.out.println("Exemplo de utilizar do/while ");

		boolean condicionalDoWhile = true;
		int contadorDoWhile = 0;
		do {

			if (contadorDoWhile == 10) {
				System.out.println("While encerra do/while");
				condicionalDoWhile = false;
				break;
			} else {
				System.out.println("While incrementa 1 do/while" + contadorWhile);
				contadorDoWhile++;
			}
		} while (condicionalDoWhile);

		/*
		 * exemplo de utilizacao de for
		 */
		System.out.println("Exemplo de utilizar for com contador ");

		for (int j = 0; j < 10; j++) {
			System.out.println("exemplo de for com contador ate 10 - " + j);
		}

		/*
		 * exemplo de utilizacao de for com arrays
		 */
		System.out.println("Exemplo de utilizar for com com arrays");
		
		int[] idades = new int[10];
		for (int j = 0; j < 10; j++) {
			idades[j] = j * 2;
		}
		for (int j = 0; j < idades.length; j++) {
			System.out.println(idades[j]);
		}

		/*
		 * exemplo de utilizacao de for com collections
		 */
		System.out.println("Exemplo de utilizar for com com collections");

		List<String> objetoCollection = new ArrayList<>();

		objetoCollection.add(new String("joao"));
		objetoCollection.add(new String("pedro"));
		objetoCollection.add(new String("paulo"));

		for (Iterator<String> iterator = objetoCollection.iterator(); iterator.hasNext();)
		{
			String recuperadoFor = (String) iterator.next();
			System.out.println("String recuperada da lista: " + recuperadoFor);
		}

		/*
		 * exemplo de utilizacao de for com collections Interable
		 */
		System.out.println("Exemplo de utilizar for com com collections Interable");

		List<String> objetoCollection2 = new ArrayList<>();

		objetoCollection2.add(new String("maria"));
		objetoCollection2.add(new String("martha"));
		objetoCollection2.add(new String("ana"));

		for (String recuperadoFor2 : objetoCollection2)
		{
			System.out.println("String recuperada da lista: " + recuperadoFor2);

		}
	}

}
