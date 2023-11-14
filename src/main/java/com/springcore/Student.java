package com.springcore;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;

    public Student(int studentId, String name, String studentAddress) {
        this.studentId = studentId;
        this.studentName = name;
        this.studentAddress = studentAddress;
    }

    public Student() {
        super();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentNameName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
