package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class TestConsultar {
	public void Consultar() throws SQLException {
		Statement state = null;
		Connection conexao = dbConnection.CreateConnection();

		try {
			state = (Statement)conexao.createStatement();
			ResultSet result = null;
			
			result = state.executeQuery("SELECT * FROM Game, Ad, Player");
			
			while(result.next()) {
				System.out.println("\n ================================= Game =================================== \n");
				System.out.println(result.getString("idGame") + " | " + result.getString("gameTitle") + " | " + result.getString("bannerUrl"));
				System.out.println("\n ================================= Player ================================= \n");
				System.out.println(result.getString("idPlayer") + " | " + result.getString("userEmail") + " | " + result.getString("playerName") + " | " + result.getString("userImg") + " | " + result.getString("userTwitch") + " | " + result.getString("userInstagram") + " | " + result.getString("userYoutube"));
				System.out.println("\n =================================   Ad   ================================= \n");
				System.out.println(result.getString("idAd") + " | " + result.getString("namePerson") + " | " + result.getInt("yearsPlayer") + " | " + result.getString("weekDays") + " | " + result.getString("hoursStart") + " | " + result.getString("hoursEnd") + " | " + result.getBoolean("useVoiceChannel") + " | " + result.getString("createAt") + " | " + result.getString("userDiscord"));
				System.out.println("\n\n");
			}
			
		}catch(SQLException err) {
			err.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SQLException {
		TestConsultar test = new TestConsultar();
		test.Consultar();
	}
}
