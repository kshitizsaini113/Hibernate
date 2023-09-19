package com.kshitizsaini113.Entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentID;
    private String studentName;
    private String studentSchool;

    public Student() {
    }

    public Student(int studentID, String studentName, String studentSchool) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentSchool = studentSchool;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSchool() {
        return studentSchool;
    }

    public void setStudentSchool(String studentSchool) {
        this.studentSchool = studentSchool;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentSchool='" + studentSchool + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getStudentID() == student.getStudentID() && Objects.equals(getStudentName(), student.getStudentName()) && Objects.equals(getStudentSchool(), student.getStudentSchool());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentID(), getStudentName(), getStudentSchool());
    }
}
