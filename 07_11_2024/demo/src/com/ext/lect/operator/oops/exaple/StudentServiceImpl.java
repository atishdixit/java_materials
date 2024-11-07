package com.ext.lect.operator.oops.exaple;


public class StudentServiceImpl implements StudentServiceInfc {

    @Override
    public Student addNew(String name) {
        Student student = null;
        if(Validator.validateName(name)) {
            String newName = Validator.formatName(name);
            student = new Student(newName);
        }

        return student;
    }

    @Override
    public Student remove(String name) {
        return null;
    }

//    @Override
//    public Student update(String name) {
//        Student student = null;
//        if(Validator.validateName(name)) {
//            String newName = Validator.formatName(name);
//            student = new Student(newName);
//        }
//
//        return student;
//    }
}
