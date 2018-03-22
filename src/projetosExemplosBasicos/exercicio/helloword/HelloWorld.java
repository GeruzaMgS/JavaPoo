/**
 * 
 */
package exercicio.helloword;

/**
 * @author Prof. Joao Andrei
 * @since 22 de fev de 2016
 * @version 1.0.0
 * 
 */
public class HelloWorld {

	private String texto;

	public HelloWorld()
	{	
		texto = "aula quase no fim";
	}
	
	public HelloWorld(String novoTexto)
	{	
		texto = novoTexto;
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String pTexto) {
		texto = pTexto;
	}


}
