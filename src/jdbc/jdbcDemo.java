package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


       Class.forName("com.mysql.cj.jdbc.Driver");//register driver
        Connection connection =                            // establishing connection
                DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstack10feb","root","Password123");
      // System.out.println(connection.isValid(100));

        Statement statement = connection.createStatement();
        String createTable = "create table student(id int,name varchar(25),address varchar(25))";

          statement.executeUpdate(createTable);

        System.out.println("table created");

    }
}


/*public class jdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("com.mysql.cj.jdbc.Driver");//register driver
        Connection connection =                            // establishing connection
                DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstack10feb","root","Password123");
//        System.out.println(connection.isValid(100));

        Statement statement = connection.createStatement();
//        String createTable = "create table student(id int,name varchar(25),address varchar(25))";

        String insert = "insert into student(id,name,address) values(1,'Akash','pune')";
        String update ="update student set name = 'ravi' where id = 1";
        String delete = "delete from student where id = 1";
        String drop ="drop table student";

        int i = statement.executeUpdate(drop);

        System.out.println("record deleted "+i);

    }
}*/






// sql commands:
/*mysql> mysql> use fullstack10feb;
Database changed
mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| fullstack10feb     |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.01 sec)

mysql> show tables;
+--------------------------+
| Tables_in_fullstack10feb |
+--------------------------+
| employee                 |
| student                  |
+--------------------------+
2 rows in set (0.01 sec)

mysql> desc student;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| id      | int         | YES  |     | NULL    |       |
| name    | varchar(25) | YES  |     | NULL    |       |
| address | varchar(25) | YES  |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+  */
