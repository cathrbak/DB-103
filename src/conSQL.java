import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class conSQL {
	
	private final String dbURL;
	 
	private Connection getConnection() throws SQLException{
		return DriverManager.getConnection(dbURL);
	}
	

}
