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
public class PersistenciaPessoa implements IPessoaDAO {
	/**
	 * 
	 */
	private PessoaDAOImpl pessoaDAOImpl = null;

	/**
	 * 
	 * @throws ClassNotFoundException
	 */
	public PersistenciaPessoa() throws ClassNotFoundException {
		pessoaDAOImpl = new PessoaDAOImpl();
	}

	@Override
	public Boolean inserir(Pessoa pessoa) {
		return pessoaDAOImpl.inserir(pessoa);
	}

	@Override
	public Boolean atualizar(Pessoa pessoa) {
		return pessoaDAOImpl.atualizar(pessoa);
	}

	@Override
	public Boolean excluir(Pessoa pessoa) {
		return pessoaDAOImpl.excluir(pessoa);
	}

	@Override
	public Pessoa pesquisar(Integer codigoPessoa) {
		return pessoaDAOImpl.pesquisar(codigoPessoa);
	}

	@Override
	public List<? extends Pessoa> pesquisar(Pessoa pessoa) {
		return pessoaDAOImpl.pesquisar(pessoa);
	}

	@Override
	public List<? extends Pessoa> pesquisar(String nomePessoa) {
		return pessoaDAOImpl.pesquisar(nomePessoa);
	}

	@Override
	public List<? extends Pessoa> pesquisarAll() {
		return pessoaDAOImpl.pesquisarAll();
	}
}
