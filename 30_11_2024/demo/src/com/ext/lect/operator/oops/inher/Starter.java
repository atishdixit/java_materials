package com.ext.lect.operator.oops.inher;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Starter {

    Starter(){
        super();
    }
Collection s;
    ArrayList f;
    public static void main(String[] args) {
//        Human human = new Human();// it interface
//        human.setName("Human");
//        System.out.println(human.getName());

        //human.work();
        //System.out.println("--------------------------");
       //Labor labor = new Labor();
       //
       // System.out.println(labor.getName());
        //labor.speak();
        System.out.println("--------------------------");
//        Engineer engineer = new Engineer();
//        //engineer.setName("Er. Rahul");
//       // System.out.println(engineer.getName());
//        engineer.speak();

        Labor labor1 = Labor.getLabor();
        labor1.work();
    }
}
