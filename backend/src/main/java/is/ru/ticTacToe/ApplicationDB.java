package is.ru.ticTacToe;

import static java.lang.System.out;
import java.io.File;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ApplicationDB {
    
	private Connection conn;
	private String url;
	
	public ApplicationDB(boolean test) {
		conn = null;
		
		// Create directory
    	//File currentDirFile = new File(".");
		//String helper = currentDirFile.getAbsolutePath();
		//String currentDir = helper.substring(0, helper.length() - 1);
		String currentDir = System.getProperty("user.home");
		
		// db parameters
		if(test) {
			url = "jdbc:sqlite:" + currentDir + "\\gameDatabaseTest.db";
		}
		else { 
			url = "jdbc:sqlite:" + currentDir + "\\gameDatabase.db";
		}	
	}
	
    public void connect() {
        try {
            // create a connection to the database
            conn = DriverManager.getConnection(url);		
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void disconnect() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void initDB() {
        // Create the table necessary in database if does not excist
        String sql = "CREATE TABLE IF NOT EXISTS games (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	winner text NOT NULL,\n"
                + "	moves integer\n"
                + ");";
        
        try (Statement stmt = conn.createStatement()) {
            // create the table
        	stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void addGameResult(String winner, int moves) {
        // SQL statement for creating a new table
        String sql = "INSERT INTO games (\n" 
                +"winner,moves)\n"
                + "values(\n"
                + "'" + winner + "'," + Integer.toString(moves) + ");";
        
        try (Statement stmt = conn.createStatement()) {
            // create a new table
        	stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
	
	public void clearResultTable() {
		String sql = "DELETE FROM games;";
		try (Statement stmt = conn.createStatement()) {
            // clear table
        	stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}
	
	public int getXWinCount() {
		ResultSet rs;
		int count = 0;
		String sql = "SELECT COUNT(winner) as 'count' FROM games WHERE winner = 'x';";
		try (Statement stmt = conn.createStatement()) {
            // create a new table
        	rs = stmt.executeQuery(sql);
			count = rs.getInt("count");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
		return count;
	}
	
	public int getOWinCount() {
		ResultSet rs;
		int count = 0;
		String sql = "SELECT COUNT(winner) as 'count' FROM games WHERE winner = 'o';";
		try (Statement stmt = conn.createStatement()) {
            // create a new table
        	rs = stmt.executeQuery(sql);
			count = rs.getInt("count");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
		return count;
	}
}


