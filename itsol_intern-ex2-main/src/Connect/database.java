package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
        public  Connection getJDBCConnection() {
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://localhost:3306/itsol_dbcar";
            final String DB_USER = "root";
            final String DB_PASS = "dothat998";
            try {
                Class.forName(JDBC_DRIVER);
                return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            } catch (ClassNotFoundException e) {
                // TODO: handle exception
                e.printStackTrace();
            } catch (SQLException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            return null;
        }
    }
