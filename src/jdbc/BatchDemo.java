package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class BatchDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");//register driver
        Connection connection =                            // establishing connection
                DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstack10feb", "root", "Password123");

        String insert = "insert into student(id,name,address) values(?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(insert);

        for (int i = 1; i <= 10; i++) {
            preparedStatement.setInt(1, i);
            preparedStatement.setString(2, "name=> " + i);
            preparedStatement.setString(3, "address=> " + i);
            preparedStatement.addBatch();
        }

        int[] ints = preparedStatement.executeBatch();
        System.out.println("record inserted=>" + Arrays.toString(ints));
    }
}