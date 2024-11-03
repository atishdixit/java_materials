package com.ext.lect.operator.oops.inher;

public abstract class Employee implements Human{

    @Override
    public void speak() {
        System.out.println("I can speak Hindi");
    }

    public abstract void work();
    public abstract void sleep();
}
