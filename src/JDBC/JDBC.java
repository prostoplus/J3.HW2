package JDBC;

import java.sql.*;

public class JDBC {

    public static void main(String[] args)
    {
        Statement statement = null;

        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlite:D:\\Java\\J3.HW2\\users.db");
            System.out.println("Connected");

            statement = connection.createStatement();
            System.out.println("suda dohodit1");
            statement.execute("create table users(" +
                    "id integer primary key autoincrement, " +
                    "name varchar(128))");

            statement.execute("insert into users(name) values('Ivan'),('Vladimir')");
            System.out.println("suda dohodit2");
            ResultSet rs = statement.executeQuery("select * from users");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " : " + rs.getString("name"));
            }
            statement.execute("delete from users where id > 0");
            System.out.println("suda dohodit3");
            statement.execute("drop table if exists users");
            System.out.println("suda dohodit4");

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

/*
    Небольшой список вопросов:
    1. Обязательно ли писать полный путь к базе данных во время коннекта?
    2. В 18 строчке "org.sqlite.JDBC" всегда будет таким при использовании SQLite?
    3. Если убрать автоинкремент, то строку id всегда нао будет заполнять самому?
    4. Можно ли оставить автоинкремент, но не с 1, а со 100 например?
    5. Проверьте, пожалуйста, предыдущее задание :)
 */