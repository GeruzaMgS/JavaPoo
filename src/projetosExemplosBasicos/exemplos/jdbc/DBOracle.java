package exemplos.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Prof. Joao Andrei
 * @since 26 de fev de 2016
 * @version 1.0.0
 */
public class DBOracle {
	/*
	 * variaveis da instancia
	 */
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:XE";
	String dbUser = "aluno";
	String dbPassword = "aluno";
	
	
	
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	Connection connection;

	/*
	 * metodo construtor
	 */
	public DBOracle() throws ClassNotFoundException {
		// carrega driver do oracle
		Class.forName("oracle.jdbc.driver.OracleDriver");

	}

	public Connection connect() {
		try {
			System.out.println("VAI ABRIR A CONEXAO");
			connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
			System.out.println("CONEXAO ABERTA CORRETAMENTE");
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return connection;
	}

	public void disconnect() throws SQLException {

		System.out.println("VAI FECHAR A CONEXAO");
		if (preparedStatement != null) {
			preparedStatement.close();
		}

		if (connection != null && !connection.isClosed()) {
			connection.close();
			System.out.println("CONEXAO FECHADA CORRETAMENTE");
		} else {
			System.out.println("CONEXAO NAO ESTAVA FECHADA");
		}

	}
}
