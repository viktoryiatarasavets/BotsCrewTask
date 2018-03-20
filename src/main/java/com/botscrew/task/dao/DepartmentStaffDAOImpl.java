package com.botscrew.task.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentStaffDAOImpl implements DepartmentStaffDAO {

    public String findHeadOfDepartment(String name) {
        String headOfDepartment = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        DAOService daoService = null;
        try {

            daoService = new DAOService();
            connection = daoService.getConnection();
            preparedStatement = connection.prepareStatement("SELECT L.LECTOR_NAME FROM DEPARTMENT_STAFF DS, LECTOR L, DEPARTMENT D WHERE L.LECTOR_ID = DS.LECTOR_ID AND DS.DEPARTMENT_ID = D.DEPARTMENT_ID AND DS.HEAD_OF_DEPARTMENT = 1 AND D.DEPARTMENT_NAME = ?");
            preparedStatement.setString(1, name);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                headOfDepartment = resultSet.getString("lector_name");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            daoService.closeConnections(resultSet, preparedStatement, connection);

        }
        return headOfDepartment;

    }

    public int showAssistansStatistic(String name) {

        int assistantStatistic = 0;

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        DAOService daoService = null;
        try {

            daoService = new DAOService();
            connection = daoService.getConnection();
            preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM DEPARTMENT_STAFF ds, LECTOR l, DEPARTMENT d, LECTOR_DEGREE ld where l.lector_ID = ds.lector_ID and ds.department_ID = d.department_ID and ld.degree_id = l.degree and ld.degree_name = 'assistant' and d.department_name = ?");
            preparedStatement.setString(1, name);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                assistantStatistic = resultSet.getInt(1);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            daoService.closeConnections(resultSet, preparedStatement, connection);

        }
        return assistantStatistic;

    }

    public int showAssociateProfessorStatistic(String name) {

        int associateProfessorStatistic = 0;

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        DAOService daoService = null;
        try {

            daoService = new DAOService();
            connection = daoService.getConnection();
            preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM DEPARTMENT_STAFF ds, LECTOR l, DEPARTMENT d, LECTOR_DEGREE ld where l.lector_ID = ds.lector_ID and ds.department_ID = d.department_ID and ld.degree_id = l.degree and ld.degree_name = 'associate professor' and d.department_name = ?");
            preparedStatement.setString(1, name);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                associateProfessorStatistic = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            daoService.closeConnections(resultSet, preparedStatement, connection);

        }
        return associateProfessorStatistic;

    }

    public int showProfessorStatistic(String name) {

        int professorStatistic = 0;

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        DAOService daoService = null;
        try {

            daoService = new DAOService();
            connection = daoService.getConnection();
            preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM DEPARTMENT_STAFF ds, LECTOR l, DEPARTMENT d, LECTOR_DEGREE ld where l.lector_ID = ds.lector_ID and ds.department_ID = d.department_ID and ld.degree_id = l.degree and ld.degree_name = 'professor' and d.department_name = ?");
            preparedStatement.setString(1, name);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                professorStatistic = resultSet.getInt(1);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            daoService.closeConnections(resultSet, preparedStatement, connection);

        }
        return professorStatistic;

    }

    public double showAverageSalaryForDepartment(String name) {
        double averageSalary = 0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        DAOService daoService = null;
        try {

            daoService = new DAOService();
            connection = daoService.getConnection();
            preparedStatement = connection.prepareStatement("SELECT AVG(DS.SALARY) AS AVERAGE FROM DEPARTMENT D, DEPARTMENT_STAFF DS WHERE DS.DEPARTMENT_ID = D.DEPARTMENT_ID AND D.DEPARTMENT_NAME = ?");
            preparedStatement.setString(1, name);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                averageSalary = resultSet.getInt(1);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            daoService.closeConnections(resultSet, preparedStatement, connection);

        }
        return averageSalary;
    }

    public int countDepartmentEmployees(String name) {
        int countOfEmployees = 0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        DAOService daoService = null;
        try {

            daoService = new DAOService();
            connection = daoService.getConnection();
            preparedStatement = connection.prepareStatement("SELECT COUNT(*) AS TOTAL FROM DEPARTMENT_STAFF DS, DEPARTMENT D WHERE DS.DEPARTMENT_ID = D.DEPARTMENT_ID AND D.DEPARTMENT_NAME = ?");
            preparedStatement.setString(1, name);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                countOfEmployees = resultSet.getInt(1);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            daoService.closeConnections(resultSet, preparedStatement, connection);

        }
        return countOfEmployees;

    }

    public List<String> findBy(String searchPhrase) {
        List<String> searchResult = new ArrayList<String>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        DAOService daoService = null;
        try {

            daoService = new DAOService();
            connection = daoService.getConnection();
            preparedStatement = connection.prepareStatement("SELECT D.DEPARTMENT_NAME AS FOUND FROM DEPARTMENT D WHERE D.DEPARTMENT_NAME LIKE ? UNION SELECT L.LECTOR_NAME AS FOUND FROM LECTOR L WHERE L.LECTOR_NAME  LIKE ? UNION SELECT LD.DEGREE_NAME AS FOUND FROM LECTOR_DEGREE LD WHERE LD.DEGREE_NAME LIKE ?");
            preparedStatement.setString(1, "%" + searchPhrase + "%");
            preparedStatement.setString(2, "%" + searchPhrase + "%");
            preparedStatement.setString(3, "%" + searchPhrase + "%");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                searchResult.add(resultSet.getString("FOUND"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            daoService.closeConnections(resultSet, preparedStatement, connection);

        }
        return searchResult;
    }


}
