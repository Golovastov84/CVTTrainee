package main;

import java.sql.*;

public class ConnSqlite {
    public static Connection conn;
    public static Statement statmt;
    public static ResultSet resSet;

    // --------ПОДКЛЮЧЕНИЕ К БАЗЕ ДАННЫХ--------
    public static void Conn() throws ClassNotFoundException, SQLException
    {
        conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:src/main/resources/List_of_people.db");
        System.out.println("База Подключена!");
    }

    // --------Создание таблицы--------
    public static void CreateDB() throws ClassNotFoundException, SQLException
    {
        statmt = conn.createStatement();
        statmt.execute("CREATE TABLE if not exists 'documents' ('id' INTEGER PRIMARY KEY UNIQUE NOT NULL, " +
                "'type_id' INTEGER NOT NULL REFERENCES type_document (id) ON DELETE CASCADE ON UPDATE " +
                "CASCADE MATCH [FULL], " +
                "'people_id' INTEGER NOT NULL REFERENCES people (id) ON DELETE CASCADE ON UPDATE CASCADE " +
                "MATCH [FULL], 'series' TEXT, 'number' INTEGER NOT NULL, 'date' TEXT);");
        statmt.execute( "CREATE TABLE if not exists 'people' ('id' INTEGER PRIMARY KEY ASC " +
                "AUTOINCREMENT UNIQUE NOT NULL, 'first_name' TEXT NOT NULL, 'last_name' TEXT NOT NULL, " +
                "'patronymic' TEXT, 'birthday' TEXT, 'sex' TEXT);");
        statmt.execute("CREATE TABLE if not exists 'type_document' ('id' INTEGER PRIMARY KEY NOT NULL " +
                "UNIQUE, 'name' TEXT NOT NULL);");

        System.out.println("Таблица создана или уже существует.");
    }

    // --------Заполнение таблицы--------
    public static void WriteDB() throws SQLException
    {
        statmt.execute("INSERT INTO 'people' ('name', 'phone') VALUES ('Petya', 125453); ");
//        statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Vasya', 321789); ");
//        statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Masha', 456123); ");

        System.out.println("Таблица заполнена");
    }

    // -------- Вывод таблицы--------
    public static void ReadDB() throws ClassNotFoundException, SQLException
    {
        resSet = statmt.executeQuery("SELECT * FROM people");

        while(resSet.next())
        {
            int id = resSet.getInt("id");
            String  name = resSet.getString("name");
            String  phone = resSet.getString("phone");
            System.out.println( "ID = " + id );
            System.out.println( "name = " + name );
            System.out.println( "phone = " + phone );
            System.out.println();
        }

        System.out.println("Таблица выведена");
    }

    // --------Закрытие--------
    public static void CloseDB() throws ClassNotFoundException, SQLException
    {
        conn.close();
        statmt.close();
//        resSet.close();

        System.out.println("Соединения закрыты");
    }

}
