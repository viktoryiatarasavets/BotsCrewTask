package com.botscrew.task.service;


/**
 * Created by Viktoryia_Hedz on 3/19/2018.
 */
public interface DepartmentStaffService {

    void showHeadOfDepartment (String name);

    void showDepartmentStatistic (String name);

    void showAverageSalaryForDepartment (String name);

    void showCountDepartmentEmployees (String name);

    void showSearchResult (String searchPhrase);

}
