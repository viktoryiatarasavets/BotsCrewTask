package com.botscrew.task.service;

import com.botscrew.task.dao.DepartmentStaffDAOImpl;

import java.util.List;

/**
 * Created by Viktoryia_Hedz on 3/19/2018.
 */
public class DepartmentStaffServiceImpl implements DepartmentStaffService {

    DepartmentStaffDAOImpl departmentDAO = new DepartmentStaffDAOImpl();

    //print who is the head of department
    public void showHeadOfDepartment(String name) {

        System.out.println("Head of " + name + " department is " + departmentDAO.findHeadOfDepartment(name));
    }

    ;

    //print the department statistic by lector's degree
    public void showDepartmentStatistic(String name) {
        System.out.println("assistans - " + departmentDAO.showAssistansStatistic(name));
        System.out.println("associate professors -  " + departmentDAO.showAssociateProfessorStatistic(name));
        System.out.println("professors - " + departmentDAO.showProfessorStatistic(name));
    }

    ;

    //print the average salary of lectors for the department
    public void showAverageSalaryForDepartment(String name) {
        System.out.println(departmentDAO.showAverageSalaryForDepartment(name));

    }

    ;

    //print the number of department employee
    public void showCountDepartmentEmployees(String name) {
        System.out.println(departmentDAO.countDepartmentEmployees(name));

    }

    ;

    //print search results by template
    public void showSearchResult(String searchPhrase) {

        List<String> tmp = departmentDAO.findBy(searchPhrase);
        if (tmp != null) {
            for (int i = 0; i < tmp.size(); i++) {
                if (i != (tmp.size() - 1)) {
                    System.out.print(tmp.get(i) + ", ");
                } else {
                    System.out.print(tmp.get(i));
                }

            }
        } else
        {
            System.out.println("No results available for your input");
        }


    }

    ;
}
