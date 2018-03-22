/**
 * 
 */
package exemplos.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Prof. Joao Andrei
 * @since 9 de mai de 2016
 * @version 1.0.0
 * 
 */
public class DBOraclePessoaSP {

	/*
	 * constantes da clase
	 */
	/**
	 * 
	 */
	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";

	/**
	 * 
	 */
	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";

	/**
	 * 
	 */
	private static final String DB_USER = "aluno";

	/**
	 * 
	 */
	private static final String DB_PASSWORD = "aluno";

	/*
	 * variaveis da instancia
	 */
	/**
	 * 
	 */
	private String dbUrl = null;
	/**
	 * 
	 */
	private String dbUser = null;
	/**
	 * 
	 */
	private String dbPassword = null;
	/**
	 * 
	 */
	private Connection connection = null;

	/**
	 * 
	 * @throws ClassNotFoundException
	 */
	public DBOraclePessoaSP() throws ClassNotFoundException {
		// carrega driver do oracle
		Class.forName(DBOraclePessoaSP.DB_DRIVER);

		// atribui variaveis de conexao com o bd
		this.dbUrl = DBOraclePessoaSP.DB_URL;
		this.dbUser = DBOraclePessoaSP.DB_USER;
		this.dbPassword = DBOraclePessoaSP.DB_PASSWORD;

	}

	/*
	 * métodos de ações da classe
	 */
	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	public Connection connect() throws SQLException {
		
		if (connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
		}
		return connection;
	}

	/**
	 * 
	 * @throws SQLException
	 */
	public void disconnect() {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
