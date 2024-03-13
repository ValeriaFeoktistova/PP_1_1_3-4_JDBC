package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    Connection connection;

    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userService.createUsersTable();
        userService.saveUser("Pit", "Pitlast", (byte) 7);
        userService.getAllUsers();
        userService.removeUserById(1);
        userService.cleanUsersTable();
        userService.dropUsersTable();

        userDaoJDBC.closeConnection();

    }
}



