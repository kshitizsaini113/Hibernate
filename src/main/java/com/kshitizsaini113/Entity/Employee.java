package com.kshitizsaini113.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;
import java.util.Objects;

@Entity
public class Employee {

    @Id
    private int employeeId;

    private String employeeName;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, List<Project> projects) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.projects = projects;
    }

    @ManyToMany
    private List<Project> projects;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", projects=" + projects +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getEmployeeId() == employee.getEmployeeId() && Objects.equals(getEmployeeName(), employee.getEmployeeName()) && Objects.equals(getProjects(), employee.getProjects());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeId(), getEmployeeName(), getProjects());
    }
}
