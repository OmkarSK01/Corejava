package jdbc;

import java.sql.*;

public class CallableDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");//register driver
        Connection connection =                            // establishing connection
                DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstack10feb", "root", "Password123");

        CallableStatement callableStatement = connection.prepareCall("call getStudentData()");

        ResultSet resultSet = callableStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1)
                    + " " + resultSet.getString(2)+" "+resultSet.getString(3));
        }

    }
}


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
+---------+-------------+------+-----+---------+-------+
3 rows in set (0.01 sec)

mysql> use fullstack10feb;
Database changed
mysql> delimiter /
mysql> create procedure getStudentData()
    -> BEGIN
    -> select * from student;
    -> END;
    -> /
Query OK, 0 rows affected (0.02 sec)

mysql> call getStudentData();/
+------+-----------+--------------+
| id   | name      | address      |
+------+-----------+--------------+
|    1 | omkar     | pune         |
|    1 | omkar     | pune         |
|    1 | mansi     | pune         |
|    1 | name=> 1  | address=> 1  |
|    2 | name=> 2  | address=> 2  |
|    3 | name=> 3  | address=> 3  |
|    4 | name=> 4  | address=> 4  |
|    5 | name=> 5  | address=> 5  |
|    6 | name=> 6  | address=> 6  |
|    7 | name=> 7  | address=> 7  |
|    8 | name=> 8  | address=> 8  |
|    9 | name=> 9  | address=> 9  |
|   10 | name=> 10 | address=> 10 |
|    1 | name=> 1  | address=> 1  |
|    2 | name=> 2  | address=> 2  |
|    3 | name=> 3  | address=> 3  |
|    4 | name=> 4  | address=> 4  |
|    5 | name=> 5  | address=> 5  |
|    6 | name=> 6  | address=> 6  |
|    7 | name=> 7  | address=> 7  |
|    8 | name=> 8  | address=> 8  |
|    9 | name=> 9  | address=> 9  |
|   10 | name=> 10 | address=> 10 |
+------+-----------+--------------+
23 rows in set (0.01 sec)

Query OK, 0 rows affected (0.06 sec)

mysql>






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
+---------+-------------+------+-----+---------+-------+
3 rows in set (0.01 sec)

mysql> use fullstack10feb;
Database changed
mysql> delimiter /
mysql> create procedure getStudentData()
    -> BEGIN
    -> select * from student;
    -> END;
    -> /
Query OK, 0 rows affected (0.02 sec)

mysql> call getStudentData();/
+------+-----------+--------------+
| id   | name      | address      |
+------+-----------+--------------+
|    1 | omkar     | pune         |
|    1 | omkar     | pune         |
|    1 | mansi     | pune         |
|    1 | name=> 1  | address=> 1  |
|    2 | name=> 2  | address=> 2  |
|    3 | name=> 3  | address=> 3  |
|    4 | name=> 4  | address=> 4  |
|    5 | name=> 5  | address=> 5  |
|    6 | name=> 6  | address=> 6  |
|    7 | name=> 7  | address=> 7  |
|    8 | name=> 8  | address=> 8  |
|    9 | name=> 9  | address=> 9  |
|   10 | name=> 10 | address=> 10 |
|    1 | name=> 1  | address=> 1  |
|    2 | name=> 2  | address=> 2  |
|    3 | name=> 3  | address=> 3  |
|    4 | name=> 4  | address=> 4  |
|    5 | name=> 5  | address=> 5  |
|    6 | name=> 6  | address=> 6  |
|    7 | name=> 7  | address=> 7  |
|    8 | name=> 8  | address=> 8  |
|    9 | name=> 9  | address=> 9  |
|   10 | name=> 10 | address=> 10 |
+------+-----------+--------------+
23 rows in set (0.01 sec)

Query OK, 0 rows affected (0.06 sec)

mysql> */










