import exemplos.exceptions.MyException;
import exemplos.exceptions.TesteException;

/**
 * 
 */

/**
 * classe para testar conceitos de Exceptions
 * 
 * @author Prof. Joao Andrei
 * @since 7 de mar de 2016
 * @version 1.0.0
 * 
 */
public class MainConceitosException {

	/**
	 * construtor padrao
	 */
	public MainConceitosException() {
	}

	/*
	 * acoes da classe
	 */
	/**
	 * metodo main para iniciar o java application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("MainConceitosException::main()::vai iniciar testes");

		TesteException testeException = new TesteException();

		System.out.println("MainConceitosException::main()::vai iniciar testeException.testeErro()");

		//testeException.testeErro();
		
		System.out.println("MainConceitosException::main()::vai iniciar testeException.testeErro2()");

		testeException.testeErro2();
		
		System.out.println("MainConceitosException::main()::vai iniciar testeException.testeErro3()");

		try {
			testeException.testeErro3();
		} catch (NumberFormatException e) {
			System.out.println("MainConceitosException::main():: testeException.testeErro3():: ocorreu exception");

			e.printStackTrace();
		}	
		System.out.println("MainConceitosException::main()::vai iniciar testeException.testeErro4()");

		try {
			testeException.testeErro4();
		} catch (MyException e) {
			System.out.println("MainConceitosException::main():: testeException.testeErro4():: ocorreu exception");

			e.printStackTrace();
		}

		

	}

}
