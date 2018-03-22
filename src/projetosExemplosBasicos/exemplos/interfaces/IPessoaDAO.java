/**
 * 
 */
package exemplos.interfaces;

import java.util.List;

import exemplos.heranca.Pessoa;

/**
 * @author Prof. Joao Andrei
 * @since 22 de mar de 2016
 * @version 1.0.0
 * 
 */
public interface IPessoaDAO {

	/*
	 * definicao dos metodos da interface
	 */

	/**
	 * interface do metodo inserir
	 * 
	 * @param pessoa Pessoa
	 * @return Boolean
	 */
	public Boolean inserir(Pessoa pessoa);

	/**
	 * interface do metodo atualizar
	 * 
	 * @param pessoa Pessoa
	 * @return Boolean
	 */
	public Boolean atualizar(Pessoa pessoa);

	/**
	 * interface do metodo excluir
	 * 
	 * @param pessoa Pessoa
	 * @return Pessoa
	 */
	public Boolean excluir(Pessoa pessoa);

	/**
	 * interface do metodo pesquisar
	 * 
	 * @param pessoa Integer
	 * @return Pessoa
	 */
	public Pessoa pesquisar(Integer codigoPessoa);

	/**
	 * interface do metodo inserir
	 * 
	 * @param pessoa
	 * @return List<? extends Pessoa> - tudo que for do tipo Pessoa ou que
	 *         herdem de Pessoa
	 */
	public List<? extends Pessoa> pesquisar(Pessoa pessoa);

	/**
	 * interface do metodo pesquisar
	 * 
	 * @param nomePessoa String
	 * @return List<? extends Pessoa> - tudo que for do tipo Pessoa ou que
	 *         herdem de Pessoa
	 */
	public List<? extends Pessoa> pesquisar(String nomePessoa);

	/**
	 * interface do metodo pesquisar
	 * 
	 * @return List<? extends Pessoa> - tudo que for do tipo Pessoa ou que
	 *         herdem de Pessoa
	 */
	public List<? extends Pessoa> pesquisarAll();

}
