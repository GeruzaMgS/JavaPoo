/**
 * 
 */


import exercicio.helloword.HelloWorld;

/**
 * @author Prof. Joao Andrei
 * @since 22 de fev de 2016
 * @version 1.0.0

 */
public class MainHelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloWorld helloWorldDoJoao = new HelloWorld();
		System.out.println(helloWorldDoJoao.getTexto());
		
		helloWorldDoJoao = new HelloWorld("outro texto");
		System.out.println(helloWorldDoJoao.getTexto());
		
	}

}
