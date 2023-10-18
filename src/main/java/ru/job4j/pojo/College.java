package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Leo");
        student.setSecondName("Stepanich");
        student.setSurName("Petrov");
        student.setGroup("5");
        student.setEntryDate(new Date("2018/09/25"));
        System.out.println("Студент " + student.getName() + " " + student.getSecondName() + " " + student.getSurName());
        System.out.println("Числиться в группе № " + student.getGroup() + " поступил " + student.getEntryDate());

    }
}
