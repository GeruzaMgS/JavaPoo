/**
 * 
 */
package exemplos.collections;

/**
 * Classe bicicleta
 * 
 * @author Prof. Joao Andrei
 * @since 7 de mar de 2016
 * @version 1.0.0
 * 
 */
public class Bicicleta extends Produto {

	/*
	 * metodos construtores
	 */
	/**
	 * construtor padrao
	 */
	public Bicicleta() {
		super();
	}

	/**
	 * construtor passando os atributos
	 * @param id
	 * @param nome
	 */
	public Bicicleta(Integer id, String nome) {
		super(id, nome);
	}
	
	/*
	 * metodos sobreescritos
	 */

	/**
	 * imprime a bicicleta
	 */
	@Override
	public void imprimeProduto()
	{
		System.out.println("Bicicleta:: "+super.getId()  + " - " +super.getNome());
	}
}
