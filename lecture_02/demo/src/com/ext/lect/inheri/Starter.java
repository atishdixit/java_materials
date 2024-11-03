package com.ext.lect.operator.oops.inher;

public class Starter {

    public static void main(String[] args) {
//        Human human = new Human();// it interface
//        human.setName("Human");
//        System.out.println(human.getName());

        //human.work();
        System.out.println("--------------------------");
        Labor labor = new Labor();
       //
       // System.out.println(labor.getName());
        labor.speak();
        System.out.println("--------------------------");
        Engineer engineer = new Engineer();
        //engineer.setName("Er. Rahul");
       // System.out.println(engineer.getName());
        engineer.speak();
    }
}
