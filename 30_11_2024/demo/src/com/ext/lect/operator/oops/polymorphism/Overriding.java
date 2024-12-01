package com.ext.lect.operator.oops.polymorphism;

import java.io.IOException;

public class Overriding {
    // Inheritance
    // Polymorphism
    // run time/ Dynamic bing
    // return type/argument type
    // you can return Child Class(B) object from overridden function if in parent class method has return type as A
    // B extends A
    // RuntimeException extends Exception;

    //Paret class
    public static void main(String[] args)  {
        A a = new A();
        Parent parent = new Parent();
        int ps = parent.sum(10,12);
        System.out.println(ps);
        parent.showName(a);

        A a1 = new B();
       // B a1 = new B();
        parent = new childClass();
        int cs = parent.sum(10,12);
        System.out.println(cs);
        parent.showName(a1);


        try {
            parent.getException();
        } catch (IOException exception) {//smaller
            exception.printStackTrace();
        }catch (Exception exception){//bigger
            //
        }


        parent.getRunTimeException();

    }
}
