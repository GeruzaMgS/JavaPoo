
/*
 * imports necessarios
 */
import exercicio.calculadora.Calculadora;
import exercicio.calculadora.utilitario.Utilitario;

/**
 * Classe responsavel por iniciar a calculadora
 * 
 * @author Prof. Joao Andrei
 * @since 16 de mar de 2016
 * @version 1.0.0
 * 
 */
public class MainCalculadora {

	/*
	 * metodos construtores
	 */
	/**
	 * construtor padrao da classe
	 */
	public MainCalculadora() {
	}

	/**
	 * método responsável por iniciar o java application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		escolherCalculadora();

	}

	public static void escolherCalculadora() {

		/*
		 * vai montar o menu para escolher 
		 * mostraCalculadoraBasica(); 
		 * ou
		 * mostraCalculadoraCientifica();
		 */

		mostraCalculadoraBasica();
	}

	/**
	 * metodo para montar o menu e utilizar a calculadora basica
	 */
	public static void mostraCalculadoraBasica() {

		Calculadora calculadora = new Calculadora();
		Double valor1;
		Double valor2;
		Double resultado;
		String operacao;
		System.out.println("CALCULADORA");

		do {
			System.out.println("Por favor entre com a operacao:");
			
			mostrarMenuCalculadoraBasica();

			operacao = Utilitario.receberTextoDoTeclado();

			if (!Calculadora.isOperacao(operacao)) {
				System.out.println("Operacao Invalida");
				continue;
			}

			System.out.println("Por favor entre com o primeiro numero:");
			valor1 = Utilitario.receberDoubleDoTeclado();

			System.out.println("Por favor entre com o segundo numero:");
			valor2 = Utilitario.receberDoubleDoTeclado();

			resultado = calculadora.calcular(valor1, operacao, valor2);
			
			System.out.print(valor1 + " " + operacao + " " + valor2 + " = ");
			
			System.out.println(resultado.toString());
			calculadora.imprimirHistorico();
			System.out.println("--------------------");
		} while (true);
	}
	
	/**
	 * metodo para montar o menu e utilizar a calculadora cientifica
	 */
	public static void mostraCalculadoraCientifica() {

		/*
		 * vai montar o tratamento para utilizar calculadora cientifica alem das
		 * opcoes da calculadora basica, o menu deverá ter as opcoes: seno e
		 * coseno
		 */

		System.out.println("vai funcionar uma calculadora cientifica aqui");

	}

	/**
	 * 
	 */
	public static void mostrarMenuCalculadoraBasica() {
		System.out.println("(+) - somar");
		System.out.println("(-) - diminuir");
		System.out.println("(*) - multiplicar");
		System.out.println("(/) - dividir");
	}

	/**
	 * 
	 */
	public static void mostrarMenuCalculadoraCientifica() {
		mostrarMenuCalculadoraBasica();
		System.out.println("(s) - seno");
		System.out.println("(c) - conseno");
	}



}
