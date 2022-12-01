package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dbConnection { 
	public static Connection CreateConnection() throws SQLException{
		Connection conexao = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); // carrega a classe com a jvm
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/duo?autoReconnect=true&useSSL=false", "root", ""); //validaçao dos parametros add usuario e senha 
			System.out.println("conectado com banco!");
			return conexao;
		} catch(ClassNotFoundException err){
			System.out.println("driver nao localizado");
		} catch(SQLException err) {
			System.out.println("erro: " + err.getMessage());
		} finally {
			getCreateConnection();
		}
		return conexao;
	}

	public static java.sql.Connection getCreateConnection(){
		Connection conexao = null;
		return conexao;
	}
	
	public static void main(String[] args) throws SQLException {
		CreateConnection();
	}
}

// Sandrinha linda ass: nosso grupinho 