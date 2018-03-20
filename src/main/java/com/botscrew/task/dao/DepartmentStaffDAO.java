package com.botscrew.task.dao;


import java.util.List;

public interface DepartmentStaffDAO {

    String findHeadOfDepartment (String name);

    int showAssistansStatistic (String name);

    int showAssociateProfessorStatistic (String name);

    int showProfessorStatistic (String name);

    double showAverageSalaryForDepartment (String name);

    int countDepartmentEmployees (String name);

    List<String> findBy (String searchPhrase);

}
