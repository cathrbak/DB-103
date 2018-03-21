import java.sql.*;
import java.util.Properties;

public abstract class ConnectionSQL {
	
	protected Connection conn;
	public ConnectionSQL() {
	}
	
	public Connection connect() throws InstantiationException, IllegalAccessException {
		try{ 
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		  String url = "jdbc:mysql://mysql.stud.ntnu.no/noragk_treningsdagbok";
		  String user = "noragk_db";
		  String pw = "Norag0808";
		  Connection con = DriverManager.getConnection(url,user,pw);
		  System.out.println("Tilkoblingen fungerte.");
		  return conn;
		  } catch (SQLException ex) {
		    System.out.println("Tilkobling feilet: "+ex.getMessage());
		  }catch (ClassNotFoundException ex) {
		    System.out.println("Feilet under driverlasting: "+ex.getMessage());
		  } finally {
		    try {
		      if (conn !=  null) conn.close();
		    } catch (SQLException ex) {
		      System.out.println("Epic fail: "+ex.getMessage());
		    } 
		  }
		return null;
	}
	
	
	 
} 