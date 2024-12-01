package com.ext.lect.immutable;

public class Utils {

    public static Employee getCopy(Employee employee){
        return new Employee(employee.getName(), employee.getAge(), employee.getDob(), null);
    }
}
