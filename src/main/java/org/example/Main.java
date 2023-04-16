package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=root";

    private static String conok="Соединение с бд установлено";
    private static String conerr="Произошла ошибка подключения к бд";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL)){
            System.out.println(String.format("%s",conok));
        } catch (SQLException e) {
            System.out.println(String.format("%s",conerr));
            e.printStackTrace();
        }
    }
}