/**
 * 
 */
package exemplos.exceptions;

/**
 * Classe do projeto para tratar Exceptions
 * @author Prof. Joao Andrei
 * @since 7 de mar de 2016
 * @version 1.0.0

 */
public class MyException extends Exception {

	/**
	 * construtor padrao
	 */
	public MyException() {
		super();
		System.out.println("TesteException::Constructor::MyException()");

	}

	/**
	 * Construtor passando mensagem como paramentro
	 * @param message
	 */
	public MyException(String message) {
		super(message);
		System.out.println("TesteException::Constructor::MyException(String message)");
	}

	/**
	 * Construtor passando Throwable
	 * @param cause
	 */
	public MyException(Throwable cause) {
		super(cause);
		System.out.println("TesteException::Constructor::MyException(Throwable cause)");
	}

	/**
	 * construtor passando uma mensagem e um Construtor passando Throwable
	 * @param message
	 * @param cause
	 */
	public MyException(String message, Throwable cause) {
		super(message, cause);
		System.out.println("TesteException::Constructor::MyException(String message, Throwable cause)");
	}

	/**
	 * Construtor passando uma mensagem , um Construtor passando Throwable, informando se é para suprir, e se é para gerar o stacktrace
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		System.out.println("TesteException::Constructor::MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)");
	}

}
