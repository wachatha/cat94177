package com.cat.demo;

public class Student {
    private Long id;
    private String studentName;
    private String studentNumber;

    public Student(String StudentName) {
        this.studentName = studentName;
    }

    public Student(String studentName, String studentNumber) {
        this.studentName = studentName;
        this.studentNumber= studentNumber;
    }

    private Student() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName= studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +

                '}';
    }
}
