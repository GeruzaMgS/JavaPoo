/**
 * 
 */
package exemplos.utilitario;

/*
 * Definição dos importes necessários
 */
import java.util.Scanner;

/**
 * Classe utilitária
 * 
 * @author Prof. Joao Andrei
 * @since 7 de mar de 2016
 * @version 1.0.0
 * 
 */
public class Utilitario {
	/*
	 * atributos da classe
	 * 
	 */

	/**
	 * Constante estática da classe
	 */
	public static final int MENU_INFORMAR_NOME = 1;
	public static final int MENU_INFORMAR_SEXO = 2;
	public static final int MENU_SALVAR = 3;
	public static final int MENU_VOLTAR = 9;

	/**
	 * atributo do tipo Scanner para recuperar dados de entrada do teclado
	 */
	private static Scanner objScanner;
	/*
	 * Metodo construtor
	 */

	/**
	 * construtor padrao
	 */
	public Utilitario() {
	}

	/*
	 * acoes da classe
	 * 
	 */

	/**
	 * metodo para recuperar dados do teclado
	 * 
	 * @return String - dados do teclado
	 */
	public static String receberTextoDoTeclado() {
		/*
		 * variaveis de escopo dentro do metodo
		 */
		String textoEntrada = null;

		/*
		 * corpo do metodo
		 */

		objScanner = new Scanner(System.in);
		System.out.println("-->");

		textoEntrada = objScanner.nextLine();

		/* retorno do metodo */
		return textoEntrada;
	}

	/**
	 * Recebe um texto do teclado e transforma em um Integer
	 * 
	 * @return Integer com o numero digitado
	 */
	public static Integer receberIntegerDoTeclado() {
		/*
		 * variaveis de escopo dentro do metodo
		 */
		String textoEntrada = null;
		Integer numeroEntrada = 0;

		/*
		 * corpo do metodo
		 */
		objScanner = new Scanner(System.in);

		System.out.println("-->");

		textoEntrada = objScanner.nextLine();

		numeroEntrada = new Integer(textoEntrada);

		/* retorno do metodo */
		return numeroEntrada;
	}

	/**
	 * Recebe um Double do teclado e transforma em um Integer
	 * 
	 * @return Double com o numero digitado
	 */
	public static Double receberDoubleDoTeclado() {
		/*
		 * variaveis de escopo dentro do metodo
		 */
		String textoEntrada = null;
		Double numeroEntrada = new Double(0);

		/*
		 * corpo do metodo
		 */
		objScanner = new Scanner(System.in);

		System.out.println("-->");

		textoEntrada = objScanner.nextLine();

		numeroEntrada = new Double(textoEntrada);

		/* retorno do metodo */
		return numeroEntrada;
	}
}
