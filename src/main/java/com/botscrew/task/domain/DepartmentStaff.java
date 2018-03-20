package com.botscrew.task.domain;

/**
 * Created by Viktoryia_Hedz on 3/18/2018.
 */
public class DepartmentStaff {

    private int recordId;
    private Department departmentId;
    private Lector lectorId;
    private boolean headOfDepartment;
    private double salary;

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }

    public Lector getLectorId() {
        return lectorId;
    }

    public void setLectorId(Lector lectorId) {
        this.lectorId = lectorId;
    }

    public boolean isHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(boolean headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "DepartmentStaff{" +
                "recordId=" + recordId +
                ", departmentId=" + departmentId +
                ", lectorId=" + lectorId +
                ", headOfDepartment=" + headOfDepartment +
                ", salary=" + salary +
                '}';
    }
}
