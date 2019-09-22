package designPatterns2.cap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Programa {

    public static void main(String[] args) throws SQLException {

        final Connection c = new ConnectionFactory().getConnection();

        final PreparedStatement ps = c.prepareStatement("select * from tabela");


    }
}
