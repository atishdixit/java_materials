package com.ext.lect.operator.oops.exaple;


public interface StudentServiceInfc {
    Student addNew(String name);
    Student remove(String name);
    Student update(Student student, String name);
}
