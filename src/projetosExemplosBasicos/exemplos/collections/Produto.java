/**
 * 
 */
package exemplos.collections;

/**
 * Classe produto de uma loja
 * @author Prof. Joao Andrei
 * @since 7 de mar de 2016
 * @version 1.0.0

 */
public class Produto {

	/*
	 * atributos da classe 
	 */
	/**
	 * 
	 */
	private Integer id;
	/**
	 * 
	 */
	private String nome;
	
	/*
	 * metodos construtores
	 */
	/**
	 * construtor padrao
	 */
	public Produto() {
		this.id = new Integer(0);
		this.nome = new String();
	}
	/**
	 * construtor padrao
	 */
	public Produto(Integer id, String nome) 
	{
		this.id = id;
		this.nome = nome;
	}
	
	/*
	 * métodos de acesso
	 */
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void imprimeProduto()
	{
		System.out.println(this.id + " - " +this.nome);
	}
}
