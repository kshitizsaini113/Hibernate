package com.kshitizsaini113.Hibernate008;

import com.kshitizsaini113.Entity.Employee;
import com.kshitizsaini113.Entity.Project;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        emp1.setEmployeeId(34);
        emp1.setEmployeeName("ABC");
        emp2.setEmployeeId(35);
        emp2.setEmployeeName("DEF");
        emp3.setEmployeeId(37);
        emp3.setEmployeeName("GHI");

        Project project1 = new Project();
        Project project2 = new Project();
        Project project3 = new Project();
        project1.setProjectId(1024);
        project1.setProjectName("XYZ");
        project2.setProjectId(3695);
        project2.setProjectName("UVW");
        project3.setProjectId(4592);
        project3.setProjectName("SGT");

        List<Employee> employeeList1 = new ArrayList<>();
        employeeList1.add(emp1);
        employeeList1.add(emp3);
        List<Employee> employeeList2 = new ArrayList<>();
        employeeList2.add(emp2);
        employeeList2.add(emp3);
        List<Employee> employeeList3 = new ArrayList<>();
        employeeList3.add(emp1);
        employeeList3.add(emp2);

        project1.setEmployees(employeeList1);
        project2.setEmployees(employeeList2);
        project3.setEmployees(employeeList3);

        List<Project> projectList1 = new ArrayList<>();
        projectList1.add(project1);
        projectList1.add(project3);
        List<Project> projectList2 = new ArrayList<>();
        projectList2.add(project2);
        projectList2.add(project3);
        List<Project> projectList3 = new ArrayList<>();
        projectList3.add(project1);
        projectList3.add(project2);

        emp1.setProjects(projectList1);
        emp2.setProjects(projectList2);
        emp3.setProjects(projectList3);

        sessionFactory.close();
    }
}
