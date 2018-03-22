/**
 * 
 */
package exemplos.exceptions;

/**
 * classe para testar exceptions
 * 
 * @author Prof. Joao Andrei
 * @since 7 de mar de 2016
 * @version 1.0.0
 * 
 */
public class TesteException {

	/*
	 * metodo construtor
	 */
	/**
	 * construtor padrao
	 */
	public TesteException() {
	}
	/*
	 * acoes da classe
	 */

	/**
	 * metodo para testar exception
	 * 
	 * @return integer numero gerado
	 */
	public Integer testeErro() {

		System.out.println("TesteException::testeErro()::vai testar exception");
		Integer variavelInteger = new Integer("1234a");
		return variavelInteger;

	}

	/**
	 * metodo para testar exception com tratamento de try
	 * 
	 * @return integer numero gerado
	 */
	public Integer testeErro2() {
		Integer variavelInteger = null;
		try {
			System.out.println("TesteException::testeErro2()::vai testar exception");
			variavelInteger = new Integer("1234a");

		} catch (NumberFormatException e) {
			System.out.println("TesteException::testeErro2()::ocorreu exception");
			e.printStackTrace();
		}
		return variavelInteger;

	}

	/**
	 * metodo para testar exception com lancamento de throws
	 * 
	 * @return integer numero gerado
	 * @throws NumberFormatException
	 */
	public Integer testeErro3() throws NumberFormatException {
		Integer variavelInteger = null;

		System.out.println("TesteException::testeErro3()::vai testar exception");
		variavelInteger = new Integer("1234a");

		return variavelInteger;
	}

	/**
	 * metodo para testar exception com tratamento de try
	 * 
	 * @return integer numero gerado
	 * @throws MyException 
	 */
	public Integer testeErro4() throws MyException {
		Integer variavelInteger = null;
		try {
			System.out.println("TesteException::testeErro4()::vai testar exception");
			variavelInteger = new Integer("1234a");

		} catch (NumberFormatException e) {
			System.out.println("TesteException::testeErro4()::ocorreu exception");
			e.printStackTrace();
			System.out.println("TesteException::testeErro4()::vai lancar MyException");
			throw new MyException("Ocorreu uma exception que foi tratada via MyException");
		}
		return variavelInteger;

	}
}
