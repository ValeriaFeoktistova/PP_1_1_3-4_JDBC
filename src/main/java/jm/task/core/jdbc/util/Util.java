package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class Util {
    private static Util INSTANCE = new Util();

    private Util() {
    }
    public static Util getInstance() {

        Util locaInstance = INSTANCE;
        if (locaInstance == null) {
            synchronized (Util.class) {
                locaInstance = INSTANCE;
                if (locaInstance == null) {
                    INSTANCE = locaInstance = new Util();
                }
            }
        }
        return INSTANCE;
    }

    public final String URL = "jdbc:mysql://localhost:3306/wednesday";
    public final String USERNAME = "root";
    public final String PASSWORD = "SECRET";

    public static Connection connection;

    {
        try {
            connection = getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Statement statement;

}






