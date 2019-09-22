package designPatterns2.cap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection(){

        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
