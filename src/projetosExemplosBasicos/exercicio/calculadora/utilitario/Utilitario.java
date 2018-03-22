/**
 * 
 */
package exercicio.calculadora.utilitario;

import java.util.Scanner;

/**
 * @author Prof. Joao Andrei
 * @since 7 de mar de 2016
 * @version 1.0.0

 */
public class Utilitario {
	


	/*
	 * metodos construtores
	 */
	/**
	 *  Construtor padrao da classe
	 */
	public Utilitario() {
	}
	
	
	/*
	 * metodos de acoes da classe
	 */
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
		textoEntrada = receberTextoDoTeclado();
		numeroEntrada = new Integer(textoEntrada);

		/* retorno do metodo */
		return numeroEntrada;
	}
	
	/*
	 * metodos de acoes da classe
	 */
	/**
	 * Recebe um texto do teclado e transforma em um Double
	 * 
	 * @return Double com o numero digitado
	 */
	public static Double receberDoubleDoTeclado() {
		/*
		 * variaveis de escopo dentro do metodo
		 */
		String textoEntrada = null;
		Double numeroEntrada = null;

		/*
		 * corpo do metodo
		 */
		textoEntrada = receberTextoDoTeclado();
		numeroEntrada = new Double(textoEntrada);

		if(isDouble(numeroEntrada))
				return numeroEntrada;
		else
			return null;
		
		
	}
	public static String receberTextoDoTeclado() {
		/*
		 * variaveis de escopo dentro do metodo
		 */
		String textoEntrada = null;

		/*
		 * corpo do metodo
		 */
		Scanner objScanner = new Scanner(System.in);

		System.out.println("-->");

		textoEntrada = objScanner.nextLine();

		return textoEntrada;
	}

	public static Boolean isDouble(Double valor) {
		return !valor.isNaN();
	}

}
