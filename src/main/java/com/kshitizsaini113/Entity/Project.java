package com.kshitizsaini113.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;
import java.util.Objects;

@Entity
public class Project {

    @Id
    private int projectId;

    @Column(name="projectname")
    private String projectName;

    @ManyToMany
    private List<Employee> employees;

    public Project() {
    }

    public Project(int projectId, String projectName, List<Employee> employees) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.employees = employees;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", employees=" + employees +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project project)) return false;
        return getProjectId() == project.getProjectId() && Objects.equals(getProjectName(), project.getProjectName()) && Objects.equals(getEmployees(), project.getEmployees());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProjectId(), getProjectName(), getEmployees());
    }
}
