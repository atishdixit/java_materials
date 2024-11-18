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
        Student student1 = studentService.addNew("rahUL1");
        Student student2 = studentService.addNew("rahUL2");
        System.out.println(student.getName()+"-Add : "+student);
        System.out.println(student1.getName()+"-Add : "+student1);
        System.out.println(student2.getName()+"-Add : "+student2);

        studentService.update(student, "rakEsh");
        System.out.println(student.getName()+"-Add : "+student);
    }
}
