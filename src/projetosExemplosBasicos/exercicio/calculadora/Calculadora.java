/**
 * 
 */
package exercicio.calculadora;

import exercicio.calculadora.utilitario.Utilitario;

/*
 * imports necessários
 */
/**
 * Classe que irá realizar as operacoes basicas de uma calculadora
 * 
 * @author Prof. Joao Andrei
 * @since 16 de mar de 2016
 * @version 1.0.0
 * 
 */
public class Calculadora {

	private static final String SOMAR = "+";
	private static final String SUBTRAIR = "-";
	private static final String MULTIPLICAR = "*";
	private static final String DIVIDIR = "/";

	private String historico;

	private Double valor1;
	private Double valor2;
	private Double resultado;
	private String operacao;

	/*
	 * metodos construtores
	 */
	/**
	 * Construtor padrao da classe
	 */
	public Calculadora() {
		historico = new String();
	}

	public Double somar(Double valor1, Double valor2) {
		return valor1 + valor2;
	}

	public Double subtrair(Double valor1, Double valor2) {
		return valor1 - valor2;
	}

	public Double multiplicar(Double valor1, Double valor2) {
		return valor1 * valor2;
	}

	public Double dividir(Double valor1, Double valor2) {
		try {
			return valor1 / valor2;
		} catch (Exception e) {
			return null;
		}
	}

	public Double calcular(Double valor1, String operacao, Double valor2) {
		Double resultado;
		switch (operacao) {
		case SOMAR:

			resultado = somar(valor1, valor2);
			gravaHistorico(valor1, operacao, valor2, resultado);

			return resultado;
			
			
		case DIVIDIR:

			resultado = somar(valor1, valor2);
			gravaHistorico(valor1, operacao, valor2, resultado);

			return resultado;

		default:
			return null;
		}
	}

	public static Boolean isOperacao(String operacao) {
		if (operacao == null || operacao.equals("")) {
			return new Boolean(false);
		} else if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")
				|| operacao.equals("=")) {
			return new Boolean(true);
		} else {
			return new Boolean(false);
		}
	}

	public void imprimirHistorico() {
		System.out.println("HISTORICO:");
		System.out.println(historico);
	}

	private void gravaHistorico(Double valor1, String operacao, Double valor2, Double resultado) {
		historico = valor1 + " " + operacao + " " + valor2 + " = " + resultado;
	}
}
