package main;

import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    /*private final String driverName = "org.sqlite.JDBC";
    private final String connectionString = "jdbc:sqlite:src/main/resources/List_of_people.db";

    public void run() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            System.out.println("Can't get class. No driver found");
            e.printStackTrace();
            return;
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionString);
        } catch (SQLException e) {
            System.out.println("Can't get connection. Incorrect URL");
            e.printStackTrace();
            return;
        }
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Can't close connection");
            e.printStackTrace();
            return;
        }
    }*/
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // не рабочая версия, попробовать https://metanit.com/java/android/14.6.php

        // запуск web приложения
        SpringApplication.run(Main.class, args);

        // соединение с sqlite
        ConnSqlite conn = new ConnSqlite();
        conn.Conn();
        conn.CreateDB();
//        conn.WriteDB();
//        conn.ReadDB();
        conn.CloseDB();
    }
}
