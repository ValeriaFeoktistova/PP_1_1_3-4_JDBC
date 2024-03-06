package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    Connection connection;

    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();

        userDaoJDBC.createUsersTable();//1
        userDaoJDBC.saveUser("Pit", "Pitlast", (byte) 7);//2
        userDaoJDBC.getAllUsers();//3
        userDaoJDBC.removeUserById(1);//4
        userDaoJDBC.cleanUsersTable();//5
        userDaoJDBC.dropUsersTable();//6
        userDaoJDBC.closeConnection();//70*//*

    }
}



