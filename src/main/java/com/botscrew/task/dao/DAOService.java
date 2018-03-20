package com.botscrew.task.dao;

import java.sql.*;

/**
 * Created by Viktoryia_Hedz on 3/18/2018.
 */
public class DAOService {

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/university";
    private static final String user = "root";
    private static final String password = "root";

    public DAOService() {

    }

    public Connection getConnection () {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void closeConnection(Connection connection) {
        try{

            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void closeResultSet(ResultSet rs) {
        try{

            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void closePreparedStatement (PreparedStatement preparedStatement) {
        try{

            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void closeConnections (ResultSet rs, PreparedStatement preparedStatement,
                                  Connection conn)  {
        closeResultSet(rs);
        closePreparedStatement(preparedStatement);
        closeConnection(conn);
    }
}
