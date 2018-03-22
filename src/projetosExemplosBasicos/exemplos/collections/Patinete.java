/**
 * 
 */
package exemplos.collections;

/**
 * Classe patinete
 * 
 * @author Prof. Joao Andrei
 * @since 7 de mar de 2016
 * @version 1.0.0
 * 
 */
public class Patinete extends Produto {

	/*
	 * metodos contrutores
	 */
	/**
	 * construtor padrao
	 */
	public Patinete() {
		super();
	}

	/**
	 * construtor passando parametros
	 * 
	 * @param id
	 * @param nome
	 */
	public Patinete(Integer id, String nome) {
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
		System.out.println("Patinete:: "+super.getId()  + " - " +super.getNome());
	}
}
