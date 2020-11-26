package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fullName;
    private String group;
    private Date admissionDate;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public static void main(String[] args) {
        Student aynur = new Student();
        aynur.setFullName("Aynur Galimov");
        aynur.setGroup("M10");
        aynur.setAdmissionDate(new Date());

        System.out.println("Student: " + aynur.getFullName() + " " + aynur.getGroup() + " " + aynur.getAdmissionDate());
    }
}
