
/*
 * imports necessarios
 */
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import exemplos.jdbc.DBOracle;
import exemplos.jdbc.DBOraclePessoaSP;
import oracle.jdbc.OracleTypes;

/**
 * Classe responsavel por testar jdbc com oracle
 * 
 * @author Prof. Joao Andrei
 * @since 23 de mar de 2016
 * @version 1.0.0
 */
public class MainConseitosOracle {
	/*
	 * definição dos atributos da classe
	 */

	/**
	 * 
	 */
	private static DBOracle dbOracle = null;

	/**
	 * 
	 */
	private static Connection connection = null;

	/**
	 * 
	 */
	private static PreparedStatement preparedStatement = null;

	/**
	 * 
	 */
	private static ResultSet resultSet = null;

	/*
	 * definição dos contrutores
	 */
	/**
	 * construtor padrão
	 */
	public MainConseitosOracle() {

	}

	/*
	 * métodos de ações da classe
	 */

	/**
	 * metodo responsavel por rodar o java application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List<Object> retornoQuery = new ArrayList<Object>();

		try {
			dbOracle = new DBOracle();
			connection = dbOracle.connect();
			System.out.println("VAI INSERIR"); // insere um registro com dados
												// fixos, e pessoa_id=3
			if (inserir(new Object())) {
				System.out.println("INSERIU");
			} else
				System.out.println("NAO INSERIU");

			// vai pesquisar a lista de nomes da base de dados //
			connection = dbOracle.connect();

			retornoQuery = pesquisar();

			if (retornoQuery != null && !retornoQuery.isEmpty()) {
				System.out.println("LISTA NOMES RECUPERADA DA BASE");
				for (Object objetoDaLista : retornoQuery) {
					System.out.println("\t" + objetoDaLista);
				}
			}

			// connection = dbOracle.connect();

			System.out.println("VAI FAZER UPDATE NO NOME PARA FABIO"); //
			// atualiza um registro com dados fixos, e pessoa_id=3
			atualizar(6, "FABIANO");
			System.out.println("ATUALIZOU");

			// connection = dbOracle.connect();

			// vai pesquisar a lista de nomes da base de dados retornoQuery =
			pesquisar();
			System.out.println("LISTA NOMES RECUPERADA DA BASE");
			for (Object objetoDaLista : retornoQuery) {
				System.out.println("\t" + objetoDaLista);
			}

			// connection = dbOracle.connect();

			// REMOVE um registro com dados fixos, e pessoa_id=3
			System.out.println("VAI REMOVER");
			excluir(5);
			System.out.println("REMOVEU");

			connection = dbOracle.connect();

			// vai pesquisar a lista de nomes da base de dados retornoQuery =
			pesquisar();
			System.out.println("LISTA NOMES RECUPERADA DA BASE");
			for (Object objetoDaLista : retornoQuery) {
				System.out.println("\t" + objetoDaLista);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (dbOracle != null)
				try {
					dbOracle.disconnect();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

/*		DBOraclePessoaSP dbOracleSP = null;
		try {

			dbOracleSP = new DBOraclePessoaSP();
			connection = dbOracleSP.connect();
			testeSP();
			testeSPRetornoUnico();
			testeSPRS();
			testeSPErro();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbOracleSP.disconnect();

		}
		
		*/
	}

	/**
	 * 
	 * @return
	 */
	public static List<Object> pesquisar() {
		List<Object> listaRetorno = new ArrayList<>();
		// preparedStatement = connection.prepareStatement("select * from
		// CADASTRO_PESSOA");
		try {
			preparedStatement = connection.prepareStatement("select * from CADASTRO_PESSOA");

			resultSet = preparedStatement.executeQuery();

			System.out.println("INICIO RECUPERACAO DO BANCO");
			while (resultSet.next()) {
				// aqui seria o lugar para construir o objeto com os dados
				// recuperados da base e adicionar na lista
				// nesse exemplo a lista será composta de String nome somente
				listaRetorno.add(resultSet.getString("PESSOA_NOME"));

				System.out.println("----------------------");
				System.out.println(resultSet.getString(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
			}
			System.out.println("----------------------");
			System.out.println("FIM RECUPERACAO DO BANCO");
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return listaRetorno;
	}

	/**
	 * 
	 * @param objeto
	 * @return
	 */
	public static Boolean inserir(Object objeto) {
		PreparedStatement pstmt = null;
		try {
			pstmt = connection.prepareStatement("INSERT INTO CADASTRO_PESSOA"
					+ "(PESSOA_ID, PESSOA_NOME, PESSOA_DOB, PESSOA_SEXO) " + "VALUES(?,?,?,?)");
			/*
			 * atencao, este é o id da pessoa, devera cuidar pra nao colocar
			 * duas pessoas com o mesmo id
			 */
			pstmt.setInt(1, 6);
			pstmt.setString(2, "MARCELOs ANDRADES");
			pstmt.setDate(3, new java.sql.Date(new java.util.Date().getTime()));
			pstmt.setString(4, "F");
			pstmt.executeUpdate();
			if (pstmt != null)
				pstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
			return new Boolean(false);
		}
		return new Boolean(true);
	}

	/**
	 * 
	 * @param idPessoa
	 * @return
	 */
	public static Boolean excluir(int idPessoa) {
		return false;
	}

	/**
	 * 
	 * @param pessoa_id
	 * @param novoNome
	 * @return
	 */
	public static Boolean atualizar(int pessoa_id, String novoNome) {
		return false;
	}

	public static Boolean testeSP() {
		CallableStatement callstmt = null;
		try {
			callstmt = connection.prepareCall("{CALL SP_TESTE(?)}");
			callstmt.setString(1, "I");
			callstmt.execute();

			int parametroRetorno = callstmt.getUpdateCount();
			System.out.println("--" + parametroRetorno);
			if (callstmt != null)
				callstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Return code gerado: " + e.getErrorCode());
			System.out.println("Mensagem gerada   : " + e.getMessage());
			return new Boolean(false);
		}
		return new Boolean(true);
	}

	public static Boolean testeSPRetornoUnico() {
		CallableStatement callstmt = null;
		try {
			callstmt = connection.prepareCall("{CALL SP_TESTE_RETORNO_UNICO(?)}");
			callstmt.registerOutParameter(1, Types.INTEGER);
			callstmt.execute();

			int retorno_sp = callstmt.getInt(1);
			System.out.println("--" + retorno_sp);
			if (callstmt != null)
				callstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Return code gerado: " + e.getErrorCode());
			System.out.println("Mensagem gerada   : " + e.getMessage());
			return new Boolean(false);
		}
		return new Boolean(true);
	}

	public static Boolean testeSPErro() {
		CallableStatement callstmt = null;
		try {
			callstmt = connection.prepareCall("{CALL SP_TESTE(?)}");
			callstmt.setString(1, "X");
			callstmt.execute();

			int parametroRetorno = callstmt.getUpdateCount();
			System.out.println("--" + parametroRetorno);
			if (callstmt != null)
				callstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Return code gerado: " + e.getErrorCode());
			System.out.println("Mensagem gerada   : " + e.getMessage());
			return new Boolean(false);
		}
		return new Boolean(true);
	}

	public static Boolean testeSPRS() {
		CallableStatement callstmt = null;
		try {
			// callstmt = connection.prepareCall("{ CALL ? :=
			// SP_TESTE_RETORNO_MULTIPLO}");
			callstmt = connection.prepareCall("{ CALL SP_TESTE_RETORNO_MULTIPLO3(?)}");
			callstmt.registerOutParameter(1, OracleTypes.CURSOR);
			callstmt.executeQuery();

			ResultSet rs = (ResultSet) callstmt.getObject(1);

			while (rs.next()) {
				System.out.println(rs.getInt("PESSOA_ID"));
			}
			if (callstmt != null)
				callstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Return code gerado: " + e.getErrorCode());
			System.out.println("Mensagem gerada   : " + e.getMessage());
			return new Boolean(false);
		}
		return new Boolean(true);
	}

}
