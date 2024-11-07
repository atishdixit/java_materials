package com.ext.lect.operator.oops.exaple;

public class Starter {
    public static void main(String[] args) {
//        Student student = new Student("   raHuL    ");
//        System.out.println(student.getName());
//        student.setName("CHAPMU");
//        System.out.println(student.getName());
//
//        student.setName("");
//        System.out.println(student.getName());
//
//        student.setName("fgdgdfgdfjgdkjkdfgkddgfgffgsdfkgdkgdgdsg");
//        System.out.println(student.getName());
//
//        student.setName("fgdgdfgdfjgdkj");
//        System.out.println(student.getName());

        StudentServiceImpl studentService =  new StudentServiceImpl();
        Student student = studentService.addNew("rahUL");
        System.out.println(student.getName());
    }
}
