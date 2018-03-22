/**
 * 
 */
package exemplos.interfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exemplos.heranca.Pessoa;
import exemplos.jdbc.DBOraclePessoa;

/**
 * @author Prof. Joao Andrei
 * @since 22 de mar de 2016
 * @version 1.0.0
 * 
 */
public class PessoaDAOImpl implements IPessoaDAO {
	/**
	 * 
	 */
	private DBOraclePessoa dbOracle;
	/**
	 * 
	 */
	private PreparedStatement preparedStatement = null;
	/**
	 * 
	 */
	private ResultSet resultSet = null;
	/**
	 * 
	 */
	private Connection connection = null;

	public PessoaDAOImpl() throws ClassNotFoundException {
		dbOracle = new DBOraclePessoa();
	}

	/**
	 * 
	 * @param pessoa
	 * @return
	 * @throws SQLException
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * exemplos.interfaces.ICadastroPessoaDAO#inserir(exemplos.heranca.Pessoa)
	 */
	@Override
	public Boolean inserir(Pessoa pessoa) {

		try {
			connection = dbOracle.connect();

			preparedStatement = connection.prepareStatement(
					"INSERT INTO CADASTRO_PESSOA(PESSOA_ID, PESSOA_NOME, PESSOA_DOB, PESSOA_SEXO) VALUES(?,?,?,?)");

			/*
			 * atencao, este é o id da pessoa, devera cuidar pra nao colocar
			 * duas pessoas com o mesmo id
			 */
			preparedStatement.setInt(1, pessoa.getIdPessoa());
			preparedStatement.setString(2, pessoa.getNome());
			preparedStatement.setDate(3, new java.sql.Date(pessoa.getDob().getTime()));
			preparedStatement.setString(4, pessoa.getSexo());
			preparedStatement.executeUpdate();
			if (preparedStatement != null)
				preparedStatement.close();

		} catch (SQLException e) {
			e.printStackTrace();
			return new Boolean(false);
		} finally {
			dbOracle.disconnect();
		}
		return new Boolean(true);
	}

	/**
	 * 
	 * @param pessoa
	 * @return
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * exemplos.interfaces.ICadastroPessoaDAO#atualizar(exemplos.heranca.Pessoa)
	 */
	@Override
	public Boolean atualizar(Pessoa pessoa) {
		try {
			connection = dbOracle.connect();

			preparedStatement = connection.prepareStatement(
					"UPDATE CADASTRO_PESSOA SET PESSOA_NOME=?, PESSOA_DOB=?, PESSOA_SEXO=? WHERE PESSOA_ID=?");

			/*
			 * atencao, este é o id da pessoa, devera cuidar pra nao colocar
			 * duas pessoas com o mesmo id
			 */
			preparedStatement.setString(1, pessoa.getNome());
			preparedStatement.setDate(2, new java.sql.Date(pessoa.getDob().getTime()));
			preparedStatement.setString(3, pessoa.getSexo());
			preparedStatement.setInt(4, pessoa.getIdPessoa());
			int numeroDeRegistrosAtualizados = preparedStatement.executeUpdate();
			System.out.println("Foram atualizados [" + numeroDeRegistrosAtualizados + "] registros");
			if (preparedStatement != null)
				preparedStatement.close();

		} catch (SQLException e) {
			e.printStackTrace();
			return new Boolean(false);
		} finally {
			dbOracle.disconnect();
		}
		return new Boolean(true);
	}

	/**
	 * 
	 * @param pessoa
	 * @return
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * exemplos.interfaces.ICadastroPessoaDAO#excluir(exemplos.heranca.Pessoa)
	 */
	@Override
	public Boolean excluir(Pessoa pessoa) {
		try {
			connection = dbOracle.connect();

			preparedStatement = connection.prepareStatement("DELETE FROM CADASTRO_PESSOA WHERE PESSOA_ID=?");

			/*
			 * atencao, este é o id da pessoa, devera cuidar pra nao colocar
			 * duas pessoas com o mesmo id
			 */
			preparedStatement.setInt(1, pessoa.getIdPessoa());
			int numeroDeRegistrosApagados = preparedStatement.executeUpdate();
			System.out.println("Foram removidos [" + numeroDeRegistrosApagados + "] registros");
			if (preparedStatement != null)
				preparedStatement.close();

		} catch (SQLException e) {
			e.printStackTrace();
			return new Boolean(false);
		} finally {
			dbOracle.disconnect();
		}
		return new Boolean(true);
	}

	/**
	 * 
	 * @param pessoa
	 * @return
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * exemplos.interfaces.ICadastroPessoaDAO#pesquisar(exemplos.heranca.Pessoa)
	 */
	@Override
	public List<Pessoa> pesquisar(Pessoa pessoa) {
		List<Pessoa> listaRetorno = new ArrayList<>();
		try {
			connection = dbOracle.connect();

			String sql = "SELECT PESSOA_ID, PESSOA_NOME, PESSOA_DOB, PESSOA_SEXO FROM CADASTRO_PESSOA  WHERE PESSOA_ID=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, pessoa.getIdPessoa());

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				// aqui seria o lugar para construir o objeto com os dados
				// recuperados da base e adicionar na lista

				Pessoa pessoaRecuperada = new Pessoa();
				pessoaRecuperada.setIdPessoa((int) resultSet.getInt(1));
				pessoaRecuperada.setNome((String) resultSet.getString(2));
				pessoaRecuperada.setDob((java.util.Date) resultSet.getDate(3));
				pessoaRecuperada.setSexo((String) resultSet.getString(4));
				
				listaRetorno.add(pessoaRecuperada);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			dbOracle.disconnect();
		}
		return listaRetorno;
	}

	/**
	 * 
	 * @param pessoa
	 * @return
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see exemplos.interfaces.ICadastroPessoaDAO#pesquisar(java.lang.Integer)
	 */
	@Override
	public Pessoa pesquisar(Integer idPessoa) {
		List<Pessoa> listaRetorno = new ArrayList<>();
		try {
			connection = dbOracle.connect();

			String sql = "SELECT PESSOA_ID, PESSOA_NOME, PESSOA_DOB, PESSOA_SEXO FROM CADASTRO_PESSOA  WHERE PESSOA_ID=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, idPessoa);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				// aqui seria o lugar para construir o objeto com os dados
				// recuperados da base e adicionar na lista

				Pessoa pessoaRecuperada = new Pessoa();
				pessoaRecuperada.setIdPessoa((int) resultSet.getInt(1));
				pessoaRecuperada.setNome((String) resultSet.getString(2));
				pessoaRecuperada.setDob((java.util.Date) resultSet.getDate(3));
				pessoaRecuperada.setSexo((String) resultSet.getString(4));
				
				listaRetorno.add(pessoaRecuperada);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			dbOracle.disconnect();
		}
		if (listaRetorno != null & listaRetorno.size() > 0) {
			return listaRetorno.get(0);
		} else {
			return null;
		}
	}

	/**
	 * 
	 * @param pessoa
	 * @return
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see exemplos.interfaces.ICadastroPessoaDAO#pesquisar(java.lang.String)
	 */
	@Override
	public List<Pessoa> pesquisar(String nomePessoa) {
		List<Pessoa> listaRetorno = new ArrayList<>();

		try {
			connection = dbOracle.connect();

			String sql = "SELECT PESSOA_ID, PESSOA_NOME, PESSOA_DOB, PESSOA_SEXO FROM CADASTRO_PESSOA WHERE PESSOA_NOME LIKE '%?%'";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, nomePessoa);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				// aqui seria o lugar para construir o objeto com os dados
				// recuperados da base e adicionar na lista

				Pessoa pessoaRecuperada = new Pessoa();
				pessoaRecuperada.setIdPessoa((int) resultSet.getInt(1));
				pessoaRecuperada.setNome((String) resultSet.getString(2));
				pessoaRecuperada.setDob((java.util.Date) resultSet.getDate(3));
				pessoaRecuperada.setSexo((String) resultSet.getString(4));
				
				listaRetorno.add(pessoaRecuperada);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			dbOracle.disconnect();
		}
		return listaRetorno;
	}

	/**
	 * 
	 * @param pessoa
	 * @return
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see exemplos.interfaces.ICadastroPessoaDAO#pesquisarAll()
	 */
	@Override
	public List<Pessoa> pesquisarAll() {
		List<Pessoa> listaRetorno = new ArrayList<>();

		try {
			connection = dbOracle.connect();

			String sql = "SELECT PESSOA_ID, PESSOA_NOME, PESSOA_DOB, PESSOA_SEXO FROM CADASTRO_PESSOA";
			preparedStatement = connection.prepareStatement(sql);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				// aqui seria o lugar para construir o objeto com os dados
				// recuperados da base e adicionar na lista

				Pessoa pessoaRecuperada = new Pessoa();
				pessoaRecuperada.setIdPessoa((Integer) resultSet.getInt(1));
				pessoaRecuperada.setNome((String) resultSet.getString(2));
				pessoaRecuperada.setDob((java.util.Date) resultSet.getDate(3));
				pessoaRecuperada.setSexo((String) resultSet.getString(4));
				
				listaRetorno.add(pessoaRecuperada);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			dbOracle.disconnect();
		}
		return listaRetorno;
	}
}
