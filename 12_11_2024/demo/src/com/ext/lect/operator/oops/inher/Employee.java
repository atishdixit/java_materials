package com.ext.lect.operator.oops.inher;

public abstract class Employee implements Human {

//    Employee(){
//        super();
//    }
    private int x= 20;
    //Implicitly
//    Employee(String name){
//        System.out.println(x);
//    }

    @Override
    public void speak() {
        System.out.println("I can speak Hindi");
        System.out.println(x);
    }

    public abstract void work();
    public abstract void sleep();

    void abc(){

    }
}
