package com.ext.lect.operator.oops.exaple;


public class StudentServiceImpl implements StudentServiceInfc {

    @Override
    public Student addNew(String name) {
        name = name.trim();
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

    @Override
    public Student update(Student student, String updatedName) {

        if(Validator.validateName(updatedName)) {
            String newName = Validator.formatName(updatedName);
            student.setName(newName);
        }
        return student;
    }
}
